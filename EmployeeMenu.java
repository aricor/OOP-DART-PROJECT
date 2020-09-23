import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeMenu {

        ArrayList<Customer> customerArray;
        ArrayList<Game> gameArray;
        HashMap<String, Game> gameMap = new HashMap<String, Game>();
        HashMap<String, Customer> customerMap = new HashMap<String, Customer>();

        public EmployeeMenu(HashMap<String, Game> gameMap) {
        }
        public Game inputGameInfo()  {

                InputClass input = new InputClass();

                String ID = "";

                String title = input.inputString("Enter title: ");

                String genre = input.inputString("Enter genre: ");

                double dailyRent = input.inputDouble("Enter daily rent: ");

                double totalProfit = 0.0;

                Game myGame = new Game(ID, title, genre, dailyRent, totalProfit);
                myGame.ID = UniqueIDs.generateUniqueID();
                return myGame;

        }

        public Customer inputCustomerInfo () {
                InputClass input = new InputClass();

                String ID = input.inputString("Enter ID of customer: ");

                String customerName = input.inputString("Enter name of customer: ");

                Customer myCustomer = new Customer(ID, customerName);
                myCustomer.ID = UniqueIDs.generateUniqueID();
                return myCustomer;
        }

                public void displayEmployeeMenu() {

                InputClass input = new InputClass();

                String employeePassword = "Employee123";
                String userPassword = input.inputString("Enter the password: ");

                if (employeePassword.equals(userPassword)) {

                        int exit = 0;

                        do{
                                System.out.println("Employee Screen - Type one of the options below:");
                                System.out.println("1. Register a game");
                                System.out.println("2. Remove a game");
                                System.out.println("3. Register a customer");
                                System.out.println("4. Remove a customer");
                                System.out.println("5. Show total rent profit");
                                System.out.println("6. View all games");
                                System.out.println("7. Return to main menu");
        
                                int employeeChoice = input.inputInt("");
        
                                switch(employeeChoice){
                                        case 1:
                                                System.out.println("Register a game");
                                                Game game = inputGameInfo();
                                                gameArray.add(game);
                                                break;
                                        case 2:
                                                if (!gameMap.isEmpty()) {
                                                        String inputIndex =  input.inputString("Enter the ID of the game you want to delete: ");
                                                        if (gameMap.containsKey(inputIndex)) {
                                                                gameMap.remove(inputIndex);
                                                        } else {
                                                                System.out.println("Game with id " + inputIndex + " not found");
                                                        }
                                                }
                                                break;
                                        case 3:
                                                System.out.println("Register a customer");
                                                Customer customer = inputCustomerInfo();
                                                customerArray.add(customer);
                                                break;
                                        case 4:
                                                if (!customerMap.isEmpty()) {
                                                        String inputIndex =  input.inputString("Enter the ID of the customer you want to delete: ");
                                                        if (customerMap.containsKey(inputIndex)) {
                                                                customerMap.remove(inputIndex);
                                                        } else {
                                                                System.out.println("Customer with id " + inputIndex + " not found");
                                                        }
                                                }
                                                break;
                                        case 5:
                                                //Show total rent profit
                                                System.out.println("Your total rent profit is: ");
                                                break;
                                        case 6:
                                                //view all games
                                                for (Game gameElement : gameArray) {
                                                        gameElement.print();
                                                }
                                                break;
                                        case 7:
                                                //return to main menu
                                                // Not working
                                                //mainMenu.displayMainMenu();
                                                exit = 1;
                                                break;
                                        default:
                                                System.out.println("Please choose an option from the menu");
                                                //Wrong input
                                }

                        }while(exit != 1);


                } else {
                        System.out.println("Invalid Password!");
                }

        }

}