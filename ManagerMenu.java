import java.util.ArrayList;
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
            
            int age =0;
    
            double grossSalary = input.inputDouble("Enter gross salary of employee: ");

            Employee myEmployee = new Employee(ID, name, birthYear, age, grossSalary);
            myEmployee.getAge();
            //ID = UniqueIDs.generateUniqueID();
            myEmployee.getGrossSalary(); //= myEmployee.getGrossSalary(grossSalary, myEmployee.getAge());
            return myEmployee;

            //Employee myEmployee = new Employee(ID, name, birthYear, age, grossSalary);
            //myEmployee.getAge(); //= myEmployee.setAndGetAge(birthYear);
            //myEmployee.getGrossSalary(); //= myEmployee.getGrossSalary(grossSalary, myEmployee.getAge());
            //myEmployee.getID(); //= UniqueIDs.generateUniqueID();
            //return myEmployee;
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
                System.out.println("2. Remove an employee");
                System.out.println("3. View all employees");
                System.out.println("4. Return to the main menu");
                int managerChoice = input.inputInt("");

                //check user choice
                switch(managerChoice) {
                    // add 
                    case 1: 
                        Employee ref = inputEmployeeInfo(); 
                        employeeMap.put(ref.getID(), ref);
                        break;
                    //delete
                    case 2: 
                        if (!employeeMap.isEmpty()) {
                            String inputIndex =  input.inputString("Enter the ID of the employee you want to delete: ");
                            if (employeeMap.containsKey(inputIndex)) {
                                employeeMap.remove(inputIndex); 
                            } else {
                                System.out.println("Employee with id " + inputIndex + " not found"); 
                            }
                        } 
                        break; 
                    //view
                    case 3:
                        if (!employeeMap.isEmpty()) {
                            for (Map.Entry<String, Employee> entry : employeeMap.entrySet()) {
                                Employee employeeObject = entry.getValue();
                                employeeObject.print();
                            }
                        } else {
                            System.out.println("No employees registered");
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
