class Phone{
    public void greet(){
        System.out.println("Good Morning...");
    }
    public void on(){
        System.out.println("Turning Phone On...");
    }
}
class SmartPhone extends Phone{
    public void intro(){
        System.out.println("My name is SmartPhone...");
    }
    @Override
    public void on(){
        System.out.println("Turning SmartPhone On...");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {

        // Phone obj = new Phone();
        // SmartPhone obj = new SmartPhone();
        // Smartphone obj = new Phone();

        Phone abc = new SmartPhone();
        abc.greet();
        abc.on();

        // abc.intro();
    }
}
