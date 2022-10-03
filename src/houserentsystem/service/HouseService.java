package houserentsystem.service;

import houserentsystem.domain.House;

/**【业务层】
 * 1、响应HouseService的调用
 * 2、完成对房屋信息的各种操作（crud增删改查）
 *
 * */
public class HouseService {

    //建立一个房间列表来保存房间对象
    private House[] houses;
    //設定现在的当前房屋数量的变量
    private int houseNums=1;
    //由于房屋id是一个自增的
    private  int idCounter=1;

    public HouseService(int size) {
        //初始化房屋列表数组
        houses=new House[size];
        //配合测试
        houses[0]=new House(1,"jack","112","海淀区",2000,"未租出");
    }
    //取得房屋数组，返回至view页面
    public House[] list(){
        return houses;
    }

    //add方法，添加新对象返回boolean
    public boolean add(House newHouse){
        //是否可以增加一個房子信息
        //数组以及满了，不能再添加
        if(houseNums==houses.length){
            System.out.println("数组已经满了，不能再添加了");
            return false;
        }
        //将新元素添加
        houses[houseNums]=newHouse;
        houseNums++;
        //　对自增id的处理
        idCounter++;
        newHouse.setId(idCounter);
        return true;
    }

}
