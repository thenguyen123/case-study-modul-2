package services.exception;

import java.lang.reflect.Parameter;
import java.util.regex.Pattern;

public class ExceptionPrices {
    public static void prices(int prices) throws Exception {
        String PRICES="^([1-9]|[1-9][0-9]+)$";
        String str=prices+"";
        if(Pattern.matches(PRICES,str)){

        } else{
            throw new Exception("it have to more than 0");
        }
    }
}
