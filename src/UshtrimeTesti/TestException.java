package UshtrimeTesti;
class Gabim extends Exception{
    String message;
    Gabim(String m){
        message=m;
    }
}
public class TestException{
    public static void main(String[] args)throws Exception {
        int n=12;
        try{
            throw new Gabim("Ju e shkruat gabim");
        }
        catch (Gabim e){
            System.out.println(e.message);
            e.printStackTrace();
        }
    }
}
