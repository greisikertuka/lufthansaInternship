package Detyra1;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

class Employee{
    String name;
    int id;
    String role;
    int salary=350;
    Employee(String n, int i,String r,int s){
        name=n;
        id=i;
        role=r;
        salary=s;
        Scanner scn=new Scanner(System.in);
        while (true){
            if(salary<350){
               System.out.println("Ju dhate nje page me te vogel se 350$! Jepeni prape!");
               salary=scn.nextInt();
            }
            else break;
        }
    }

}
class Manager extends Employee{
Manager(String n, int i){
    super(n,i,"Menaxher",700);
}
}
class Departament{
    ArrayList<Employee> employees=new ArrayList<Employee>();
    Manager m;
    int numberofEmployees=0;
    Departament(Manager m){
        this.m=m;
        Scanner scn=new Scanner(System.in);
        while(true){
            if(m==null) {
                System.out.println("Jepni emrin, ID per nje menaxher:");
                m=new Manager(scn.next(),scn.nextInt());
            }
            else break;
        }
    }
    void addEmployee(Employee e){
        employees.add(e);
        numberofEmployees++;
        m.salary+=1;
    }
    void printEmployees(){
        for(Employee e:employees){
            System.out.println("Emri:"+e.name+"\nID:"+e.id+"\nRoli:"+e.role+"\nPaga:"+e.salary);
        }
    }
}
public class U4 {
    public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);

     System.out.println("Jepni emrin, ID per menaxherin e departamentit:") ;
     Manager m=new Manager(scn.next(), scn.nextInt());
     Departament d=new Departament(m);
     System.out.println("Jep numrin e punonjesve per departamentin:");
            int n = scn.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("Jep emrin, ID, rolin dhe rrogen per punonjesin " + (i + 1) + ":");
                Employee e = new Employee(scn.next(), scn.nextInt(), scn.next(), scn.nextInt());
                d.addEmployee(e);
            }
            d.printEmployees();
            scn.close();
        }
}
