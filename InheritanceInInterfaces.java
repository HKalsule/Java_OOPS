interface Sample{
    void meth1();
    void meth2();
}

interface childSample extends Sample{
    void meth3();
    void meth4();
}

class New implements childSample{
    public void meth3(){
        System.out.println("I am Meth 3");
    }
    public void meth4(){
        System.out.println("I am Meth 4");
    }
    public void meth2(){
        System.out.println("I am Meth 2");
    }
    public void meth1(){
        System.out.println("I am Meth 1");
    }
}

public class InheritanceInInterfaces {
    public static void main(String[] args) {
        New sc = new New();
        sc.meth1();
        sc.meth3();
    }
}
