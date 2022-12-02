package controllers;

import java.util.Scanner;

public class FuramaController {
    public static void disPlayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int numberInput;
        do {

            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            System.out.println("enter your option");
            numberInput = Integer.parseInt(scanner.nextLine());
            switch (numberInput) {
                case 1:
                    EmployeeManagementController employeeManagementController = new EmployeeManagementController();
                    employeeManagementController.employeeManagement();
                    break;
                case 2:
                    CustomerManagementController customerManagementController = new CustomerManagementController();
                    customerManagementController.customerManagement();
                    break;
                case 3:
                    FacilityManagementController facilityManagementController = new FacilityManagementController();
                    facilityManagementController.facilityManagement();
                    break;
                case 4:
                    BookingManagementController bookingManagementController = new BookingManagementController();
                    bookingManagementController.bookingManagement();
                    break;
                case 5:
                    PromotionManagementController promotionManagementController = new PromotionManagementController();
                    promotionManagementController.promotionManagement();
                    break;
            }
        } while (numberInput != 6);
    }

    public static void main(String[] args) {
        disPlayMainMenu();
    }
}
