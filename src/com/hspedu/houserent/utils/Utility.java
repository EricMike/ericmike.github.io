package com.hspedu.houserent.utils;

import java.util.Scanner;

public class Utility {
    public static char Input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }

    public static String read() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static int num() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static char readConfirmSelection() {
        System.out.println("请确认是否删除(Y/N),小心选择:");
        char c;
        for (; ; ) {//无限循环
            c = Utility.Input();
            if (c == 'Y' || c == 'N') {
                break;//当输入字符为Y或者N时跳出当前循环
            } else {
                System.out.println("选择错误,请重新输入: ");
            }
        }
        return c;
    }

    public static String readString(int limit, String defaultValue) {
        String str = readKeyBoard(limit, true);
        return str.equals("") ? defaultValue : str;
    }

    private static String readKeyBoard(int limit, boolean blankReturn) {
        String line = "";
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.length() == 0) {
                if (blankReturn) return line;
                else continue;
            }
            if (line.length() < 1 || line.length() > limit) {
                System.out.println("输入长度（不能大于" + limit + "）错误，请重新输入：");
                continue;
            }
            break;
        }
        return line;
    }
}
