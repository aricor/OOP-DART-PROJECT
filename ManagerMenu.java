import java.util.ArrayList;

public class ManagerMenu {
    ArrayList<Employee> employeeArray = new ArrayList< >();

    public ManagerMenu(ArrayList<Employee> employeeArray) {
        this.employeeArray = employeeArray; 
    }
    public Employee inputEmployeeInfo()  {
            InputClass input = new InputClass();

            String ID = input.inputString("Enter ID of employee: ");

            String name = input.inputString("Enter name of employee: ");

            int birthYear = input.inputInt("Enter birth year of employee: ");
            
            int age = input.inputInt("Enter age of employee: ");
    
            double grossSalary = input.inputDouble("Enter gross salary of employee: ");
    
            Employee myEmployee = new Employee(ID, name, birthYear, age,grossSalary);
            return myEmployee; 

    }
    public void displayManagerMenu () {
            InputClass input = new InputClass();

            //Enter password
            String managerPassword = "Manager123";
            String userPassword = input.inputString("Enter the password: ");

            //check password
            if (userPassword.equals(managerPassword)) {
                System.out.println("Success!");
                //Epic feature 2
                //Show the menu
                System.out.println("Manager Screen - Type one of the options below:");
                System.out.println("1. Add an employee");
                System.out.println("2. View all employees");
                System.out.println("3. Return to the main menu");
                int managerChoice = input.inputInt("");

                //check user choice
                switch(managerChoice) {
                    case 1: 
                         Employee ref = inputEmployeeInfo(); 
                        employeeArray.add(ref);
                        break;

                    case 2:
                        for (Employee employeeElement : employeeArray) {
                            employeeElement.print();
                        }
                        break;

                    case 3: 
                        MainMenu.displayMainMenu(); 
                        break;

                    default:
                         System.out.println("Please choose from the menu");

                }

            } else {
                System.out.println("Invalid password");
            }

           

    }
}
