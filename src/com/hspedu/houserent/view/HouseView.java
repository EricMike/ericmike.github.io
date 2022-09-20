package com.hspedu.houserent.view;

import com.hspedu.houserent.domain.House;
import com.hspedu.houserent.service.HouseService;
import com.hspedu.houserent.utils.Utility;

public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    private HouseService houseService = new HouseService(2);

    public void update() {
        System.out.println("========修改房屋信息========");
        System.out.println("请选择待修改房屋编号(-1表示退出)");
        int updateId = Utility.num();
        if (updateId == -1) {
            System.out.println("========已放弃修改房屋信息========");
            return;
        }
        House house = houseService.findById(updateId);
        if (house == null) {
            System.out.println("========修改房屋信息编号不存在。。========");
            return;
        }
        System.out.print("姓名(" + house.getName() + "): ");
        String name = Utility.read();
        if (!"".equals(name)) {
            house.setName(name);
        }
        System.out.print("电话(" + house.getPhone() + "): ");
        String phone = Utility.read();
        if (!"".equals(phone)) {
            house.setPhone(phone);
        }
        System.out.print("地址(" + house.getAddress() + "): ");
        String address = Utility.read();
        if (!"".equals(address)) {
            house.setAddress(address);
        }
        System.out.println("租金(" + house.getRent() + "): ");
        int rent = Utility.num();
        if (rent != -1) {
            house.setRent(rent);
        }
        System.out.println("状态(" + house.getState() + "): ");
        String state = Utility.read();
        if (!"".equals(state)) {
            house.setState(state);
        }
        System.out.println("========修改房屋信息成功！========");
    }

    public void findHouse() {
        System.out.println("========查找房屋信息========");
        System.out.println("请输入要查找的id: ");
        int findId = Utility.num();
        House house = houseService.findById(findId);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("========查找房屋信息id不存在========");
        }
    }

    public void exit() {
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }

    public void delHouse() {
        System.out.println("========删除房屋信息========");
        System.out.print("请输入待删除房屋的编号(-1退出):");
        int delId = Utility.num();
        if (delId == -1) {
            System.out.println("========放弃删除房屋信息========");
            return;//代表结束一个方法
        }
        //System.out.println("请确认是否删除(Y/N),小心选择:");
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            if (houseService.del(delId)) {
                System.out.println("========删除房屋信息成功========");
            } else {
                System.out.println("========房屋编号不存在，删除失败========");
            }
        } else {
            System.out.println("========放弃删除房屋信息========");
        }
    }


    public void addHouse() {
        System.out.println("========添加房屋========");
        System.out.print("姓名: ");
        String name = Utility.read();
        System.out.print("电话: ");
        String phone = Utility.read();
        System.out.print("地址: ");
        String address = Utility.read();
        System.out.print("月租: ");
        int rent = Utility.num();
        System.out.print("状态: ");
        String state = Utility.read();
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)) {
            System.out.println("========添加房屋成功========");
        } else {
            System.out.println("========添加房屋失败========");
        }
    }

    public void listHouses() {
        System.out.println("========房屋列表========");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("========房屋列表显示完毕========");
    }

    //显示主菜单
    public void mainMenu() {
        do {
            System.out.println("\n========房屋出租系统菜单========");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退      出");
            System.out.println("请输入你的选择(1-6): ");
            key = Utility.Input();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    update();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
            }
        } while (loop);
    }
}