class Cylinder{
    private int r;
    private int h;
    private float peri;
    private float vol;
    private float suar;

    public Cylinder(){
        r = 1;
        h = 1;
    }
    public Cylinder(int a,int b){
        r = a;
        h = b;
    }
    public void setRadius(int a){
        this.r=a;
    }
    public int getRadius(){
        return r;
    }
    public void setHeight(int b){
        this.h=b;
    }
    public int getHeight(){
        return h;
    }
    public float cylperi(){
        float pi = 3.14f;
        peri = 2*pi*r; 
        System.out.println("Perimeter of Cylinder Is : " + peri);
        return peri;
    }
    public float cylsurarea(){
        float pi = 3.14f;
        suar =(2*pi*r*h) + (2*pi*r*r); 
        System.out.println("Surface Area of Cylinder Is : " + suar);
        return vol;
    }
    public float cylvol(){
        float pi = 3.14f;
        vol =pi*r*r*h; 
        System.out.println("Volume of Cylinder Is : " + vol);
        return vol;
    }
    
}
public class prac9 {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        System.out.println("Radius Of Cylinder Is : " + cy.getRadius());
        System.out.println("Height Of Cylinder Is : " + cy.getHeight());
        cy.cylperi();
        cy.cylsurarea();
        cy.cylvol();
    }
}
