package views;

import model.Employee;
import services.impl.EmployeeServiceImpl;

import java.util.List;
import java.util.Scanner;

public class EmployeeManagementView {
    public void employeeManagement() {
        EmployeeServiceImpl employeeService=new EmployeeServiceImpl();
        Scanner scanner=new Scanner(System.in);
        int input;
do{
        System.out.println("1. Display  list employees");
        System.out.println("2. Add new employee");
        System.out.println("3.Delete employee");
        System.out.println("4. Edit employee");
        System.out.println("5.Return main menu");

        System.out.println("enter your choose");
         input=Integer.parseInt(scanner.nextLine());
        switch (input) {
            case 1:
                List<Employee> list=employeeService.disPlay();
                System.out.println(list);
                break;
            case 2:

                System.out.println("enter id of Employee ");
                String idEmployee = scanner.nextLine();
                System.out.println(" enter name of Employee");
                String nameEmployee = scanner.nextLine();
                System.out.println("enter sex of Employee");
                String sexEmployee = scanner.nextLine();
                System.out.println("enter CMND of Employee");
                String cmndEmployee = scanner.nextLine();
                System.out.println("enter email of Employee");
                String email = scanner.nextLine();
                System.out.println("enter type of Employee");
                String typeEmployee = scanner.nextLine();
                System.out.println("enter address of Employee");
                String addressEmployee = scanner.nextLine();
                System.out.println("enter salary of Employee");
                long salaryEmployee =Long.parseLong(scanner.nextLine());
                Employee employee = new Employee(idEmployee, nameEmployee, sexEmployee, cmndEmployee, email,
                        typeEmployee, addressEmployee, salaryEmployee);
                employeeService.addEmployee(employee);
                break;
            case 3:
                System.out.println("enter id of Employee ");
                String idEmployee1 = scanner.nextLine();
                employeeService.deleteEmployee(idEmployee1);
                break;
            case 4:
                System.out.println("enter id of Employee ");
                String idEmployee2= scanner.nextLine();
                System.out.println(" enter name of Employee");
                String nameEmployee1 = scanner.nextLine();
                System.out.println("enter sex of Employee");
                String sexEmployee1 = scanner.nextLine();
                System.out.println("enter CMND of Employee");
                String cmndEmployee1 = scanner.nextLine();
                System.out.println("enter email of Employee");
                String email1 = scanner.nextLine();
                System.out.println("enter type of Employee");
                String typeEmployee1 = scanner.nextLine();
                System.out.println("enter address of Employee");
                String addressEmployee1 = scanner.nextLine();
                System.out.println("enter salary of Employee");
                long salaryEmployee1 = Long.parseLong (scanner.nextLine());
                Employee employee1 = new Employee(idEmployee2, nameEmployee1, sexEmployee1, cmndEmployee1, email1,
                        typeEmployee1, addressEmployee1, salaryEmployee1);
                employeeService.editEmployee(employee1);
                break;
            case 5:
                FuramaView.disPlayMainMenu();
                break;

        }
    }while (input!=5);
    }   public static void main(String[] args) {

    }
}


