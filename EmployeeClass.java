import java.util.Scanner;
class Employe{
    int salary;
    String name;

    public int getSalary() {
        System.out.println("Your Salary is : ");
        return salary;
    }

    public String getName() {
        System.out.println("Your Name is : ");
        return name;
    }

    public void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?? ");
        this.name = sc.nextLine();
        System.out.println("Your Updated Name is : " + this.name + "\n");
    }
}

public class EmployeeClass {
    public static void main(String[] args) {
        Employe Hardik = new Employe();
        Hardik.salary = 100;
        Hardik.name = "Hardik";

        System.out.println(Hardik.getSalary());
        System.out.println(Hardik.getName());

        Hardik.setName();  
        System.out.println(Hardik.getName());
    }
}