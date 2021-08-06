//Draw some simple diagrams to illustrate what happens
// with each step of the following Java code in memory:
package Detyra1;
class Person{
    Person(){}
}
public class U1 {
    public static void main(String[] args) {
        Person p = null;
        //referenca p nuk i referohet nje objekti
        Person p2 = new Person();
        p = p2;
        //Ne kete rast p dhe p2 referojne te i njejti objekt ne memorje
        System.out.println((p==null)?"p eshte null":"p nuk eshte null");
        p2 = new Person();
        //p2 referon te nje objekt i ndryshem nga p, pasi eshte krijuar me new
        p=null;
        System.out.println((p==null)?"p eshte null":"p nuk eshte null");
    }
}
