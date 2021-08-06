//Concatenate a given string with itself a given number of times.
package Seanca3;
import java.util.Scanner;
public class U3 {
    static String repeatString(String s,int n){
        String s1="";
        for(int i=0;i<n;i++){
            s1+=s+" ";
        }
        return s1;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Jep Stringen:");
        String s=scn.nextLine();
        System.out.println("Jep numrin e hereve qe doni te perseritet stringa:");
        int n=scn.nextInt();
        while(true){
            if(n<1) {
                System.out.println("Jepni nje numer me te madh se 0!");
                n=scn.nextInt();
            }
            else break;
        }

        System.out.println("Stringa e re eshte: "+repeatString(s,n));
        scn.close();
    }
}
