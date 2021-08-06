//Shto nje element qe jepet nga perdoruesi ne pozicionin qe jep perdoruesi

package Seanca2;
import java.util.Scanner;
public class U3 {
    public static void main(String[] args) {
        System.out.println("Jep madhesine e array:");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]v=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Jep elementin "+(i+1));
            v[i]=scn.nextInt();
        }
        System.out.println("Jep indeksin ku do te shtosh elementin dhe elementin:");
        int in=scn.nextInt();
        int elem=scn.nextInt();
        int []v1=new int[n+1];
        for(int i=0;i<=n;i++){
            if (i<in) v1[i]=v[i];
            else if(i==in) v1[i]=elem;
            else v1[i]=v[i-1];
        }
        System.out.println("Array i ri i krijuar:");
        for(int i=0;i<=n;i++){
            System.out.print(v1[i]);
        }
    }
}
