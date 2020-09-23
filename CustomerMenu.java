import java.util.ArrayList;

public class CustomerMenu {

    ArrayList<Customer> customerArray;

    public CustomerMenu(ArrayList<Customer> customerArray) {
        this.customerArray = customerArray;
    }

        public void displayCustomerMenu() {

            int exit = 0; 
            do {

                InputClass input = new InputClass();

                System.out.println("Customer Screen - Type one of the options below:");
                System.out.println("1. Rent a game");
                System.out.println("2. Return a game");
                System.out.println("3. Return to Main Menu");
                int customerChoice = input.inputInt("");

                switch (customerChoice) {
                    case 1: //rent a game
                        //System.out.println("Successfully rented!");
                        //System.out.println("Game with id <ID> is already rented");
                        //System.out.println("Game with id <ID> not found"); - if the input the wrong ID
                        break;

                    case 2: //return a game
                        //System.out.println("Please enter game ID: ");
                        //System.out.println("Game returned.");
                        break;

                    case 3:
                        //new MainMenu();
                        exit = 1;

                    default:
                        //Wrong input
                        System.out.println("Please choose an option from the menu");
                }
            
            } while (exit != 1);
            
        }
    }
