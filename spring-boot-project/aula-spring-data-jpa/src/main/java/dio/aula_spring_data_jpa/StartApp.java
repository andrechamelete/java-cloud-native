package dio.aula_spring_data_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula_spring_data_jpa.model.User;
import dio.aula_spring_data_jpa.repository.UserRepository;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(">>> Buscando usuários que contenham 'GLEYSON'...");
        List<User> users = repository.findByNameContaining("GLEYSON");
        for(User u: users){
            System.out.println(u);
        }
    }

    private void insertUser(){
        User user = new User();
        user.setName("GABRIEL NUNES");
        user.setUsername("gabriel");
        user.setPassword("santos");
        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}