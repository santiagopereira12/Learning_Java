package motor.regla.banca.service;

import motor.regla.banca.domain.user.User;
import motor.regla.banca.repository.UserRepository;

public class RegisterService {
    private final UserRepository userRepository;

    public RegisterService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registreMassUsers(){
        userRepository.massRegistration(new User("Carlos", 30, 1001));
        userRepository.massRegistration(new User("Laura", 25, 1002));
        userRepository.massRegistration(new User("Andrés", 40, 1003));
        userRepository.massRegistration(new User("María", 35, 1004));
        userRepository.massRegistration(new User("Santiago", 24, 1005));

        System.out.println("Usuarios Cargados");
    }

    public User createUser(User user){
        userRepository.save(user);
        return user;
    }

    public User login(int document){
        User user = userRepository.findByDocument(document);

        if (user == null){
            throw new IllegalArgumentException("User not Found");
        }
        return user;
    }
}
