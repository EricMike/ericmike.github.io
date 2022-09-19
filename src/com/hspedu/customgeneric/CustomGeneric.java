package com.hspedu.customgeneric;

/**
 * @author jacky
 * @version 1.0
 */
public class CustomGeneric {
    public static void main(String[] args) {
        t[] values = t.values();
        for (t o :values) {
            System.out.println(o.ordinal());
        }


    }
}
enum t{
    SUMMER,
    WINTER
}


class Tiger<T,R,M>{
    String name;
    R r;
    M m;
    T t;
    T[] ts;

    public Tiger(String name, R r, M m, T t) {
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
