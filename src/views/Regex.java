package views;

import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static final String serviceIdVilla="^SVVL\\-\\d{4}$";
    public static final String serviceIdRoom="^ROVL\\-\\d{4}$";
    public static final String name="^[A-Z][a-z]+$";


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter");
        String input= scanner.nextLine();

        System.out.println(Pattern.matches(name,input));
    }
}
