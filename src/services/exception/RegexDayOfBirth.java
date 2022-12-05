package services.exception;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexDayOfBirth {
    public  static void dayOfBirth(String day) throws Exception {
       String DayOfBirth="^(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[012])\\/(19[2-9][2-9]|200[0-4])$" ;
       if(Pattern.matches(DayOfBirth,day)){

       }else {
           throw new Exception("wrong");
       }
    }


}
