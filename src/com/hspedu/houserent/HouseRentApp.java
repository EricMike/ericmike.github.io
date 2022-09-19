package com.hspedu.houserent;

import com.hspedu.houserent.domain.House;
import com.hspedu.houserent.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
        new HouseView().mainMenu();
        System.out.println("===你退出房屋出租系统===");
    }
}
