import java.util.ArrayList;

public class CustomerMenu {

    ArrayList<Customer> customerArray = new ArrayList<Customer>();

    public CustomerMenu(ArrayList<Customer> customerArray) {
        this.customerArray = customerArray;
    }
    public Customer inputCustomerInfo () {
            InputClass input = new InputClass();

            String ID = input.inputString("Enter ID of customer: ");

            String customerName = input.inputString("Enter name of employee: ");

            Customer myCustomer = new Customer(ID, customerName);
            return myCustomer;
        }


        public void displayCustomerMenu() {

            InputClass input = new InputClass();

            System.out.println("Customer Screen - Type one of the options below:");
            System.out.println("1. Rent a game");
            System.out.println("2. Return a game");
            System.out.println("3. Return to Main Menu");
            int customerChoice = input.inputInt("");

            switch (customerChoice) {

                case 1:
                    //rent a game
                    break;
                case 2:
                    //return a game
                    break;
                case 3:
                    new MainMenu();
                default:
                    //Wrong input
                    System.out.println("Please choose an option from the menu");
            }
        }
    }
