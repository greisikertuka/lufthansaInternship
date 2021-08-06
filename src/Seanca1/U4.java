package Seanca1;

import java.util.Scanner;

class Person{
    String firstname;
    String lastname;
    int age;
    Person(){
            }
    Person(String f,String l,int a){
        firstname=f;
        lastname=l;
        age=a;
    }
    public String toString(){
        return ""+firstname+" "+lastname+ " "+age;
    }
}
class Employee extends Person{
    String jobposition;
    double salary;
    int experience;
    Employee(String f,String l,int a,String job,double s,int ex){
        super(f,l,a);
        jobposition=job;
        salary=s;
        experience=ex;
    }
    public String toString(){
        return "Employee\n"+super.toString()+"\n"+jobposition+"\n"+salary+"\n"+experience;
    }
}

public class U4 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Person p=new Person("Miri","Shehu",2);
        while (true) {
            if(p.age>=16)
                break;
            else{
                System.out.println("Mosha qe dhate eshte me e vogel se 16!");
                p.age=scn.nextInt();
            }
        }
        System.out.println(p.toString());
        Employee e=new Employee("Miri","Shehu",23,"Programues",2300.0,2);
        System.out.println(e.toString());
    }
}
