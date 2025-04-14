package java_restful.java_restful_api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java_restful.java_restful_api.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
