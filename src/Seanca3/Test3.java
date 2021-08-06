package Seanca3;
abstract class Parent{
    abstract void message();
}
class AA extends Parent{
    public void message(){
        System.out.println("Printimi te klasa e pare!");
    }
}
class BB extends Parent{
    public void message(){
        System.out.println("Printimi te klasa e dyte!");
    }
}
public class Test3 {
    public static void main(String[] args) {
          Parent a=new AA() ;
          Parent b=new BB();
          a.message();
          b.message();
    }
}
