import java.util.Scanner;
import java.util.ArrayList;

public class CustomerMenu {

    CustomerMenu () {

    }
    public void displayCustomerMenu() {

        System.out.println("Customer Screen - Type one of the options below:");
        System.out.println("1. Rent a game");
        System.out.println("2. Return a game");
        System.out.println("3. Return to Main Menu");

        int customerChoice = Main.sc.nextInt();
        if (customerChoice == 1) {
            //Rent a game

        } else if (customerChoice == 2) {
            //Return a game

        } else if (customerChoice == 3){
            new MainMenu();
        } else {
            System.out.println("Please choose an option from the menu"); //Wrong input
        }

    }
}