package dao;

import infrastructure.DB;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private final Connection connection;

    public UserDaoImpl() {
        connection = DB.getInstance();
    }

    @Override
    public boolean add(User user) throws SQLException {
        String sql = "INSERT INTO users(id, name) VALUES (?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, String.valueOf(user.getId()));
            preparedStatement.setString(2, user.getName());
            return preparedStatement.execute();
        }
    }

    @Override
    public void delete(Long id) throws SQLException {
        String sql = "delete from users where id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, String.valueOf(id));
            preparedStatement.execute();
        }
    }

    @Override
    public User getUser(Long id) throws SQLException {
        String sql = "SELECT * FROM users where id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, String.valueOf(id));
            ResultSet resultSet = preparedStatement.executeQuery();
            return parseResultSetToUser(resultSet);
        }
    }

    @Override
    public List<User> getUsers() throws SQLException {
        String sql = "SELECT * FROM users";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            List<User> users = new ArrayList<>();
            while (resultSet.next()) {
                users.add(parseResultSetToUser(resultSet));
            }
            return users;
        }
    }

    @Override
    public void update(User user) throws SQLException {
        String sql = "UPDATE users SET name = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, String.valueOf(user.getId()));
            preparedStatement.execute();
        }
    }

    public User parseResultSetToUser(ResultSet resultSet) throws SQLException {
        User user = new User();
        user.setId(resultSet.getLong("id"));
        user.setName(resultSet.getString("name"));
        return user;
    }
}
