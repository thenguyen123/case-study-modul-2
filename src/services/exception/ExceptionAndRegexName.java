package services.exception;

import java.util.regex.Pattern;

public class ExceptionAndRegexName {
    public void regexId(String input) throws Exception {
        String serviceIdRoom = "^([A-Z][a-z]+)+$";
        if (Pattern.matches(serviceIdRoom, input)) {
        } else {
            throw new Exception("wrong format.First char have to up case");
        }
    }
}

