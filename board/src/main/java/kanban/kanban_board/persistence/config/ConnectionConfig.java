package kanban.kanban_board.persistence.config;

import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public final class ConnectionConfig {
    
    public static Connection getConnection() throws SQLException {
        var url = "jdbc:mysql://localhost/board";
        var connection = DriverManager.getConnection(url, "root", "brucea");
        connection.setAutoCommit(false);
        return connection;
    }
}
