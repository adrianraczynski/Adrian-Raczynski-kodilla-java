package zadanieAllegro;

import java.util.Objects;

public class User {

    private String name;
    private String userName;
    private String nickName;
    private int age;

    public User(String name, String userName, String nickName, int age) {
        this.name = name;
        this.userName = userName;
        this.nickName = nickName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getNickName() {
        return nickName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(nickName, user.nickName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, userName, nickName, age);
    }
}
