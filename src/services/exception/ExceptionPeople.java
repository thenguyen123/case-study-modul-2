package services.exception;

import java.util.regex.Pattern;

public class ExceptionPeople {
    public  static void people(int p) throws Exception {
        String people="^([1-9]|1[1-9]$)";
        String str=p+"";
        if(Pattern.matches(people,str)){
        }else {
            throw new Exception("people is less 20 and than 0");
        }
    }
}
