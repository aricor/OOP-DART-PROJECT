import java.util.ArrayList;

public class EmployeeMenu {

        //ArrayList<Employee> employeeArray = new ArrayList<Employee>();
        ArrayList<Game> gameArray = new ArrayList< >();
        ArrayList<Customer> customerArray = new ArrayList< >();

        public EmployeeMenu(ArrayList<Game> gameArray) {
                this.gameArray = gameArray;
        }

        public Game inputGameInfo()  {
                InputClass input = new InputClass();

                String ID = input.inputString("Enter ID: ");

                String title = input.inputString("Enter title: ");

                String genre = input.inputString("Enter genre: ");

                double dailyRent = input.inputDouble("Enter daily rent: ");

                Game myGame = new Game(ID, title, genre, dailyRent);
                return myGame;

        }
        public Customer inputCustomerInfo () {
                InputClass input = new InputClass();

                String ID = input.inputString("Enter ID of customer: ");

                String customerName = input.inputString("Enter name of customer: ");

                Customer myCustomer = new Customer(ID, customerName);
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
                                        System.out.println("Remove a game");
                                        break;
                                case 3:
                                        System.out.println("Register a customer");
                                        Customer customer = inputCustomerInfo();
                                        customerArray.add(customer);
                                        break;
                                case 4:
                                        System.out.println("Remove a customer");
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