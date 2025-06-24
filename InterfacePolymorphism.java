interface Animal{
    void sound();
    void walk();
}

class Dog implements Animal{
    public void sound(){
        System.err.println("Bhao bhao...");
    }
    public void Bark(){
        System.out.println("Barking...");
    }
    public void walk(){
        System.out.println("Walking...");
    }
} 

class Cat extends Dog implements Animal{
    public void sound(int a){
        System.err.println("Mew Mew...");
    }
    public void Mew(){
        System.out.println("Meowing...");
    }
    public void Jump(){
        System.out.println("Jumping...");
    }
}

public class InterfacePolymorphism {
    public static void main(String[] args) {
        Dog d = new Cat();
        d.Bark();
        d.walk();
        d.sound();
        
    //  d.Mew(); --error because reference is Dog
    //  d.Jump();  --error because reference is Dog
    }
}

