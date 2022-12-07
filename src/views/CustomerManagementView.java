package views;

import model.Customer;
import services.exception.ExceptionAndRegexDayOfBirth;
import services.impl.CustomerServiceImpl;

import java.util.List;
import java.util.Scanner;

public class CustomerManagementView {


    public  void customerManagement() {
        CustomerServiceImpl customerService=new CustomerServiceImpl();
        int input;
        do{
        System.out.println("1. Display list customers");
        System.out.println("2. Add new customers");
        System.out.println("3.Edit customer");
        System.out.println("4. Return main menu");
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your choose");
       input =Integer.parseInt(scanner.nextLine());
        switch (input) {
            case 1:
              List<Customer>list= customerService.disPlay();
              for(Customer customer: list) {
                  System.out.println(customer.toString());
              }
                break;
            case 2:
                System.out.println("enter id of Customer ");
                String idCustomer= scanner.nextLine();
                System.out.println(" enter name of Customer");
                String nameCustomer = scanner.nextLine();
                System.out.println("enter sex of Customer");
                String sexCustomer = scanner.nextLine();
                System.out.println("enter CMND of Customer");
                String cmndCustomer = scanner.nextLine();
                System.out.println("enter email of Customer");
                String emailCustomer = scanner.nextLine();
                System.out.println("enter type of Customer");
                String typeCustomer = scanner.nextLine();
                System.out.println("enter address of Customer");
                String addressCustomer = scanner.nextLine();


                String dayOfBirth;
                do{
                    try { System.out.println("enter day of birth of Customer");

                        dayOfBirth= scanner.nextLine();
                        ExceptionAndRegexDayOfBirth.dayOfBirth(dayOfBirth);
                        break;
                    }catch ( Exception e){
                        System.out.println(e.getMessage());
                    }
                }while (true);
               Customer customer=new Customer(idCustomer,nameCustomer,dayOfBirth, sexCustomer,
                       cmndCustomer,emailCustomer,typeCustomer,addressCustomer);
               customerService.add(customer);
                break;
            case 3:
                System.out.println("enter id of Customer ");
                String idCustomer1= scanner.nextLine();
                System.out.println(" enter name of Customer");
                String nameCustomer1 = scanner.nextLine();
                System.out.println("enter sex of Customer");
                String sexCustomer1 = scanner.nextLine();
                System.out.println("enter CMND of Customer");
                String cmndCustomer1 = scanner.nextLine();
                System.out.println("enter email of Customer");
                String emailCustomer1 = scanner.nextLine();
                System.out.println("enter type of Customer");
                String typeCustomer1 = scanner.nextLine();
                System.out.println("enter address of Customer");
                String addressCustomer1 = scanner.nextLine();
                String dayOfBirth1;
                do{
                    try {
                        System.out.println("enter day of birth of Customer");
                        dayOfBirth1 = scanner.nextLine();
                        ExceptionAndRegexDayOfBirth.dayOfBirth(dayOfBirth1);
                        break;
                    }catch ( Exception e){
                        System.out.println(e.getMessage());
                    }
                }while (true);
                Customer customer1=new Customer(idCustomer1,nameCustomer1,dayOfBirth1, sexCustomer1,
                        cmndCustomer1,emailCustomer1,typeCustomer1,addressCustomer1);
                customerService.editCustomer(customer1);
                break;
            case 4:
                FuramaView.disPlayMainMenu();
                break;
        }
        }while (input!=4);
    }
}