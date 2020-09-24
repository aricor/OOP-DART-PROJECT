import java.util.HashMap;
import java.util.Map;

public class EmployeeMenu {

        HashMap<String, Game> gameMap = new HashMap<String, Game>();
        HashMap<String, Customer> customerMap = new HashMap<String, Customer>();

        public EmployeeMenu(HashMap<String, Game> gameMap, HashMap<String, Customer> customerMap )  {
                this.gameMap = gameMap;
                this.customerMap = customerMap;
        }

        public HashMap<String, Game> getGameMap () {
          return gameMap; 
        }

        /*public CustomerMenu(HashMap<String, Customer> customerMap) {
          this.customerMap = customerMap;
        }*/

        public Game inputGameInfo()  {

                InputClass input = new InputClass();

                //String ID = ""; 
                String ID = input.inputString("Enter ID: ");

                String title = input.inputString("Enter title: ");

                String genre = input.inputString("Enter genre: ");

                double dailyRent = input.inputDouble("Enter daily rent: ");

                Game myGame = new Game(ID, title, genre, dailyRent);
                //myGame.ID = UniqueIDs.generateUniqueID();
                return myGame;

        }

        public Customer inputCustomerInfo () {
                InputClass input = new InputClass();

                String ID = "";

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


                        System.out.println("Employee Screen - Type one of the options below:");
                        System.out.println("1. Register a game");
                        System.out.println("2. Remove a game");
                        System.out.println("3. Register a customer");
                        System.out.println("4. Remove a customer");
                        System.out.println("5. Show total rent profit");
                        System.out.println("6. View all customers");
                        System.out.println("7. View all games");
                        System.out.println("8. Return to main menu");

                        int employeeChoice = input.inputInt("");

                        switch(employeeChoice){
                                case 1:
                                        System.out.println("Register a game");
                                        Game ref = inputGameInfo();
                                        gameMap.put(ref.ID, ref);
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
                                        customerMap.put(customer.ID, customer);
                                        for (Map.Entry<String, Customer> entry: customerMap.entrySet()) {
                                                Customer customerObject = entry.getValue();
                                                customerObject.print();
                                        }
                                        break;
                                case 4:
                                        if (!customerMap.isEmpty()) {
                                                String inputIndex =  input.inputString("Enter the ID of the customer you want to delete: ");
                                                if (customerMap.containsKey(inputIndex)) {
                                                        customerMap.remove(inputIndex);
                                                        System.out.println("Successfully deleted with ID " + inputIndex); 
                                                } else {
                                                        System.out.println("Customer with id " + inputIndex + " not found");
                                                }
                                        } else {
                                          System.out.println("There is no customer to remove"); 
                                        }
                                        break;
                                case 5:
                                        //Show total rent profit
                                        int totalProfitForEmployees = 0;
                                        for (Map.Entry<String, Game> entry: gameMap.entrySet()) {
                                          Game gameObject = entry.getValue();
                                          totalProfitForEmployees += gameObject.totalProfit;  
                                          }
                                        System.out.println("Your total rent profit is: " + totalProfitForEmployees); 
                                        break;
                                case 6:
                                        //view all customers
                                        for (Map.Entry<String, Customer> entry: customerMap.entrySet()) {
                                                Customer customerObject = entry.getValue();
                                                customerObject.print();
                                        }
                                        break;
                                case 7:
                                        //view all games
                                        for (Map.Entry<String, Game> entry: gameMap.entrySet()) {
                                                Game gameObject = entry.getValue();
                                                gameObject.print();
                                        }
                                        break;
                                case 8:
                                        //return to main menu
                                        // Not working
                                     //mainMenu.displayMainMenu();
                                        break;
                                default:
                                        System.out.println("Please choose an option from the menu");
                                        //Wrong input
                        }

                } else {
                        System.out.println("Invalid Password!");
                }

        }

}