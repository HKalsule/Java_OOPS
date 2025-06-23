abstract class Parent{
    /*  
        Abstract Classes Can Not Be Created As 
        A Object. 
    */
    public Parent(){
        System.out.println("I am Constructor of Parent");
    }
    public void name(){
        System.out.println("I am Parent");
    }
    public void name2(){
        System.out.println("I am again a Parent");
    }
    abstract public void greet();
}

class Child1 extends Parent{
    public Child1(){
        System.out.println("I am Constructor of Child 1");
    }
    public void myName(){
        System.out.println("My Name is Child 1");
    }
    /* 
        Calling of Abstarct method is mandatory for
        classes that inherits Abstract Class.
     */
    public void greet(){
            System.out.println("Hello!! I am Child 1");
    }
}
    /* 
        If and Abstract Method is not called in a class that 
        inherits abstract class than you need to make it 
        a abstarct class.
    */
abstract class Child2 extends Parent{
    public void sayHello(){
        System.out.println("Hello!! I am Child 2");
    }
    abstract public void hell();
}

class GrandChild1 extends Child2{
    public void hell(){
        System.out.println("Hello!! I am GrandChild1");
    }
    public void greet(){
        System.out.println("Good Morning");
    }

}
public class AbstractClassAnsAbstractMethod {
    public static void main(String[] args) {
        GrandChild1 gc = new GrandChild1();
        gc.greet();
        gc.hell();
    //  Child2 c2 = new Child2(); --error
        Child1 c1 = new Child1();
        c1.greet();
        c1.myName();
    //  Parent p = new Parent();  --error
    }
}
