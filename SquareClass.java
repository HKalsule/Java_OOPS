class Squaree{
    int side;
    int area;
    int peri;

    public int Calarea(){
        return (side*side);
    }
    public int Calperi(){
        return (4*side); 
    }
}
public class Square {
    public static void main(String[] args) {
        Squaree squ = new Squaree();
        squ.side = 10;
        System.out.println("Area Of Square is : " + squ.Calarea());
        System.out.println("Perimeter Of Square is : " + squ.Calperi());
    }

}