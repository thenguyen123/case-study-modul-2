package views;

import controllers.RegexController;
import model.Employee;
import services.exception.ExceptionAndRegexDayOfBirth;
import services.exception.Regex;
import services.impl.EmployeeServiceImpl;

import java.util.List;
import java.util.Scanner;

public class EmployeeManagementView {
    public void employeeManagement() {
        EmployeeServiceImpl employeeService=new EmployeeServiceImpl();
        Scanner scanner=new Scanner(System.in);
        int input=0;
do{
        System.out.println("1. Display  list employees");
        System.out.println("2. Add new employee");
        System.out.println("3.Delete employee");
        System.out.println("4. Edit employee");
        System.out.println("5.Return main menu");

        System.out.println("enter your choose");
    try {
        input = Integer.parseInt(scanner.nextLine());
    }catch (NumberFormatException e){
        System.out.println(e.getMessage());

    }
        switch (input) {
            case 1:
                List<Employee> list=employeeService.disPlay();
                for (Employee employee:list) {
                    System.out.println(employee.toString());
                }
                break;
            case 2:

                System.out.println("enter id of Employee ");
                String idEmployee = scanner.nextLine();
                System.out.println(" enter name of Employee");
                String nameEmployee = RegexController.result(Regex.Name);
                System.out.println("enter sex of Employee");
                String sexEmployee = scanner.nextLine();
                System.out.println("enter CMND of Employee");
                String cmndEmployee = scanner.nextLine();
                System.out.println("enter email of Employee");
                String email = RegexController.result(Regex.Email);
                System.out.println("enter type of Employee");
                String typeEmployee = scanner.nextLine();
                System.out.println("enter address of Employee");
                String addressEmployee = scanner.nextLine();
                System.out.println("enter salary of Employee");
                int salaryEmployee = Integer.parseInt(RegexController.result(Regex.People));
                String dayOfBirth;
                do{
                    try {
                        System.out.println("enter day of birth of Employee");
                        dayOfBirth = scanner.nextLine();
                        ExceptionAndRegexDayOfBirth.dayOfBirth(dayOfBirth);
                        break;
                    }catch ( Exception e){
                        System.out.println(e.getMessage());
                    }
                }while (true);
                Employee employee = new Employee(idEmployee, nameEmployee, dayOfBirth, sexEmployee, cmndEmployee, email,
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
                String nameEmployee1 = RegexController.result(Regex.Name);
                System.out.println("enter sex of Employee");
                String sexEmployee1 = scanner.nextLine();
                System.out.println("enter CMND of Employee");
                String cmndEmployee1 = scanner.nextLine();
                System.out.println("enter email of Employee");
                String email1 = RegexController.result(Regex.Email);
                System.out.println("enter type of Employee");
                String typeEmployee1 = scanner.nextLine();
                System.out.println("enter address of Employee");
                String addressEmployee1 = scanner.nextLine();
                System.out.println("enter salary of Employee");
                long salaryEmployee1 = Long.parseLong (scanner.nextLine());
                String dayOfBirth1;
                do{
                    try {
                        System.out.println("enter day of birth of Employee");
                        dayOfBirth1 = scanner.nextLine();
                        ExceptionAndRegexDayOfBirth.dayOfBirth(dayOfBirth1);
                        break;
                    }catch ( Exception e){
                        System.out.println(e.getMessage());
                    }
                }while (true);

                Employee employee1 = new Employee(idEmployee2, nameEmployee1,dayOfBirth1, sexEmployee1, cmndEmployee1, email1,
                        typeEmployee1, addressEmployee1, salaryEmployee1);
                employeeService.editEmployee(employee1);
                break;
            case 5:
                FuramaView.disPlayMainMenu();
                break;

        }
    }while (input!=5);

}
}


