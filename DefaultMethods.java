interface mouse{
    void rightClick();
    void leftClick();
    private void  greet(){
        System.out.println("Good Morning...");
    }
    default void scroll(){
        greet();
        System.out.println("Scroll Button Working...");
    }
}

interface Keyboard{
    void alphabutton();
    void numbutton();
}

interface microphone{
    void speak();
    void listen();
}

class CPU implements mouse,Keyboard,microphone{
    public void rightClick(){
        System.out.println("Right Button Clicked...");
    }
    public void leftClick(){
        System.out.println("Left Button Clicked...");
    }
    public void alphabutton(){
        System.out.println("Alphabatic Button Clicked...");
    }
    public void numbutton(){
        System.out.println("Numeric Button Clicked...");
    }
    public void speak(){
        System.out.println("Please Speak Now...");
    }
    public void listen(){
        System.out.println("Listening...");
    }
}
public class DefaultMethods {
    public static void main(String[] args) {
        CPU hk = new CPU();
        hk.rightClick();
        hk.scroll();
    }
}
