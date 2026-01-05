package motor.regla.banca.user;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int age;

    private static List<User> listUser = new ArrayList<>();

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void addUser(String name, int age){
        User user = new User(name, age);
        listUser.add(user);
        System.out.println("Added User: "+user);
    }

    @Override
    public String toString (){
        return "\nName: " +name+
                "\nAge: " +age+ " Years old.";
    }
}
