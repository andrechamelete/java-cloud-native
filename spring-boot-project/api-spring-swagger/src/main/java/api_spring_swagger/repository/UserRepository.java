package api_spring_swagger.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import api_spring_swagger.handler.CampoObrigatorioException;
import api_spring_swagger.model.Usuario;

@Repository
public class UserRepository {
    public void save(Usuario usuario){
        if(usuario.getLogin()==null) {
            throw new CampoObrigatorioException("login");
        }
        if(usuario.getPassword()==null) {
            throw new CampoObrigatorioException("password");
        }
        if(usuario.getId()==null) {
            System.out.println("SAVE - recebendo o usuário na camada de repositorio");
        } else {
            System.out.println("UPDATE - recebendo o usuário na camada de repositorio");
        }
        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - recebendo o id: %d para excluir um usuario", id));
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - listando os usuarios do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("andre", "pass"));
        usuarios.add(new Usuario("chame", "word"));
        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.println(String.format("FIND/id - recebendo o id: %d para localizar um usuario", id));
        return new Usuario("andre", "pass");
    }

    public Usuario findByUsername(String username) {
        System.out.println(String.format("FIND/id - recebendo o username: %s para localizar um usuario", username));
        return new Usuario("chame", "word");
    }
}
