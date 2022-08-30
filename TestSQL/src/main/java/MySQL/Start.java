package MySQL;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import static MySQL.Config.*;


public class Start {


    public static void main(String[] args) {

        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);

            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);

        } catch (SQLException e) {
            System.out.println("Соединение с БД не установлено");
        }
        try {
            statement = connection.createStatement();
            statement.execute("insert users (name, age, email) value ('Vasilii', 42, 'Vasilii@mail.ru')");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}



