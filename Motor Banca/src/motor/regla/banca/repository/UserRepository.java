package motor.regla.banca.repository;

import motor.regla.banca.domain.user.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static final List<User> users = new ArrayList<>();

    public void save(User user){
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public void massRegistration(User user){
        users.add(user);
    }

    public User findByDocument(int document){
        for (User user : users){
            if (user.getDocument() == document){
                return user;
            }
        }
        return null;
    }
}
