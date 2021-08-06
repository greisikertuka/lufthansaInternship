//Hiq elementet qe ndodhen te perseritur ne ArrayList
package Seanca2;
import java.util.ArrayList;
import java.util.Scanner;

public class U5 {
    public static void main(String[] args) {
        System.out.println("Jep madhesine e arraylist:");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            System.out.println("Jep elementin e "+(i+1)+" te ArrayListit");
            arr.add(scn.nextInt());
        }
      for(int i=0;i<arr.size();i++){
          int a=arr.get(i);
          for(int j=i+1;j<arr.size();j++){
              if(arr.get(j)==a){
                  arr.remove(j);
                  j--;
              }
          }
      }
      System.out.println("ArrayList pasi hoqem elementet qe jane te perseritur:" +
              "\n"+arr);
    }
}
