import dao.UserDaoImpl;
import model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        User user = new User(2L, "Ulan");
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.add(user);

        userDao.getUsers().forEach(System.out::println);

        System.out.println(userDao.getUser(2L));

        userDao.delete(2L);
    }
}
