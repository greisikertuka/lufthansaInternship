//Gjej shumen e kolonave ne nje matrice dydimensionale
package Seanca2;
import java.util.Scanner;
public class U6 {
    public static void main(String[] args) {
        System.out.println("Jepni numrin e rreshtave dhe te kolonave:");
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        int [][]v=new int[m][n];
        for(int i=0;i<m;i++){
            System.out.println("Jep elementet e rreshtit "+(i+1));
            for(int j=0;j<n;j++){
                v[i][j]=scn.nextInt();
            }
        }
                int [] shuma=new int[n];
                int s=0;
                for(int i=0;i<n;i++){
                    s=0;
                    for(int j=0;j<m;j++){
                        s+=v[j][i];
                    }
                    shuma[i]=s;
                    System.out.println(s);
                }
                scn.close();
    }
}
