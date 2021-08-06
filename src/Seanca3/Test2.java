package Seanca3;

import java.util.Scanner;

interface GeometricObject{    //Interface mund te jete dhe bosh,pa trup
   abstract double getArea();
   abstract double getPerimeter();
}
class Circle implements GeometricObject{
    double r;
    Circle(double r){
        this.r=r;
    }
    public double getArea(){
        return Math.PI*r*r;
    }
    public double getPerimeter(){
        return 2*Math.PI*r;
    }
    public String toString(){
    return "Rrethi i krijuar ka rreze: "+r;
    }
}
class Rectangle implements GeometricObject{
    double a,b;
    Rectangle(double a,double b){
        this.a=a;
        this.b=b;
    }
    public double getArea(){
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return 2*(a+b);
    }

    public double gerPerimeter(){
        return 2*(a+b);
    }
    public String toString(){
        return "Drejtkendeshi i krijuar ka gjatesi "+a+" dhe gjeresi "+b;
    }
}
public class Test2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Jep rrezen e rrethit:");
        int r=scn.nextInt();
        GeometricObject c= new Circle(r);
        System.out.println("perimetri i rrethit: "+c.getPerimeter());
        System.out.println("Siperfaqja e rrethit: "+c.getArea());
        System.out.println(c.toString());
        System.out.println("Jep gjatesine dhe gjeresine e drejtkendeshit:");
        GeometricObject re=new Rectangle(scn.nextInt(), scn.nextInt());
        System.out.println("Perimetri i drejtkendeshit: "+re.getPerimeter());
        System.out.println("Siperfaqja e drejtkendeshit: "+re.getArea());
        scn.close();
        }
}
