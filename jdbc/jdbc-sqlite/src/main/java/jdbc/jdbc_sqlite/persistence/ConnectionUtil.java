package jdbc.jdbc_sqlite.persistence;

import lombok.NoArgsConstructor;
import static lombok.AccessLevel.PRIVATE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


@NoArgsConstructor(access = PRIVATE)
public class ConnectionUtil {
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:C:/Users/chame/Desktop/GitHub/java-cloud-native/jdbc/db");
    }
}
