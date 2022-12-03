package views;

import model.Customer;
import services.impl.CustomerServiceImpl;

import java.util.List;
import java.util.Scanner;

public class CustomerManagementController {


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
                System.out.println(list);
                break;
            case 2:
                System.out.println("enter id of Employee ");
                String idCustomer= scanner.nextLine();
                System.out.println(" enter name of Employee");
                String nameCustomer = scanner.nextLine();
                System.out.println("enter sex of Employee");
                String sexCustomer = scanner.nextLine();
                System.out.println("enter CMND of Employee");
                String cmndCustomer = scanner.nextLine();
                System.out.println("enter email of Employee");
                String emailCustomer = scanner.nextLine();
                System.out.println("enter type of Employee");
                String typeCustomer = scanner.nextLine();
                System.out.println("enter address of Employee");
                String addressCustomer = scanner.nextLine();
               Customer customer=new Customer(idCustomer,nameCustomer,sexCustomer,
                       cmndCustomer,emailCustomer,typeCustomer,addressCustomer);
               customerService.add(customer);
                break;
            case 3:
                System.out.println("enter id of Employee ");
                String idCustomer1= scanner.nextLine();
                System.out.println(" enter name of Employee");
                String nameCustomer1 = scanner.nextLine();
                System.out.println("enter sex of Employee");
                String sexCustomer1 = scanner.nextLine();
                System.out.println("enter CMND of Employee");
                String cmndCustomer1 = scanner.nextLine();
                System.out.println("enter email of Employee");
                String emailCustomer1 = scanner.nextLine();
                System.out.println("enter type of Employee");
                String typeCustomer1 = scanner.nextLine();
                System.out.println("enter address of Employee");
                String addressCustomer1 = scanner.nextLine();
                Customer customer1=new Customer(idCustomer1,nameCustomer1,sexCustomer1,
                        cmndCustomer1,emailCustomer1,typeCustomer1,addressCustomer1);
                customerService.editCustomer(customer1);
                break;
            case 4:
                FuramaController.disPlayMainMenu();
                break;
        }
        }while (input!=4);
    }
}