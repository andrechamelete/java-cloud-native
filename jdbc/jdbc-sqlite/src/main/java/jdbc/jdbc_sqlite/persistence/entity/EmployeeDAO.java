package jdbc.jdbc_sqlite.persistence.entity;

import java.sql.SQLException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import jdbc.jdbc_sqlite.persistence.ConnectionUtil;

public class EmployeeDAO {
    
    public void insert(final EmployeeEntity entity) {
        try(
            var connection = ConnectionUtil.getConnection();
            var statement = connection.createStatement();
            
            ) {
                var sql = "INSERT INTO employees (name, salary, birthday) values ('" + 
                    entity.getName() + "', " + 
                    entity.getSalary().toString() + ", " +
                    formatOffsetDateTime(entity.getBirthday()) + 
                    " )";

                statement.executeUpdate(sql);
                

        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void update(final EmployeeEntity entity) {

    }

    public void delete(final EmployeeEntity entity) {

    }

    public List<EmployeeEntity> findAll() {
        return null;
    }
    
    public EmployeeEntity findById(final long id) {
        return null;
    }

    private String formatOffsetDateTime(final OffsetDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
