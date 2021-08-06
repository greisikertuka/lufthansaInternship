/*homework exercises
==================

Me poshte ju kam shkruajtur disa taske qe duhet ti kryeni ne menyre qe te perforconi konceptet e OOP.

Duhet te krijoni nje program ne java i cili ben te mundur rregjistrimin e nje punonjesi.
(te dhenat mund ti ruani ne ArrayList ose HashMap global)

Employee ka:
	1.IdDoc
	2.Contact
	3.Education
	4.Experience
	5.Adress

.)IdDoc ka:
	->IDCard Passport ose DriverLicense

	IDCard Passport ose DriverLicense kane:
		->Te gjitha te dhenat qe kane dokumentat shqiptare.

.)Contact ka:
	->Te gjitha te dhenat e mundshme(email,fb acc,cel,tel)

.)Adress ka:
	->Te gjitha te dhenat e mundshme(rruga,pallati,qyteti,..)

.)Education ka:
	-University
	-HighSchool

	University ka:
		->Te gjitha te dhenat e mundshme.

	HighSchool ka:
		->Te gjitha te dhenat e mundshme.

.)Experience ka:
	->experienceCounter(int)
	->PreviousJob

	PreviousJob ka:
		1.jobPosition(String)
		2.jobDescription(String)
		3.startDate(Date)
		4.endDate(Date)
		5.comapany(String)


//Ne fund duhet bere printimi ne console i te dhenave te cdo Employee.
psh:
=======================
Punonjesi x
1.IdDoc
2.Contact
3.Education
4.Experience
5.Adress

=========================

=======================
Punonjesi y
1.IdDoc
2.Contact
3.Education
4.Experience
5.Adress

=========================

Sugjerime:
	1.Filloni te ndertoni klasat me te thjeshta qe nuk kane referenca te objekteve te tjera.

	2.Duhet Bere nje klase e vecante per marrjen e inputit ne Console.(psh InputReader).
	Methodat ne InputReader sugjeroj te jene statike dhe duhet te marrin si parameter objektin per cilin behet fjale dhe te ruajne inputet tek fields e atij objekti.
	psh: public static void saveEmployee(Employee emp)
		 public static void saveExperience(Experience exp)

	3.Sugjeroj perdorimi e ArrayList nqs se nuk e dini madhesine e array-t, (psh nje Klasa experience ka nje ArrayList me PreviousJob) pasi punonjesi mund te kete
	bere disa pune.

	4.Jeni te lire te modeloni vete nqs se nuk ju pelqen modelimi apo relationship, vetem eshte e rendesishme te te perdorni konceptet e OOP.

	5.Emertimin i klasave eshte ne doren tuaj.*/



package Seanca4;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.spec.EllipticCurve;
import java.time.temporal.Temporal;
import java.util.Arrays;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;
class IDCard{
    String emriPlote;
    String kombesia;
    String vendlindja;
    Date ditelindja;
    char gender;

    public IDCard(String emriPlote, String kombesia, String vendlindja, Date ditelindja, char gender) {
        this.emriPlote = emriPlote;
        this.kombesia = kombesia;
        this.vendlindja = vendlindja;
        this.ditelindja = ditelindja;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Karte Identiteti:\n" +
                "emriPlote='" + emriPlote + '\'' +
                "\nKombesia='" + kombesia + '\'' +
                "\nVendlindja='" + vendlindja + '\'' +
                "\nDitelindja=" + ditelindja +
                "\nGjinia=" + ((gender=='m')?"Mashkull":"Femer")+"\n";
    }
}
class Passport{
    String emriPlote;
    String kombesia;
    String vendlindja;
    Date ditelindja;
    // Date d1 = new Date(2000, 11, 21);
    char gender;

    public Passport(String emriPlote, String kombesia, String vendlindja, Date ditelindja, char gender) {
        this.emriPlote = emriPlote;
        this.kombesia = kombesia;
        this.vendlindja = vendlindja;
        this.ditelindja = ditelindja;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Pashaporte"+
                "\nEmri i plote='" + emriPlote + '\'' +
                "\nKombesia='" + kombesia + '\'' +
                "\nVendlindja='" + vendlindja + '\'' +
                "\nDitelindja=" + ditelindja +
                "\nGjinia=" + ((gender=='m')?"Mashkull":"Femer") +"\n";
    }
}
class DriverLicence{
    String emriPlote;
    String kombesia;
    String vendlindja;
    Date dataPatentes;
    // Date d1 = new Date(2000, 11, 21);
    String grupiGjakut;

