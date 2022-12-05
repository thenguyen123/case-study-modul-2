package services.exception;

public class ExceptionPrices {
    public static void prices(double prices) throws Exception {
        if(prices<0){
            throw new Exception("it have to more than 0");
        }
    }
}
