package Animal;

import java.util.Scanner;
//菜单类
public class Menu {

    public void Welcome(Manager manager) throws OverFlowException {
        System.out.println("");
        System.out.println("-------------------欢迎来到动物管理局--------------------------");
        System.out.println("------              1. 查看所有动物                      -----");
        System.out.println("------              2. 添加动物                         -----");
        System.out.println("------              3. 删除动物                         -----");
        System.out.println("------              4. 修改动物属性                      -----");
        System.out.println("------              5. 按年龄排序输出                    -----");
        System.out.println("------              6. 查询                            -----");
        System.out.println("------              7. 退出                            -----");
        System.out.println("------------------------------------------------------------");
        System.out.print("请输入您的选择：");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();



        switch (choice) {
            case "1":
                //查看所有动物信息
                manager.Print();
                break;
            case "2":
                //添加动物
                manager.Add();
                break;
            case "3":
                //删除动物
                manager.Delete();
                break;
            case "4":
                //修改动物信息
                manager.Modify();
                break;
            case "5":
                //将动物按年龄降序打印
                manager.Sort();
                break;
            case "6":
                //查找动物
                manager.Query();
                break;
            case "7":
                //退出登录
                System.out.println("                     感谢您的使用                               ");
                System.exit(0);
                break;
            default:
                //抛出异常
                throw new OverFlowException("无此选项！");

        }

    }

}
