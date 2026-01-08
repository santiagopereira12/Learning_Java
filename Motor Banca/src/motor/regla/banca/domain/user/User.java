package motor.regla.banca.domain.user;

public class User {
    private String name;
    private int age;
    private int document;

    public User(String name, int age, int document) {
        this.name = name;
        this.age = age;
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getDocument() {
        return document;
    }

    @Override
    public String toString (){
        return "\nName: " +name+
                "\nAge: " +age+ " Years old.";
    }
}
