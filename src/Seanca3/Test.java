package Seanca3;
abstract class A{
    public void test1(){
        System.out.println("Test 1");
    }
    public abstract void test2();
}
class B extends A{

    @Override
    public void test2() {
           System.out.println("Test 2");
    }
}
public class Test {
    public static void main(String[] args) {
            B b=new B();
            b.test1();
            b.test2();
    }
}