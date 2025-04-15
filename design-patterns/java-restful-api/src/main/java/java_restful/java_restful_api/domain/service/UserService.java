package java_restful.java_restful_api.domain.service;

import java_restful.java_restful_api.domain.model.User;

public interface UserService {
    
    User findById(long id);

    User create(User userToCreate);
}
