package com.hspedu.homework;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author jacky
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework07 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new person("Tom",1000));
        hashSet.add(new person("simth",2000));
        hashSet.add(new person("Mike",3000));
    }
}
class person{
    public String name;
    public int id;

    public person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
