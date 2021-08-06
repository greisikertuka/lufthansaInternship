package Detyra1;
/*
Find sum of all elements above main diagonal in matrix. Sum of elements above diagonal is: 29
1 2 3 4
5 6 7 8
8 7 6 5
4 3 2 1
*/
import java.util.Scanner;

public class U3 {
    static int shuma(int[][]v){
        int s=0;
        for(int i=0;i<v.length;i++){
            for(int j=i+1;j<v[0].length;j++){
                s+=v[i][j];
            }
        }
        return s;

    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Jep numrin e rreshtave dhe kolonave:");
        int m=scn.nextInt();
        int n=scn.nextInt();
        int [][]v=new int[m][n];
        for(int i=0;i<m;i++){
            System.out.println("Jep elementet e rreshtit "+(i+1));
            for(int j=0;j<n;j++){
                v[i][j]=scn.nextInt();
            }
        }
        System.out.println("Shuma e elementeve siper diagonalesh kryesore:\n"+shuma(v));
    }
}
