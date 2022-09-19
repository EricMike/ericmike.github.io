package com.hspedu.homework;

/**
 * @author jacky
 * @version 1.0
 */
public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver() {
        //if (vehicles==null){
        if (!(vehicles instanceof Boat)){
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }

    public void common() {
        if (vehicles == null) {
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();
    }
}
