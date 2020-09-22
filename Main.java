import java.util.Scanner;
import java.util.ArrayList; 
  
public class Main {

    public static void mainMenu () {
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
                managerMenu(employeeArray);

            } else if (choice.equalsIgnoreCase("E")) { 
                employeeMenu();
            } else if (choice.equalsIgnoreCase("C")) {
                customerMenu();
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

    public static Employee inputEmployeeInfo(Scanner input)  {
        System.out.println("Enter ID of employee: ");
        String id = input.next();
        input.nextLine();

        System.out.println("Enter name of employee: ");
        String name = input.next();
        input.nextLine();

        System.out.println("Enter birth year of employee: ");
        int birthYear = input.nextInt();
        input.nextLine();

        System.out.println("Enter age of employee: ");
        int age = input.nextInt(); //use a calculator?
        input.nextLine();

        System.out.println("Enter gross salary of employee: ");
        Double grossSalary = input.nextDouble();
        input.nextLine();

        Employee myEmployee = new Employee(id, name, birthYear, age,grossSalary);
        return myEmployee; 

    }

    public static void managerMenu (ArrayList<Employee> employeeArray) {

        Scanner inputManager = null;
        try {
            inputManager = new Scanner(System.in); 
            System.out.println("Manager Screen - Type one of the options below:");
            System.out.println("1. Add an employee");
            System.out.println("2. View all employees");
            System.out.println("3. Return to the main menu");
            int managerChoice = inputManager.nextInt();
            // String inputNumber = inputManager.nextLine();
            inputManager.nextLine();
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
                    Scanner inputEmployeeInfo = new Scanner(System.in);
                    Employee ref = inputEmployeeInfo(inputEmployeeInfo); 
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
                mainMenu();
            } else {
                System.out.println("Please choose from the menu");
            }
        }
        finally {
            if (inputManager!= null) inputManager.close(); 
        }
 
    }

    public static void employeeMenu () {

        String employeePassword = "Employee123";
        Scanner inputPassword = new Scanner(System.in);
        System.out.println("Enter the password: ");
        String userPassword = inputPassword.nextLine();
        inputPassword.close(); 

        if (employeePassword.equals(userPassword)) {

            Scanner inputEmployee = new Scanner(System.in);

            System.out.println("Employee Screen - Type one of the options below:");
            System.out.println("1. Register a game");
            System.out.println("2. Remove a game");
            System.out.println("3. Register a customer");
            System.out.println("4. Remove a customer");
            System.out.println("5. Show total rent profit");
            System.out.println("6. View all games");
            System.out.println("7. Return to main menu");

            int employeeChoice = inputEmployee.nextInt();
            inputEmployee.close(); 
            if (employeeChoice == 1) {
                //Register a game

            } else if (employeeChoice == 2) {
                //Remove a game

            } else if (employeeChoice == 3) {
                System.out.println("Register a customer");
                //Register a customer

            } else if (employeeChoice == 4) {
                //Remove a customer

            } else if (employeeChoice == 5) {
                //Show total rent profit

            } else if (employeeChoice == 6) {
                //view all games

            } else if (employeeChoice == 7) {
                //return to main menu
                mainMenu();

            } else {
                System.out.println("Please choose an option from the menu");
                //Wrong input

            }
        } else {
            System.out.println("Invalid Password");
        }

    }

    public static void customerMenu () {

        Scanner inputCustomer = new Scanner(System.in);

        System.out.println("Customer Screen - Type one of the options below:");
        System.out.println("1. Rent a game");
        System.out.println("2. Return a game");

        System.out.println("3. Return to Main Menu");

        int customerChoice = inputCustomer.nextInt();
        inputCustomer.close(); 
        if (customerChoice == 1) {
            //Rent a game

        } else if (customerChoice == 2) {
            //Return a game

        } else if (customerChoice == 3){
            mainMenu();
        } else {
            System.out.println("Please choose an option from the menu"); //Wrong input
        }


    }

    //methods for removing and adding data to employee and game
    //game and customer profile
    // public static void removeIntArrayElement (int index, int[] anArray) {
    //     anArray[index] = 0;
    // }

    // public static void removeStringArrayElement (int index, String[] anArray) {
    //     anArray[index] = "";
    // }

    // public static void removeDoubleArrayElement (int index, double[] anArray) {
    //     anArray[index] = 0.0;
    // }

    // public static void addIntArrayElement (int index, int[] anArray, int value){
    //     anArray[index] = value;
    // }


    public static void main(String[] args) {
        //public int index = ; 
        //mainMenu();

        MainMenu mainMenu = new MainMenu();

        mainMenu.displayMainMenu();



    }

}
