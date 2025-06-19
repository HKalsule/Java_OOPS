package com.company;
class Employee{
    int id;
    String name;
    float Salary;

    public void EmployeeDetail(){
        System.out.println("My ID is : " + id);
        System.out.println("My Name Is : " + name);
        System.out.println("My Salary Is : " + Salary + "\n");
    }
    public float Salary(){
        System.out.println(name + " Salary Is : " + Salary + "\n");
        return Salary;
    }
}
public class JavaClass {
    public static void main(String[] args) {
        System.out.println("This Is My First Class \n");
        Employee Hardik = new Employee();
        Hardik.id = 1;
        Hardik.name = "Hardik";
        Hardik.Salary = 100;
        Employee HardikAgain = new Employee();
        HardikAgain.id = 2;
        HardikAgain.name = "Hardik 2.0";
        HardikAgain.Salary = 200;

        /* 
        System.out.println(Hardik.id);
        System.out.println(Hardik.name);
        System.out.println(Hardik.Salary);
        */

        Hardik.EmployeeDetail();
        HardikAgain.EmployeeDetail();
        Hardik.Salary();
        HardikAgain.Salary();

    }
}
