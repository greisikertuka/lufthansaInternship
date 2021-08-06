//Given an array of ints, return true if the sum
// of all the 2's in the array is exactly 8.
package Seanca3;
import java.util.Scanner;
public class U1 {
    static boolean shuma8(int[]v){
        int s=0;
        for(int i=0;i<v.length;i++){
            if(v[i]==2)s+=2;
        }
        return s==8;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Jep numrin e elementeve te array:");
        int n=scn.nextInt();
        int []v=new int[n];
        System.out.println("Jep "+n+" elementet:");
        for(int i=0;i<n;i++){
            v[i]=scn.nextInt();
        }
        System.out.println("Shuma e dyshave eshte 8: "+shuma8(v));
        scn.close();
    }
}
