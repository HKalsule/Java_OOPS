class Rectangle{
    int len;
    int bre;

    public int Calarea(){
        return (len*bre);
    }
    public int Calperi(){
        return (2*(len+bre)); 
    }
}
public class RectangleClass {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.len = 10;
        rec.bre = 20;
        System.out.println("Area Of Rectangle is : " + rec.Calarea());
        System.out.println("Perimeter Of Rectangle is : " + rec.Calperi());
    }

}