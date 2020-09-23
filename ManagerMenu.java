
import java.util.HashMap; // import HashMap class
import java.util.Map; // import Map Interface
public class ManagerMenu {
    // ArrayList<Employee> employeeArray = new ArrayList<Employee>();
    HashMap<String, Employee> employeeMap = new HashMap<String, Employee>();

    public ManagerMenu(HashMap<String, Employee> employeeMap) {
        this.employeeMap = employeeMap; 
    }
    public Employee inputEmployeeInfo()  {
            InputClass input = new InputClass();

            String ID = "";

            String name = input.inputString("Enter name of employee: ");

            int birthYear = input.inputInt("Enter birth year of employee: ");
            
            int age =0; 
    
            Double grossSalary = input.inputDouble("Enter gross salary of employee: ");
    
            Employee myEmployee = new Employee(ID, name, birthYear, age,grossSalary);
            myEmployee.age = myEmployee.setAndGetAge(birthYear); 
            myEmployee.grossSalary = myEmployee.setAndGetGrossSalary(grossSalary); 
            myEmployee.ID = UniqueIDs.generateUniqueID(); 
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
                        Employee ref = inputEmployeeInfo(); 
                        employeeMap.put(ref.ID, ref); 
                        // employeeArray.add(ref);
                        break;
                    //view
                    case 2: 
                        if (!employeeMap.isEmpty()) {
                            String inputIndex =  input.inputString("Enter the ID of the employee you want to delete: ");
                            if (employeeMap.containsKey(inputIndex)) {
                                employeeMap.remove(inputIndex); 
                            }
                        } 
                        break; 
                    //delete
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
