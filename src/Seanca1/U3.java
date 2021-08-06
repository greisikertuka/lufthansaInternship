package Seanca1;
class A{
    public String toString(){
        return "Klasa A";
    }
}
class B extends A{
    public String toString(){
        return "Klasa B";
    }
}
public class U3 {
    public static void main(String[] args) {
        A a=new A();
        A b=new B();
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
