package Animal;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//功能实现类
public class Manager {
    public static ArrayList<Animal> animals = new ArrayList<Animal>();
    Scanner sc = new Scanner(System.in);

    static {
        animals.add(new Dog("狗" , "初始者1" , 0 , "male"));
        animals.add(new Dog("狗" , "初始者2" , 0 , "male"));
        animals.add(new Dog("狗" , "初始者3" , 0 , "male"));
    }

    //添加
    public void Add(){
        String name , type , sex;
        int age;
        System.out.print("请输入小可爱的品种：");
        type = sc.nextLine();
        System.out.print("请输入小可爱的名字：");
        name = sc.nextLine();
        System.out.print("请输入小可爱的性别：");
        sex = sc.nextLine();
        System.out.print("请输入小可爱的年龄：");
        age = sc.nextInt();
        sc.nextLine();

        if("狗".equals(type)){
            animals.add(new Dog(type , name , age , sex));
        }
        else if("猫".equals(type)){
            animals.add(new Cat(type , name , age , sex));
        }
        else {
            System.out.println("添加失败！");
        }


    }

    //打印
    public void Print(){
        System.out.println("品种   姓名   年龄   雌雄  喜好");
        for (Animal animal : animals) {
            System.out.print(animal + "   ");
            animal.eating();
        }
    }

    //删除
    public void Delete(){
        System.out.print("请输入要删除宠物姓名：");
        String name = sc.nextLine();
        for (int i = 0; i < animals.size(); i++) {
            if(name.equals(animals.get(i).getName())){
                animals.remove(i);
                System.out.println("删除成功！");
            }
        }
    }

    //修改
    public void Modify(){
        System.out.print("请输入要修改的宠物名：");
        String name = sc.nextLine();
        for (int i = 0; i < animals.size(); i++) {
            if(name.equals(animals.get(i).getName())){
                System.out.print("请输入修改后的姓名：");
                animals.get(i).setName(sc.nextLine());
                System.out.print("请输入修改后的年龄：");
                animals.get(i).setAge(sc.nextInt());
                sc.nextLine();
                System.out.print("请输入修改后的性别：");
                animals.get(i).setSex(sc.nextLine());

                System.out.println("修改成功！");
            }
        }
    }

    //升序
    public void Sort(){
        Collections.sort(animals , new Comparator<Animal>(){
                    @Override
                    public int compare(Animal o1, Animal o2) {
                        return o1.getAge() - o2.getAge();
                    }
                }
        );
        Print();
    }

    //查找
    public void Query(){
        System.out.print("请输入需要查询的宠物姓名：");
        String name = sc.nextLine();
        boolean flag = false;
        for (Animal animal : animals) {
            if(name.equals(animal.getName())){
                System.out.println(animal);
                flag = true;
            }
        }
        if(!flag){
            System.out.println("查找失败！");
        }

    }
}
