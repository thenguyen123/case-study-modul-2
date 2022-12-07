package services.exception;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static final String AREA="^([3-9][0-9]|[1-9][0-9][0-9]+)$";
    public static final String Email="^\\w+@gmail.com$";
    public  static  final String Phone="^\\d{9}$";
    public  static  final String Name="^([A-Z][a-z]+)+$";
    public  static  final String People="^([1-9]|1[1-9]$)";
    public  static  final String DayOfBirth="^(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[012])\\/(19[2-9][0-9]|200[0-4])$";




    public static Map<String,String> regex(){
        Map<String,String> map=new HashMap<>();
        map.put(AREA,"more than 30 ");
        map.put(Email,"email like xxx@gmail.com");
        map.put(Phone," have 9 number");
        map.put(Name,"First  char have to up case ");
        map.put(People,"mix 1 and max 20");
        map.put(DayOfBirth,"format DD/MM/YY");

        return map;
    }
    public static   boolean check(String regex,String str){

        return Pattern.matches(regex,str);
    }public static String result( String regex) {
        String temp = " ";
        do {
            Scanner scanner = new Scanner(System.in);
            temp = scanner.nextLine();
            if(check(regex, temp)){break;}
            System.out.println("enter again");
            System.out.println(regex().get(regex));
        } while (!check(regex, temp));

        return temp;
    }

    }
