package usa.edu.mum.asd.labs.lab7.flyweight;

import java.time.LocalDate;

public class HealthProfile {

    private int id;
    private LocalDate birthday;
    private int age;
    private boolean sex;

    public HealthProfile(int id, LocalDate birthday, int age, boolean sex) {
        this.id = id;
        this.birthday = birthday;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "HealthProfile{" +
                "id=" + id +
                ", birthday=" + birthday +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
