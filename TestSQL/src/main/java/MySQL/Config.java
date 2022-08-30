package MySQL;

import java.sql.Connection;
import java.sql.Statement;

public class Config {
    public static final String LOGIN ="root" ;
    public static final String PASSWORD = "admin";
    public static final String URL = "jdbc:mysql://localhost:3306/mydmtest";
    public static Connection connection;
    public static Statement statement;
}
