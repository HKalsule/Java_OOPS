class Dog{
    public void Bark(){
        System.out.println("Barking...");
    }
    public void Walk(){
        System.out.println("Walking...");
    }
} 

class Cat extends Dog{
    public void Mew(){
        System.out.println("Meowing...");
    }
    public void Jump(){
        System.out.println("Jumping...");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Dog d = new Cat();
        d.Bark();
        d.Walk();
    }
}
