public class CustomerMenu {

    CustomerMenu () {

    }
    public void displayCustomerMenu() {

        InputClass input = new InputClass();

        System.out.println("Customer Screen - Type one of the options below:");
        System.out.println("1. Rent a game");
        System.out.println("2. Return a game");
        System.out.println("3. Return to Main Menu");
        int customerChoice = input.inputInt(""); 

        switch(customerChoice){

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