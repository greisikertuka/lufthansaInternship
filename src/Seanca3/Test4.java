package Seanca3;
import java.util.Scanner;
public class Test4 {
    static int nrPlote(int n){
        if(n==0) return 0;
        else if(n<0) return n+nrPlote(n+1);
        else return n+nrPlote(n-1);
    }
    static int shuma(int a,int b)
    {
        if(b==0)
            return a;
        else
            return(1+shuma(a,b-1));
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Jep 2 numrat:");
        int a=scn.nextInt();
        int b=scn.nextInt();
        System.out.println("Shuma e tyre me rekursivitet eshte: \n"+shuma(a,b));
        System.out.println("Jep numrin per shumen e nr te plote nga 0 te ai qe japim:");
        int n=scn.nextInt();
        System.out.println("Shuma eshte: "+nrPlote(n));
        scn.close();
    }
}
