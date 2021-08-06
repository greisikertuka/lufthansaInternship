package Seanca3;

import java.util.Scanner;

public class Rekursivitet {
    static double power(double a,double n){
        if(n==1.0) return a;
        if(n>1.0)  return a*power(a,n-1);
        else if(n<0) return (1.0/a) * power(a, n +1);
        return 1;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Jep numrin dhe fuqine:");
        double a= scn.nextDouble();
        double n=scn.nextDouble();
        System.out.println(power(a,n));
    }
}
