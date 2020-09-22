public class EmployeeMenu {

        EmployeeMenu() {

        }


        public void displayEmployeeMenu() {

                String employeePassword = "Employee123";
                System.out.println("Enter the password: ");
                String userPassword = Input.scanner.nextLine();

                if (employeePassword.equals(userPassword)) {


                        System.out.println("Employee Screen - Type one of the options below:");
                        System.out.println("1. Register a game");
                        System.out.println("2. Remove a game");
                        System.out.println("3. Register a customer");
                        System.out.println("4. Remove a customer");
                        System.out.println("5. Show total rent profit");
                        System.out.println("6. View all games");
                        System.out.println("7. Return to main menu");

                        int employeeChoice = Input.scanner.nextInt();

                        if (employeeChoice == 1) {
                            String employeeC = Input.scanner.next();

                            System.out.println("employee choice is 1 " + employeeC); 
                                //Register a game

                        } else if (employeeChoice == 2) {
                                //Remove a game

                        } else if (employeeChoice == 3) {
                                System.out.println("Register a customer");
                                //Register a customer

                        } else if (employeeChoice == 4) {
                                //Remove a customer

                        } else if (employeeChoice == 5) {
                                //Show total rent profit

                        } else if (employeeChoice == 6) {
                                //view all games

                        } else if (employeeChoice == 7) {
                                //return to main menu

                                // Not working
                                //mainMenu.displayMainMenu();

                        } else {
                                System.out.println("Please choose an option from the menu");
                                //Wrong input

                        }

                } else {
                        System.out.println("Invalid Password");
                }

        }
}