package com.hspedu.Map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author jacky
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class MapExercise {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put(1,new Emp("Jack",300000,1));
        hashMap.put(2,new Emp("Tom",21000,2));
        hashMap.put(3,new Emp("millan",12000,3));

        Set keySet = hashMap.keySet();
        for (Object key :keySet) {
            Object emp = hashMap.get(key);
            Emp emp1 = (Emp) emp;
            if (emp1.getSal()>18000){
                System.out.println(emp1);
            }
        }

        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            Map.Entry entry = (Map.Entry) next;
            Object value = entry.getValue();
            Emp emp = (Emp) value;
            if (emp.getSal()>18000){
                System.out.println(emp);
            }
        }

    }
}

class Emp{
    private String name;
    private double sal;
    private int id;

    public Emp(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}
