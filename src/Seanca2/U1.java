package Seanca2;
public class U1 {
    public static void main(String[] args) {
        String a="a";
        String b="a";
        String c=new String("a");
        if (a==b)
        System.out.println("a dhe b jane e njejta stringe po ti krahasojme instancat!");
        System.out.println((a==c)?"a dhe c jane e njejta stringe nqs i krahasojme me ==" +
                "":"a dhe c nuk jane e njejta stringe nqs i krahasojme me ==");
        if(a.equals(c))
            System.out.println("Me equals behet krahasimi i rregullt i a dhe c");
    String str="Hello";
    System.out.println(str.concat("!"));
    System.out.println(str.replaceAll("Hello","hello" ));
    System.out.println(str.contains("Hel"));
    System.out.println(str);
    str+="   world!";
    String[]v=str.split("\\s");
    String str2="";
    System.out.println("\n\nStringa kur i bejme split:");
    for(int i=0;i<v.length;i++){
        if(v[i]!="") {
            str2 += v[i] + " ";
            System.out.println(v[i]);
        }
    }
    System.out.println("Stringa pasi zevendesojme shume hapsira me nje hapsire:\n"+str2);
    System.out.println("Stringa pasi zevendesojme shume hapsira me nje hapsire:\n"+str2.replaceAll("\\s+"," "));
    }
}
