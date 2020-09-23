
import java.util.HashMap; // import HashMap class
import java.util.Map; // import Map Interface
public class ManagerMenu {
    HashMap<String, Employee> employeeMap = new HashMap<String, Employee>();

    public ManagerMenu(HashMap<String, Employee> employeeMap) {
        this.employeeMap = employeeMap; 
    }
    public Employee inputEmployeeInfo()  {
            InputClass input = new InputClass();

            String ID = UniqueIDs.generateUniqueID(); 

            String name = input.inputString("Enter name of employee: ");

            int birthYear = input.inputInt("Enter birth year of employee: ");
                
            double grossSalary = input.inputDouble("Enter gross salary of employee: ");
    
            Employee myEmployee = new Employee(ID, name, birthYear,grossSalary);
            myEmployee.age = myEmployee.setAndGetAge(birthYear); 
            myEmployee.grossSalary = myEmployee.setAndGetGrossSalary(grossSalary, myEmployee.age); 
            // myEmployee.ID = UniqueIDs.generateUniqueID(); 
            return myEmployee; 
    }

    public void displayManagerMenu () {
            InputClass input = new InputClass();

            //Entere password   
            String managerPassword = "Manager123";
            String userPassword = input.inputString("Enter the password: ");

            //check password
            if (userPassword.equals(managerPassword)) {
                System.out.println("Success!");
                //Epic feature 2
                //Show the menu
                System.out.println("Manager Screen - Type one of the options below:");
                System.out.println("1. Add an employee");
                System.out.println("2. Remove an employee");

                System.out.println("3. View all employees");
                System.out.println("4. Return to the main menu");
                int managerChoice = input.inputInt("");

                //check user choice
                switch(managerChoice) {
                    // add 
                    case 1: 
                        Employee employeeRef = inputEmployeeInfo(); 
                        employeeMap.put(employeeRef.ID, employeeRef); 
                        break;
                    //delete
                    case 2: 
                        if (!employeeMap.isEmpty()) {
                            String inputIndex =  input.inputString("Enter the ID of the employee you want to delete: ");
                            if (employeeMap.containsKey(inputIndex)) {
                                employeeMap.remove(inputIndex); 
                                System.out.println("Successfully removed"); 
                            } else {
                                System.out.println("Employee with id " + inputIndex + " not found"); 
                            }
                        } else {
                            System.out.println("There is no employee here"); 
                        }
                        break; 
                    //view
                    case 3:
                        for (Map.Entry<String, Employee> entry: employeeMap.entrySet()) {
                            Employee employeeObject = entry.getValue();
                            employeeObject.print();  
                        }
                        break;
                    // go back to main menu 
                    case 4: 
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
