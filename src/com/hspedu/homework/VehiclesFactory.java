package com.hspedu.homework;

/**
 * @author jacky
 * @version 1.0
 */
public class VehiclesFactory {

    private static Horse horse = new Horse();//饿汉式
    private VehiclesFactory(){}
    public static Horse getHorse(){
        //return new Horse();
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }
}
