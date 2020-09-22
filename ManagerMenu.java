import java.util.Scanner;
import java.util.ArrayList; 

public class ManagerMenu {
    ArrayList<Employee> employeeArray = new ArrayList<Employee>();

    public ManagerMenu(ArrayList<Employee> employeeArray) {
        this.employeeArray = employeeArray; 
    }
    public static Employee inputEmployeeInfo()  {
            System.out.println("Enter ID of employee: ");

            String ID = Main.sc.next();
    
            Main.sc.nextLine();
    
            System.out.println("Enter name of employee: ");
            String name = Main.sc.next();
            Main.sc.nextLine();
    
            System.out.println("Enter birth year of employee: ");
            int birthYear = Main.sc.nextInt();
            Main.sc.nextLine();
    
            System.out.println("Enter age of employee: ");
            int age = Main.sc.nextInt(); //use a calculator?
            Main.sc.nextLine();
    
            System.out.println("Enter gross salary of employee: ");
            Double grossSalary = Main.sc.nextDouble();
            Main.sc.nextLine();
    
            Employee myEmployee = new Employee(ID, name, birthYear, age,grossSalary);
            return myEmployee; 
        // Scanner input = null; 
        // try {
        //     input = new Scanner(System.in);
        //     System.out.println("Enter ID of employee: ");

        //     String ID = input.next();
    
        //     input.nextLine();
    
        //     System.out.println("Enter name of employee: ");
        //     String name = input.next();
        //     input.nextLine();
    
        //     System.out.println("Enter birth year of employee: ");
        //     int birthYear = input.nextInt();
        //     input.nextLine();
    
        //     System.out.println("Enter age of employee: ");
        //     int age = input.nextInt(); //use a calculator?
        //     input.nextLine();
    
        //     System.out.println("Enter gross salary of employee: ");
        //     Double grossSalary = input.nextDouble();
        //     input.nextLine();
    
        //     Employee myEmployee = new Employee(ID, name, birthYear, age,grossSalary);
        //     return myEmployee; 
        // } 
        // finally {
        //     if (input!= null) input.close(); 

        // }
 

    }
    public void displayManagerMenu () {
            System.out.println("Manager Screen - Type one of the options below:");
            System.out.println("1. Add an employee");
            System.out.println("2. View all employees");
            System.out.println("3. Return to the main menu");
            int managerChoice = Main.sc.nextInt();
            // String inputNumber = inputManager.nextLine();
            Main.sc.nextLine();
            //inputManager.close(); 
    
            if (managerChoice == 1) {
    
                String managerPassword = "Manager123";
                Scanner inputPassword = new Scanner(System.in);
                System.out.println("Enter the password: ");
                String userPassword;
                userPassword = inputPassword.nextLine();
                inputPassword.close();
                if (userPassword.equals(managerPassword)) {
                    System.out.println("Success!");
                    //Epic feature 2
                    // Scanner inputEmployeeInfo = null;
                    // Employee ref = inputEmployeeInfo(inputEmployeeInfo); 
                    // employeeArray.add(ref);
                    Employee ref = inputEmployeeInfo(); 
                    employeeArray.add(ref);
    
                } else {
                    System.out.println("Invalid password");
                }
    
            } else if (managerChoice == 2) {
                // View employee information
                  for (Employee employeeElement : employeeArray) {
                  employeeElement.print(); 
                }
    
            } else if (managerChoice == 3) {
                System.out.println("main menu");
            } else {
                System.out.println("Please choose from the menu");
            }
        // Scanner inputManager = null;
        // try {
        //     inputManager = new Scanner(System.in); 
        //     System.out.println("Manager Screen - Type one of the options below:");
        //     System.out.println("1. Add an employee");
        //     System.out.println("2. View all employees");
        //     System.out.println("3. Return to the main menu");
        //     int managerChoice = inputManager.nextInt();
        //     // String inputNumber = inputManager.nextLine();
        //     inputManager.nextLine();
        //     //inputManager.close(); 
    
        //     if (managerChoice == 1) {
    
        //         String managerPassword = "Manager123";
        //         Scanner inputPassword = new Scanner(System.in);
        //         System.out.println("Enter the password: ");
        //         String userPassword;
        //         userPassword = inputPassword.nextLine();
        //         inputPassword.close();
        //         if (userPassword.equals(managerPassword)) {
        //             System.out.println("Success!");
        //             //Epic feature 2
        //             // Scanner inputEmployeeInfo = null;
        //             // Employee ref = inputEmployeeInfo(inputEmployeeInfo); 
        //             // employeeArray.add(ref);
        //             Employee ref = inputEmployeeInfo(); 
        //             employeeArray.add(ref);
    
        //         } else {
        //             System.out.println("Invalid password");
        //         }
    
        //     } else if (managerChoice == 2) {
        //         // View employee information
        //           for (Employee employeeElement : employeeArray) {
        //           employeeElement.print(); 
        //         }
    
        //     } else if (managerChoice == 3) {
        //         System.out.println("main menu");
        //     } else {
        //         System.out.println("Please choose from the menu");
        //     }
        // }
        // finally {
        //     if (inputManager!= null) inputManager.close(); 
        // }
    }
}
