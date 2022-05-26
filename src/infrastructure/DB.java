package infrastructure;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

    private static Connection connection = null;

    static {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/test",
                    "postgres", "123");
            if(connection != null) {
                System.out.println("Connected!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
    }


    public static Connection getInstance() {
        return connection;
    }
}
