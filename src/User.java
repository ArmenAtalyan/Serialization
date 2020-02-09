import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private int age;
    private transient String password;
    private String gender;
    private boolean isServe;
    private static final long serialVersionUID = 1L;

    public User(String name, int age, String password, String gender) {
        this.name = name;
        this.age = age;
        this.password = password;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public boolean isServe() {
        if (gender.equals("man"))
            return true;
        else if (gender.equals("woman"))
            return false;
        return isServe;
    }

    @Override
    public String toString() {
        return "name= " + name +
                ", age= " + age +
                ", password= " + password;
    }
}
