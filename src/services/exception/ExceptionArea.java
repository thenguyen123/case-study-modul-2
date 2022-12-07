package services.exception;

import java.util.regex.Pattern;

public class ExceptionArea {
    public static void area(int a) throws Exception {
        String str =a+"";
        if (Pattern.matches(Regex.AREA,str)) {

        }  else{
            throw  new Exception("area have to more than 30 m^2");
        }
    }

}