    public DriverLicence(String emriPlote, String kombesia, String vendlindja, Date dataPatentes, String grupiGjakut) {
        this.emriPlote = emriPlote;
        this.kombesia = kombesia;
        this.vendlindja = vendlindja;
        this.dataPatentes = dataPatentes;
        this.grupiGjakut = grupiGjakut;
    }

    @Override
    public String toString() {
        return "Patenta" +
                "\nEmri i plote='" + emriPlote + '\'' +
                "\nKombesia='" + kombesia + '\'' +
                "\nVendlindja='" + vendlindja + '\'' +
                "\nDataPatentes=" + dataPatentes +
                "\nGrupiGjakut='" + grupiGjakut + '\''+"\n";
    }
}
class IdDoc{
IDCard id;
Passport pass;
DriverLicence dl;
    public IdDoc(IDCard id) {
        this.id = id;
    }

    public IdDoc(Passport pass) {
        this.pass = pass;
    }

    public IdDoc(DriverLicence dl) {
        this.dl = dl;
    }

    @Override
    public String toString() {
        if (id!=null)      return id.toString();
        else if (pass!=null)      return pass.toString();
        else if (dl!=null)      return dl.toString();
        return null;
    }
}
class Contact{
    String email;
    String facebook;
    String cel;

    public Contact(String email, String facebook, String cel) {
        this.email = email;
        this.facebook = facebook;
        this.cel = cel;
    }

    @Override
    public String toString() {
        return "Contact" +
                "\nEmail='" + email + '\'' +
                "\nFacebook='" + facebook + '\'' +
                "\nCel='" + cel + '\'' +"\n";
    }
}
class HighSchool{
    String emri;
    String publik;
    String adresa;

    public HighSchool(String emri, String publik, String adresa) {
        this.emri = emri;
        this.publik = publik;
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Gjimnaz" +
                "\nEmri i gjimnazit='" + emri + '\'' +
                "\nPublik='" + publik + '\'' +
                "\nAdresa='" + adresa + '\'' +"\n";
    }
}
class University{
    String emri;
    String[] deget;
    String adresa;

    public University(String emri, String[] deget, String adresa) {
        this.emri = emri;
        this.deget = deget;
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Universitet" +
                "\nEmri='" + emri + '\'' +
                "\nDeget=" + Arrays.toString(deget) +
                "\nAdresa='" + adresa + '\'' +"\n";
    }
}
class Education{
    HighSchool hs;
    University uv;

    public Education(HighSchool hs) {
        this.hs = hs;
    }

    public Education(HighSchool hs,University uv) {
        this.hs=hs;
        this.uv = uv;
    }

    @Override
    public String toString() {
        if(uv==null) return hs.toString();
        else return hs.toString()+uv.toString();
    }
}
class PreviousJob{
    String jobposition;
    String jobDescription;
    Date startDate;
    Date endDate;
    String company;

    public PreviousJob(String jobposition, String jobDescription, Date startDate, Date endDate, String company) {
        this.jobposition = jobposition;
        this.jobDescription = jobDescription;
        this.startDate = startDate;
        this.endDate = endDate;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Punet e meparshme" +
                "\nPozicioni i punes='" + jobposition + '\'' +
                "\nPershkrimi i punes='" + jobDescription + '\'' +
                "\nData e nisjes=" + startDate +
                "\nData e mbarimit=" + endDate +
                "\nKompania='" + company + '\'' +"\n";
    }
}
class Experience{
    int experienceCounter;
    PreviousJob[] pr;

    public Experience(int experienceCounter, PreviousJob[] pr) {
        this.experienceCounter = experienceCounter;
        this.pr = pr;
    }
    public String toString(){
        String s="Eksperienca: "+experienceCounter+" vite\n";
        if(pr!=null){
            for (int i = 0; i < pr.length; i++) {
                s += pr[i].toString();
            }
        }
        return s;
    }
}
class Adress{
    int nrApartamenti;
    String rruga;
    String qyteti;
    String shteti;

    public Adress(int nrApartamenti, String rruga, String qyteti, String shteti) {
        this.nrApartamenti = nrApartamenti;
        this.rruga = rruga;
        this.qyteti = qyteti;
        this.shteti = shteti;
    }

