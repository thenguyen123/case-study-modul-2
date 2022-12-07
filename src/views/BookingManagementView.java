package views;

import java.util.Scanner;

public class BookingManagementView {
    public  void bookingManagement(){
        int input=0;
do{
    Scanner scanner=new Scanner(System.in);

    System.out.println("1.Add new booking ");
    System.out.println("2.Display list booking");
    System.out.println("3. Return main menu");
    try {
        input = Integer.parseInt(scanner.nextLine());
    }catch (NumberFormatException e){
        System.out.println(e.getMessage());

    }
    System.out.println("enter your option");
    switch (input){
        case 1:
            break;
        case 2:
            break;
        case 3:
            FuramaView.disPlayMainMenu();
            break;
    }
}while (input!=3);
    }
}
