package services.exception;

import java.util.Scanner;

public class ExceptionArea {
    public static void area(int a) throws Exception {
        if (a < 30) {
            throw new Exception("area have to more than 30 m^2");
        }
    }

}
