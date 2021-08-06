package Seanca3;

public class ReverseString {
    static String reverseString(String s1,String s2){
        if(s1=="") return s2;
        else {
            s2+=""+s1.charAt(s1.length()-1);
            s1=s1.substring(0,s1.length()-1);
            return reverseString(s1,s2);
        }
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Prova per ushtrimin",""));
    }
}