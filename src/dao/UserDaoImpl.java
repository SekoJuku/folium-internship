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
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, String.valueOf(user.getId()));
        preparedStatement.setString(2, user.getName());
        boolean execute = preparedStatement.execute();
        preparedStatement.close();
        return execute;
    }

    @Override
    public void delete(Long id) throws SQLException {
        String sql = "delete from users where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, String.valueOf(id));
        preparedStatement.execute();
        preparedStatement.close();
    }

    @Override
    public User getUser(Long id) throws SQLException {
        String sql = "SELECT * FROM users where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, String.valueOf(id));
        ResultSet resultSet = preparedStatement.executeQuery();
        preparedStatement.close();
        return parseResultSetToUser(resultSet);
    }

    @Override
    public List<User> getUsers() throws SQLException {
        String sql = "SELECT * FROM users";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<User> users = new ArrayList<>();
        while (resultSet.next()) {
            users.add(parseResultSetToUser(resultSet));
        }
        preparedStatement.close();
        return users;
    }

    @Override
    public void update(User user) throws SQLException {
        String sql = "UPDATE users SET name = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, String.valueOf(user.getId()));
        preparedStatement.execute();
        preparedStatement.close();
    }

    public User parseResultSetToUser(ResultSet resultSet) throws SQLException {
        User user = new User();
        user.setId(resultSet.getLong("id"));
        user.setName(resultSet.getString("name"));
        return user;
    }
}
