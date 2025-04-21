package kanban.kanban_board;

import static kanban.kanban_board.persistence.config.ConnectionConfig.getConnection;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import kanban.kanban_board.persistence.migration.MigrationStrategy;

@SpringBootApplication
public class Main {

	public static void main(String[] args) throws SQLException{
		try (var connection = getConnection()) {
			new MigrationStrategy(connection).executeMigration();
		}
	}

}
