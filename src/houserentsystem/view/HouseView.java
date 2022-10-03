package houserentsystem.view;

import houserentsystem.domain.House;
import houserentsystem.service.HouseService;

import java.util.Scanner;

/**【界面层】
 * 1、显示界面
 * 2、接受用户的输入
 * 3、调用HouseService完成对房屋的操作
 * */
public class HouseView {

    //设置控制菜单的变量
    private boolean loop=true;
    //接收用户选择
    private  char key=' ';
    private HouseService houseService=new HouseService(10);
    Scanner scanner=new Scanner(System.in);


    //房屋一览的显示
    public void listHouses(){
        //接收service返回来的房屋list
        House[] houses=houseService.list();
        //遍历显示
        System.out.println("=======房屋列表=======");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        for(int i=0;i<houses.length;i++) {
            if(houses[i]==null){
                //如果是空则跳过
                continue;
            }
            System.out.println(houses[i].toString());

        }

    }
    //添加房屋方法
    public void addHouse(){
        System.out.println("=========添加房屋=========");
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入姓名：");
        String name= scanner.next();
        System.out.println("输入电话：");
        String phone= scanner.next();
        System.out.println("输入地址：");
        String address= scanner.next();
        System.out.println("输入月租：");
        int rent= scanner.nextInt();
        System.out.println("输入状态：");
        String state= scanner.next();
        //创建一个新的house对象，id是系统分配
        House newHouse = new House(0,name,phone,address,rent,state);

        if(houseService.add(newHouse)){
            System.out.println("添加房屋成功！");
        }else{
            System.out.println("添加房屋失败！");
        }
        listHouses();

    }

    //菜单的创建
    public void mainMenu(){
        listHouses();
        //界面显示逻辑
        do {
            System.out.println("========房屋出租系统菜单=========");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退 出");
            System.out.println("\t\t\t请输入你的选择(1-6):");
            //int行转字符

            key=(Integer.toString(scanner.nextInt())).charAt(0);
            switch (key){
                case '1':
                    System.out.println("新 增");
                    addHouse();
                    break;
                case '2':
                    System.out.println("查 找");
                    break;
                case '3':
                    System.out.println("删 除");
                    break;
                case '4':
                    System.out.println("修 改");
                    break;
                case '5':
                    System.out.println("列表");
                    break;
                case '6':
                    System.out.println("退 出");
                    loop=false;
                    break;

            }
        }while (loop);

    }

}
