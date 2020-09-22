public class EmployeeMenu {

        EmployeeMenu() {

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
                                        System.out.println("employee choice is 1 " + employeeChoice); 
                                        //Register a game
                                        break;
                                case 2: 
                                        //register a game
                                        break;
                                case 3:
                                        System.out.println("Register a customer");
                                        //Register a customer
                                        break;
                                case 4:
                                        //Remove a customer
                                        break;
                                case 5:
                                        //Show total rent profit
                                        break;
                                case 6:
                                        //view all games
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
                        System.out.println("Invalid Password");
                }

        }
}