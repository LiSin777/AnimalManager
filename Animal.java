package Animal;

import java.util.Objects;

//动物抽象父类
public abstract class Animal {
    private String type;
    private String name;
    private int age;
    private String sex;

    public Animal() {
    }

    public Animal(String type, String name, int age, String sex) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public abstract void eating();


    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
