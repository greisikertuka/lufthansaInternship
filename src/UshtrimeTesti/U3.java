//Jep nje stringe qe te permbaje dhe nr
//pervec shkronjave dhe gjej shumen e tyre
package UshtrimeTesti;
import java.util.Scanner;
public class U3 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Jepni nje stringe qe permban dhe numra:");
        String s=scn.nextLine();
        String str="";
        int n=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                str+=s.substring(i,i+1);
                if(i==s.length()-1){
                    n+=Integer.parseInt(str);
                }
                else if(!(s.charAt(i+1)>='0'&&s.charAt(i+1)<='9')){
                    n+=Integer.parseInt(str);
                    str="";
                }
            }
        }
        System.out.println("Shuma eshte: "+n);
    }
}
