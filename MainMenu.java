import java.util.HashMap; // import HashMap class
//import sun.awt.www.content.audio.x_aiff; 
public class MainMenu {

    MainMenu () {

    }

    public static void displayMainMenu () {
        HashMap<String, Employee> employeeMap = new HashMap<String, Employee>();
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
                ManagerMenu managerMenu = new ManagerMenu(employeeMap); 
                managerMenu.displayManagerMenu(); 
            } else if (choice.equalsIgnoreCase("E")) { 
                // EmployeeMenu employeeMenu = new EmployeeMenu();
                // employeeMenu.displayEmployeeMenu();
            } else if (choice.equalsIgnoreCase("C")) {
            //    CustomerMenu customerMenu = new CustomerMenu();
            //    customerMenu.displayCustomerMenu();
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