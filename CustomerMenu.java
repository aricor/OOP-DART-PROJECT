import java.util.HashMap;


public class CustomerMenu {

    HashMap<String, Customer> customerMap = new HashMap<String, Customer>();

    public CustomerMenu(HashMap<String, Customer> customerMap)  {
        this.customerMap = customerMap;
    }

    public void displayCustomerMenu() {

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
                    new MainMenu();

                default:
                    //Wrong input
                    System.out.println("Please choose an option from the menu");
            }
        }
    }
