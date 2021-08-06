package Seanca1;
class Rectangle{
    private double width;
    private double height;
    Rectangle(){
        }
        Rectangle(double w, double h){
        width=w;
        height=h;
        }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getPerimeter(){
        return 2* (width+height);
    }
    public double getCiscumstance(){
        return  (width*height);
    }
    public String toString(){
        return "Drejtkendeshi ka gjeresi " +this.getWidth()+" gjatesi "+this.getHeight()+" \nSiperfaqe: " +
                ""+this.getCiscumstance()+"\nPerimeter: "+this.getPerimeter();
    }
}
public class U1 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        System.out.println("Drejtkendeshi i pare me konstuktor default:\n"+r.toString());
        Rectangle r1=new Rectangle(2.0,3.4);
        System.out.println("Drejtkendeshi i dyte me konstuktor:\n"+r1.toString());

    }
}
