package views;

import java.util.Scanner;

public class PromotionManagementView {
    public void promotionManagement(){

    int input;
    do{
        System.out.println("Display list customers use service");
        System.out.println("Display list customers get voucher");
        System.out.println("Return main menu");
        System.out.println("enter your option");
        Scanner scanner=new Scanner(System.in);
        input=Integer.parseInt(scanner.nextLine());
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
