class Base{
    public Base(){
        System.out.println("Hey This Is Me Base");
    }
} 
class Derived extends Base{
    public Derived(){
        System.out.println("Hey This Is Me Derived");
    }
    public Derived(int a,int b,int c){
        
        System.out.println("Hey its me " + b);
    }
}
class Child extends Derived{
    public Child(){
        System.out.println("Hey This Is Me Child");
    }
    public Child(int a,int b){
        super(0,1,2);
        System.out.println("Hey its me " + a);
    }
}

    
public class ConstructorsInInheritance {
    public static void main(String[] args) {
        Child c = new Child(1,2);
        Child c1 = new Child();
    }
}
