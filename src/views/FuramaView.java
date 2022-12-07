package views;

import java.util.Scanner;

public class FuramaView {
    public static void disPlayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int numberInput = 0;
        do {

            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            System.out.println("enter your option");
                try {
            numberInput = Integer.parseInt(scanner.nextLine());
             }catch (NumberFormatException e){
                 System.out.println(e.getMessage());
             }
            switch (numberInput) {
                case 1:
                    EmployeeManagementView employeeManagementController = new EmployeeManagementView();
                    employeeManagementController.employeeManagement();
                    break;
                case 2:
                    CustomerManagementView customerManagementController = new CustomerManagementView();
                    customerManagementController.customerManagement();
                    break;
                case 3:
                    FacilityManagementView facilityManagementController = new FacilityManagementView();
                    facilityManagementController.facilityManagement();
                    break;
                case 4:
                    BookingManagementView bookingManagementController = new BookingManagementView();
                    bookingManagementController.bookingManagement();
                    break;
                case 5:
                    PromotionManagementView promotionManagementController = new PromotionManagementView();
                    promotionManagementController.promotionManagement();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("please enter option again");
            }
        } while (numberInput != 6);
    }

    public static void main(String[] args) {
        disPlayMainMenu();
    }
}
