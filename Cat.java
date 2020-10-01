package Animal;
public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String type, String name, int age, String sex) {
        super(type, name, age, sex);
    }

    @Override
    public void eating() {
        System.out.println("猫猫爱吃鱼！");
    }

    @Override
    public String toString() {
        return getType() + "    " + getName() + "   " + getAge() + "    " + getSex();
    }
}
