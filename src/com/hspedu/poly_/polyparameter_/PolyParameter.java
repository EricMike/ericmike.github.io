package com.hspedu.poly_.polyparameter_;

public class PolyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("Tom", 2500);
        Manager milian = new Manager("milian", 5000, 200000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(tom);
        polyParameter.showEmpAnnual(milian);
        polyParameter.testWork(tom);
        polyParameter.testWork(milian);
    }
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }
    public void testWork(Employee e){
        if (e instanceof Worker){
            Worker worker = (Worker)e;
            worker.work();
        }else if (e instanceof Manager){
            Manager manager = (Manager)e;
            manager.manage();
        }else {
            System.out.println("不做处理");
        }
    }
}
