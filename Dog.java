package Animal;
public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String type, String name, int age, String sex) {
        super(type, name, age, sex);
    }

    @Override
    public void eating() {
        System.out.println("狗狗爱骨头！");
    }

    @Override
    public String toString() {
        return getType() + "    " + getName() + "   " + getAge() + "    " + getSex();
    }
}
