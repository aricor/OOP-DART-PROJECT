import java.util.HashMap;
import java.util.Map;


public class CustomerMenu {

    HashMap<String, Customer> customerMap = new HashMap<String, Customer>();
    EmployeeMenu employeeMenu;

    public CustomerMenu(HashMap<String, Customer> customerMap, EmployeeMenu employeeMenu)  {
        this.customerMap = customerMap;
        this.employeeMenu = employeeMenu;
    }

    public void displayCustomerMenu() {

            InputClass input = new InputClass();

            System.out.println("Customer Screen - Type one of the options below:");
            System.out.println("1. Rent a game");
            System.out.println("2. Return a game");
            System.out.println("3. Return to Main Menu");
            int customerChoice = input.inputInt("");

            HashMap<String, Game> GameMapRef = employeeMenu.getGameMap();
            switch (customerChoice) {
                case 1: //rent a game
                    if (!GameMapRef.isEmpty()) {
                      //display games
                      System.out.println("Game List:"); 
                      for (Map.Entry<String, Game> entry: GameMapRef.entrySet()) {
                        Game gameObject = entry.getValue();
                        gameObject.print();
                      }
                      //input id 
                      String gameId = input.inputString("Please enter the game id: ");
                       if (GameMapRef.containsKey(gameId)) {
                          Game gameObject = GameMapRef.get(gameId); 
                          // check if it is rented or not 
                          if (!gameObject.getRentStatus()){
                            //change rent status
                            gameObject.setRentStatus(true);
                            System.out.println("Successfully rented"); 
                          } else {
                            //already rented
                            System.out.println("This game is currently rented");
                          }
                        } else {
                          System.out.println("Game with id " + gameId + " not found");
                               }
                    } else {
                      // print no game 
                      System.out.println("There are no games available");
                    }  
                    
                    break;

                case 2: //return a game
                    //System.out.println("Please enter game ID: ");
                    //System.out.println("Game returned.");
                    //ID
                    //number of rented days'
                    String CustomerGameId = input.inputString("Please enter the ID of the game you want to return: ");
                    int daysRented = input.inputInt("Number of days rented: ");

                    if (!GameMapRef.isEmpty()) {
                        if (GameMapRef.containsKey(CustomerGameId)) {
                          //check if has been rentef if rentstatus == true
                          Game gameObject = GameMapRef.get(CustomerGameId);
                          if(gameObject.getRentStatus()){
                            gameObject.setRentStatus(false);
                            gameObject.setTotalProfit(daysRented);
                            System.out.println("Total cost: " + gameObject.getDailyRent()*daysRented);
                          } else {
                            System.out.println("This game has not been rented");
                          }
      
                          // gameObject.totalProfit += daysRented*gameObject.dailyRent; 
                           //System.out.println("total profit for this game: " + gameObject.totalProfit); 
                          //  gameObject.setTotalProfit(daysRented); 
                          //  gameObject.printTotalProfit(); 0
                          //  double gameOject.totalProfit = gameObject.getDailyRent()*daysRented; 
                          //  System.out.println("Total amount: " + gameObject.getDailyRent()*daysRented);
                        }
                     } else {
                       System.out.println("No games here");
                     }
                
                    break;

                case 3:
                    //new MainMenu();
                    MainMenu.displayMainMenu();

                default:
                    //Wrong input
                    System.out.println("Please choose an option from the menu");
            }
        }
    }