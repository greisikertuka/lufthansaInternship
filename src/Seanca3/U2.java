//Given two non-negative int values, return true if they have
// the same last digit, such as with 27 and 57.
package Seanca3;
import java.util.Scanner;
public class U2 {
    static boolean sameLastDigit(int n1, int n2){
        return (n1%10)==(n2%10);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Jep numrin e pare:");
        int n1=scn.nextInt();
        System.out.println("Jep numrin e dyte:");
        int n2=scn.nextInt();
        System.out.println(sameLastDigit(n1,n2)?"Kane te njejten shifer te fundit" +
                "":"Nuk kane te njejten shifer te fundit");
        sameLastDigit(n1,n2);
        scn.close();
    }
}
