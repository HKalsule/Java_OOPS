class C{
    public int a = 10;
    protected int b = 20;
    int c = 30;
    private int d = 40;

    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        C c1 = new C();
        // c1.meth1();
        System.out.println(c1.a);
        System.out.println(c1.b);
        System.out.println(c1.c);
        // System.out.println(c1.d);
    }
}
