package Seanca1;
class Numra{
    int numri1;
    int numri2;
 int shuma(){
    return numri1+numri2;
}
static int shuma(int a,int b){
    return a+b;
}
static double shuma(double a,double b){
    return a+b;
}
}

public class U2 {
    public static void main(String[] args) {
        Numra n=new Numra();
        n.numri1=1;
        n.numri2=2;
        System.out.println(n.shuma());
        System.out.println(Numra.shuma(3,4));
        System.out.println(Numra.shuma(1.0,2.0));
    }
}
