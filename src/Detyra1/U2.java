//What is the output of the following code?
package Detyra1;
public class U2 {
    public static void main(String[] args) {
        int x = 6;
        boolean y = (x >= 6) || (++x <= 7);
        System.out.println(x);
    }
}
//Do jete 6, pasi operatori || eshte short circuit operator, dmth ne momentin qe njeri
//nga kushtet e or eshte true y behet true dhe pjesa tjeter nuk ekzekutohet