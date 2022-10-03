package houserentsystem;

import houserentsystem.view.HouseView;

/**
 * 整个程序入口
 *
 * */
public class HouseRentApp {
    public static void main(String[] args) {
        new HouseView().mainMenu();
        System.out.println("====你退出房屋出租系统======");
    }

}
