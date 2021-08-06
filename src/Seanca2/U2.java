//Gjej inversin e nje stringe
package Seanca2;

import java.util.Scanner;

public class U2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        String s1="";
        for(int i=0;i<s.length();i++){
            s1+=s.charAt(s.length()-1-i);
        }
        System.out.println(s1);
    }
}
