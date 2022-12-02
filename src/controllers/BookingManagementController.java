package controllers;

import java.util.Scanner;

public class BookingManagementController {
    public  void bookingManagement(){
        int input;
do{
    Scanner scanner=new Scanner(System.in);

    System.out.println("1.Add new booking ");
    System.out.println("2.Display list booking");
    System.out.println("3. Return main menu");
    input=Integer.parseInt(scanner.nextLine());
    System.out.println("enter your option");
    switch (input){
        case 1:
            break;
        case 2:
            break;
        case 3:
            FuramaController.disPlayMainMenu();
            break;
    }
}while (input!=3);
    }
}
