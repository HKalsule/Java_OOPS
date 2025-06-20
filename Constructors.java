class MyEmployee{
    private int id;
    private String name;

    // Constructors
    public MyEmployee(){
        id = 0;
        name = "NoName";
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
 public class Constructors {
    public static void main(String[] args){
        MyEmployee Hardik = new MyEmployee();
        System.out.println("Your Default Id is : " + Hardik.getId());
        System.out.println("Your Default Name is : " + Hardik.getName());
    }
}
