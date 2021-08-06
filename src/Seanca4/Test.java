package Seanca4;
import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Jep nje numer:");
        int n=scn.nextInt();
        switch (n){
            case 0 :
                System.out.println("Ju dhate numrin 0!");
                break;
            case 1:
                System.out.println("Ju dhate numrin 1!");
                break;
            default: System.out.println("Ju dhate nje numer te ndryshem nga 1 dhe 0!");
        }
        System.out.println("Prova:");
        for(int i=0;i<3;++i){
            System.out.print("Printimi i "+(i+1)+"\n");
        }
        scn.close();
    }
}
