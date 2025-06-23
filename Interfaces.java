interface Tv{
    int a =50;
    void screenOn();
    void ScreenOff();
} 

interface Remote{
    void channelChange();
    void volumeUp();
    void volumeDown();
}

class xyz implements Tv,Remote{
    public void screenOn(){
        System.out.println("Turning ON Screen...");
    }
    public void ScreenOff(){
        System.out.println("Turning OFF Screen...");
    }
    public void channelChange(){
        System.out.println("Changing Channel...");
    }
    public void volumeUp(){
        System.out.println("Turning Volume Up...");
    }
    public void volumeDown(){
        System.out.println("Turning Volume Down...");
    }
    public xyz(){
        System.out.println("I am constructor of class xyz");
    }
}

class abc extends xyz{
    public abc(){
        System.out.println("I am constructor of class abc");
    }
}

public class Interfaces {
    public static void main(String[] args){
        xyz Sam = new xyz();
        Sam.screenOn();
        Sam.ScreenOff();
        Sam.channelChange();
        Sam.volumeUp();
        Sam.volumeDown();
        // Sam.a = 100; --error
        System.out.println(Sam.a);

        abc mi = new abc();
        
    }
}
