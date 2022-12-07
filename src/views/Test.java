package views;

import services.exception.Regex;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Regex regex=new Regex();
        System.out.println("enter ");
        String Phone= regex.result(Regex.Phone);
        System.out.println(Phone);

    }
}
