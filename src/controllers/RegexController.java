package controllers;

import services.exception.Regex;

public class RegexController {
    public static String result(String string){
        return Regex.result(string);
    }
}
