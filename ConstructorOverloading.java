class MyEmployee{
    private int id;
    private String name;

    // Constructors
    public MyEmployee(){
        id = 0;
        name = "NoName";
    }

    // Constructor Overloading
    public MyEmployee(int n,String a){
        this.id = n;
        this.name = a;
    }

    public void setId(int a){
        this.id = a;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
}
 public class ConstructorOverloading{
    public static void main(String[] args){
        MyEmployee Hardik = new MyEmployee();
        System.out.println("Your Default Id is : " + Hardik.getId());
        System.out.println("Your Default Name is : " + Hardik.getName());
        System.out.println();

        MyEmployee HARDIK = new MyEmployee(1,"HARDIK");
        System.out.println("Your Saved Id is : " + HARDIK.getId());
        System.out.println("Your Saved Name is : " + HARDIK.getName());
        System.out.println();
   }
}
