package dao;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    public void add(User user)
        throws SQLException;
    public void delete(Long id)
        throws SQLException;
    public User getUser(Long id)
        throws SQLException;
    public List<User> getUsers()
        throws SQLException;
    public void update(User user)
        throws SQLException;
}
