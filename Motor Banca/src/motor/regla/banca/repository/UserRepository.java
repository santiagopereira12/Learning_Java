package motor.regla.banca.repository;

import motor.regla.banca.domain.user.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public void save(User user){
        users.add(user);
        System.out.println("Usuario Agregado "+users);
    }

    public List<User> getUsers() {
        return users;
    }
}
