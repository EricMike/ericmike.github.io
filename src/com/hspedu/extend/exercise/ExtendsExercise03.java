package com.hspedu.extend.exercise;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        PC pc = new PC("intel",16,500,"IBM");
        pc.printInfo();
        NotePad notePad = new NotePad("技嘉",8,1000,"玫瑰金");
        notePad.printInfo();
    }
}
