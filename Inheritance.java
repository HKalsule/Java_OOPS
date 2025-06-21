class name{
    private String x;
    public void setx(String a){
        x=a;
    }
    public String getx(){
        return x;
    }
    public void nameme(){
        System.out.println("Hey its me " + x + " !!");
    }
}
class age extends name{
    private int a; 
    public void seta(int b){
        this.a=b;
    }
    public int geta(){
        return a;
    }
    public void ageme(){
        System.out.println("Hey its me and my age is " + a + " !!");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        age ha = new age();
        ha.setx("Ravi");
        ha.nameme();
        ha.seta(3);
        ha.ageme();
    }
}
