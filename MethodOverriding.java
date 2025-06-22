class A{
    public int a;
    public void meth1(){
        System.out.println("I am meth1 of class A");
    }
    public void meth2(){
        System.out.println("I am meth2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am meth2 of class B");
    }
    public void meth3(){
        System.out.println("I am meth3 of class B");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        B abc = new B();
        abc.meth2();
    }
}
