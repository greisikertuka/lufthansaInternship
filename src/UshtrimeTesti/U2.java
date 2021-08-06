//Gjej numrin me te madh te thjeshte plotpjesetues te 455
package UshtrimeTesti;
public class U2 {
    public static void main(String[] args) {
        int numri=1,prova;
        for(int i=3;i<=455;i++){ //Meqe nuk plotpjesetohet me 2
            if(455%i==0){
                prova=1;
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        prova=0;
                        break;
                    }
                }
                if(prova==1)  numri=i;
            }
        }
        System.out.println("Numri me i madh i thjeshte plotepjesetues i 455 eshte:\n"+numri);
    }
}
