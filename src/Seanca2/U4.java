//Gjej maksimumin e dyte ne nje array integers
package Seanca2;

import java.util.Scanner;

public class U4 {
    static int maxDyteMetoda1(int[]v)
    {
        int max=v[0];
        int k=0;
     for(int i=1;i<v.length;i++){
         if(v[i]>max){
             max=v[i];
             k=i;
         }
     }
        int max2=v[0];
           for(int i=1;i<v.length&&i!=k;i++){
            if(v[i]>max2)
                max2=v[i];
        }
           return max2;
    }
    static int maxDyteMetoda2(int []v){
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<v.length-1;i++){
            if(v[i]>max1) {
                max2=max1;
                max1 = v[i];
            }
            else if(v[i]>max2 && v[i]<max1)  max2=v[i];
        }
        return max2;
    }
        public static void main    (String[] args) {
        System.out.println("Jep madhesine e array:");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]v=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Jep elementin "+(i+1));
            v[i]=scn.nextInt();
        }
        System.out.println("Maksimumi i dyte me metoden e pare eshte:\n"+maxDyteMetoda1(v));
        System.out.println("Maksimumi i dyte me metoden e dyte eshte:\n"+maxDyteMetoda2(v));
    }
}