    @Override
    public String toString() {
        return "Adresa" +
                "\nNumer apartamenti=" + nrApartamenti +
                "\nRruga='" + rruga + '\'' +
                "\nQyteti='" + qyteti + '\'' +
                "\nShteti='" + shteti + '\'' +"\n";
    }
}
class Employee {
    IdDoc id;
    Contact cont;
    Education ed;
    Experience exp;
    Adress adr;

    public Employee(IdDoc id, Contact cont, Education ed, Experience exp, Adress adr) {
        this.id = id;
        this.cont = cont;
        this.ed = ed;
        this.exp = exp;
        this.adr = adr;
    }

    @Override
    public String toString() {
        return "========= Employee =========" +
                id.toString() +"\n"+
                cont.toString() +"\n"+
                ed.toString() +"\n"+
                exp.toString() +"\n"+
                adr.toString();
    }
}
public class EmployeeTest{
    static ArrayList<Employee> arr=new ArrayList<>();
    static void printEmployee(int n){
        System.out.println(arr.get(n-1).toString());
    }
    static void addEmployee(Employee e){
        arr.add(e);
        try{
            System.out.println("Te dhenat po ruhen ne file!");
            FileWriter fw=new FileWriter("Employee.txt");
            PrintWriter pw=new PrintWriter(fw);
            pw.println(e.toString());
            pw.close();
            fw.close();
            System.out.println("Te dhenat u ruajten ne file!");
        }
        catch(IOException exception){
            exception.printStackTrace();
        }
    }
    public static void main(String[] args) {
           Scanner scn=new Scanner(System.in) ;
           System.out.println("Jep numrin e punetoreve qe do shtoni:");
           int nrPunetoreve=scn.nextInt();
           while(true){
               if(nrPunetoreve<1){
                   System.out.println("Ju dhate nje numer me te vogel se 1 punetor," +
                           "\n Provoni perseri!");
                   nrPunetoreve=scn.nextInt();
               }
               else break;
           }
           for(int z=0;z<nrPunetoreve;z++) {
               System.out.println("Zgjidhni dokumentin e identifikimit:" +
                       "\n1.Karte ID\n2.Pashaporte\n3.Patente");
               int dokument = scn.nextInt();
               while (true) {
                   if (dokument <= 0 || dokument > 3) {
                       System.out.println("Ju dhate nje numer te gabuar," +
                               "\n Provoni perseri!");
                       dokument = scn.nextInt();
                   } else break;
               }
               IdDoc id = null;
               switch (dokument) {
                   case 1: {
                       System.out.println("Jep emrin e plote ne karte identiteti:");
                       scn.nextLine();
                       String emri = scn.nextLine();
                       System.out.println("Jep kombesine:");
                       String kombesia = scn.nextLine();
                       System.out.println("Jep vendlindjen:");
                       String vendlindja = scn.nextLine();
                       System.out.println("Jep vitin,muajin,diten e lindjes:");
                       Date d = new Date(scn.nextInt() - 1900, scn.nextInt(), scn.nextInt());
                       System.out.println("Jep gjinine 'f' ose 'm':");
                       char gjinia = scn.next().charAt(0);
                       IDCard idc = new IDCard(emri, kombesia, vendlindja, d, gjinia);
                       id = new IdDoc(idc);
                       break;
                   }
                   case 2: {
                       System.out.println("Jep emrin e plote ne pashaporte:");
                       scn.nextLine();
                       String emri = scn.nextLine();
                       System.out.println("Jep kombesine:");
                       String kombesia = scn.nextLine();
                       System.out.println("Jep vendlindjen:");
                       String vendlindja = scn.nextLine();
                       System.out.println("Jep vitin,muajin,diten e lindjes:");
                       Date d = new Date(scn.nextInt() - 1900, scn.nextInt(), scn.nextInt());
                       System.out.println("Jep gjinine 'f' ose 'm':");
                       char gjinia = scn.next().charAt(0);
                       Passport pass = new Passport(emri, kombesia, vendlindja, d, gjinia);
                       id = new IdDoc(pass);
                       break;
                   }
                   case 3: {
                       System.out.println("Jep emrin e plote ne patente:");
                       scn.nextLine();
                       String emri = scn.nextLine();
                       System.out.println("Jep kombesine:");
                       String kombesia = scn.nextLine();
                       System.out.println("Jep vendlindjen:");
                       String vendlindja = scn.nextLine();
                       System.out.println("Jep vitin,muajin,diten e lindjes:");
                       Date d = new Date(scn.nextInt() - 1900, scn.nextInt(), scn.nextInt());
                       System.out.println("Jep grupin e gjakut:");
                       String grupi = scn.next();
                       DriverLicence dl = new DriverLicence(emri, kombesia, vendlindja, d, grupi);
                       id = new IdDoc(dl);
                       break;
                   }
               }
               System.out.println("Jep emailin:");
               String email = scn.next();
               System.out.println("Jep adresen e facebook:");
               scn.nextLine();
               String facebook = scn.nextLine();
               System.out.println("Jep numrin e celularit:");
               String cel = scn.next();
               Contact ct = new Contact(email, facebook, cel);
               System.out.println("Jep emrin e gjimnazit:");
               scn.nextLine();
               String emri = scn.nextLine();
               System.out.println("Trego nese gjimnazi eshte publik apo privat:");
               String publik = scn.next();
               System.out.println("Jep adresen e gjimnazit:");
               scn.nextLine();
               String adresa = scn.nextLine();
               HighSchool hs = new HighSchool(emri, publik, adresa);
               Education ed = null;
               System.out.println("Tregoni nese studenti ka studiuar ne universitet 'po' ose 'jo':");
               String po = scn.next();
               if (po.equals("po") || po.equals("Po")) {
                   System.out.println("Jep emrin e universitetit:");
                   scn.nextLine();
                   emri = scn.nextLine();
                   System.out.println("Jep numrin e degeve");
                   int nr = scn.nextInt();
                   while (true) {
                       if (nr < 1) {
                           System.out.println("Ju dhate nje numer me te vogel se 1 dege," +
                                   "\n Provoni perseri!");
                           nr = scn.nextInt();
                       } else break;
                   }
                   String[] dege = new String[nr];
                   System.out.println("Jep " + nr + " deget:");
                   scn.nextLine();
                   for (int i = 0; i < nr; i++) {
                       dege[i] = scn.nextLine();
                   }
                   System.out.println("Jep adresen e universitetit:");
                   scn.nextLine();
                   adresa = scn.nextLine();
                   University uv = new University(emri, dege, adresa);
                   ed = new Education(hs, uv);
               }
               else
                   ed = new Education(hs);
               System.out.println("Jep numrin e viteve eksperience:");
               int exp = scn.nextInt();
               System.out.println("Jep numrin e puneve te meparshme:");
               int nr = scn.nextInt();
               PreviousJob[] pr = new PreviousJob[nr];
               for (int i = 0; i < nr; i++) {
                   System.out.println("Jep pozicionin e punes:");
                   scn.nextLine();
                   String poz = scn.nextLine();
                   System.out.println("Jep pershkrimin e punes:");
                   scn.nextLine();
                   System.out.println("Jep vitin, muajin dhe diten e fillimit te punes:");
                   Date df = new Date(scn.nextInt() - 1900, scn.nextInt(), scn.nextInt());
                   System.out.println("Jep vitin, muajin dhe diten e mbarimit te punes:");
                   Date dm = new Date(scn.nextInt() - 1900, scn.nextInt(), scn.nextInt());
                   System.out.println("Jep emrin e kompanise:");
                   scn.nextLine();
                   emri = scn.nextLine();
                   pr[i] = new PreviousJob(poz, poz, df, dm, emri);
               }
               Experience expr = new Experience(nr, pr);
               System.out.println("Jep numrin e apartamentit:");
               nr = scn.nextInt();
               System.out.println("Jep emrin e rruges:");
               scn.nextLine();
               String rruga = scn.nextLine();
               System.out.println("Jep qytetin:");
               String qyteti = scn.nextLine();
               System.out.println("Jep shtetin:");
               String shteti = scn.nextLine();
               Adress adr = new Adress(nr, rruga, qyteti, shteti);
               Employee e = new Employee(id, ct, ed, expr, adr);
               addEmployee(e);
           }
           System.out.println("Jep indeksin e punetorit qe doni te shihni (nisni nga 1):");
           int nr=scn.nextInt();
           System.out.println(arr.size());
           while(true){
               if(nr>arr.size()||nr<1) {
                   System.out.println("Ju dhate indeks te gabuar\nProvoni perseri!");
                   nr=scn.nextInt();
               }
               else break;
           }
           printEmployee(nr);
        scn.close();
    }
}
