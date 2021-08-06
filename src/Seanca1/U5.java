package Seanca1;
class Author{
    String name;
    String email;
    char gender;
    Author(String n,String e,char c){
        name=n;
        email=e;
        gender=c;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }
}
class Book{
    String name;
    Author[] a;
    double price;
    int qty=0;
    Book(){
    }
    Book(String n,Author[] au,int p){
        Author[] a=new Author[au.length];
        for(int i=0;i<au.length;i++){
            a[i]=new Author(au[i].name,au[i].email,au[i].gender);
        }
        name=n;
        price=p;
    }
    Book(String n,Author[] au,int p,int qty){
        Author[] a=new Author[au.length];
        for(int i=0;i<au.length;i++) {
            a[i] = new Author(au[i].name, au[i].email, au[i].gender);
        }
        name=n;
        price=p;
        this.qty=qty;
    }
}
public class U5 {
    public static void main(String[] args) {
        Author[] a=new Author[2];
        a[0]=new Author("Ismail","is@gmail.com",'m');
        a[1]=new Author("Vladimir","vlad@gmail.com",'m');
        Book b=new Book("Gjenerali i ushtrise se vdekur",a,2300);
        Book b1=new Book("Gjenerali i ushtrise se vdekur",a,2300,3);
    }
}
