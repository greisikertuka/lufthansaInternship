//Na jepet vargu i tille qe per n=1 te jete 1,
//per n=2 1+2^2, per 3->1^1+2^2+3^3
package UshtrimeTesti;
import java.util.Scanner;
public class U1 {
    static boolean kontroll(int n){
        int shumashifrave=0,n1=n;
        int shifra=(int)Math.log10(n)+1;
        System.out.println("Numri i shifrave: "+shifra);
        int[] v=new int[shifra];
        for(int i=shifra-1;i>=0;i--){
            v[i]=n%10;
            n/=10;
        }
        for(int i=0;i<shifra;i++){
            shumashifrave+=(int)Math.pow(v[i],i+1);
        }
        return n1 == shumashifrave;
    }
        public static void main(String[] args) {
        System.out.println("Give a number:");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println(kontroll(n)?"Eshte numer disarium":"Nuk eshte numer disarium");
        scn.close();
    }
}
