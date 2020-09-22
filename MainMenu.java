import java.util.ArrayList;

//import sun.awt.www.content.audio.x_aiff; 
public class MainMenu {

    MainMenu () {

    }

    public static void displayMainMenu () {
        ArrayList<Employee> employeeArray = new ArrayList<Employee>();
        ArrayList<Game> gameArray = new ArrayList<Game>();
        ArrayList<Customer> customerArray = new ArrayList<Customer>();
        InputClass input = new InputClass();

        int exit = 0;
        do {
            System.out.println("Main menu: ");
            System.out.println("Welcome to DART, your good old game rental system. The competition has no steam to keep up!");
            System.out.println();
            System.out.println("Please specify your role by entering one of the options given: ");
            System.out.println("1. Enter 'M' for Manager");
            System.out.println("2. Enter 'E' for Employee");
            System.out.println("3. Enter 'C' for Customer");
            System.out.println("4. Enter 'X' to exit system");

            String choice = input.inputString("");

            if (choice.equalsIgnoreCase("M")) {
                //managerMenu(employeeArray);
                ManagerMenu managerMenu = new ManagerMenu(employeeArray); 
                managerMenu.displayManagerMenu(); 
            } else if (choice.equalsIgnoreCase("E")) { 
                //employeeMenu();
                EmployeeMenu employeeMenu = new EmployeeMenu(gameArray);
                employeeMenu.displayEmployeeMenu();
            } else if (choice.equalsIgnoreCase("C")) {
               // customerMenu();
               CustomerMenu customerMenu = new CustomerMenu(customerArray);
               customerMenu.displayCustomerMenu();
            } else if (choice.equalsIgnoreCase("X")) {
                System.out.println("Exiting the system");
                //System.exit(0);
                exit = 1;
            } else {
                System.out.println("Please choose an option from the menu ");
            }
        } while ( exit != 1);

    }
}