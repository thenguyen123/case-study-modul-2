package services.exception;

public class ExceptionPeople {
    public  static void people(int p) throws Exception {
        if(p<0 && p>20){
            throw new Exception("people is less 20 and than 0");
        }
    }
}
