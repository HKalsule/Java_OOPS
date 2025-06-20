class MyEmp{
    private int id;
    private String name;

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
 public class GettersSetters{
    public static void main(String[] args){
        
        MyEmp Hardik = new MyEmp();
        Hardik.setId(1);
        Hardik.setName("Hardik");

        System.out.println("Your Id Is : " + Hardik.getId());
        System.out.println("Your Id Is : " + Hardik.getName());

    }    
}
