import java.util.Scanner;
import java.util.ArrayList; 

public class MainMenu {

    MainMenu () {

    }

    public void displayMainMenu () {
        ArrayList<Employee> employeeArray = new ArrayList<Employee>();

        int exit = 0;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Main menu: ");
            System.out.println("Welcome to DART, your good old game rental system. The competition has no steam to keep up!");
            System.out.println();
            System.out.println("Please specify your role by entering one of the options given: ");
            System.out.println("1. Enter 'M' for Manager");
            System.out.println("2. Enter 'E' for Employee");
            System.out.println("3. Enter 'C' for Customer");
            System.out.println("4. Enter 'X' to exit system");

            String choice = input.nextLine();

            if (choice.equalsIgnoreCase("M")) {
                //managerMenu(employeeArray);

            } else if (choice.equalsIgnoreCase("E")) { 
                //employeeMenu();
                EmployeeMenu employeeMenu = new EmployeeMenu();
                employeeMenu.displayEmoloyeeMenu();
            } else if (choice.equalsIgnoreCase("C")) {
               // customerMenu();
            } else if (choice.equalsIgnoreCase("X")) {
                System.out.println("Exiting the system");
                //System.exit(0);
                exit = 1;
            } else {
                System.out.println("Please choose an option from the menu ");
            }
            input.close(); 

        } while ( exit != 1);
        
    }
}