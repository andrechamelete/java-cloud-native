package java_restful.java_restful_api.domain.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import java_restful.java_restful_api.domain.model.User;
import java_restful.java_restful_api.domain.repository.UserRepository;
import java_restful.java_restful_api.domain.service.UserService;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account Number already exists!");
        }
        return userRepository.save(userToCreate);
    }

    @Override
    public User findById(long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }   
}
