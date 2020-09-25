import java.util.UUID;

public class Employee {
    private String ID;
    private String name;
    private int birthYear;
    private int age;
    private double grossSalary;

    public Employee(String ID, String name, int birthYear, int age, double grossSalary) {
        this.ID = ID;
        this.name = name;
        this.birthYear = birthYear;
        this.age = age;
        this.grossSalary = grossSalary;
    }

    public void setID(String UniqueIDs){
    }

    public String getID() {
        String uniqueID = UUID.randomUUID().toString();
        String uniqueIDs = this.ID;
        return this.ID;
    }


    public void setName(String name){
    }

    public String getName(){
        return this.name;
    }


    public void setAge(int birthYear) {
    }

    public int getAge(){
        int currentYear = 2020;
        age = currentYear - birthYear;
        return this.age;
    }


    public double getGrossSalary() {
        if (grossSalary < 100000.00){

        } else if (grossSalary >= 100000.00); {
            grossSalary = grossSalary * 0.7;
        }
        if (age < 22) {
            grossSalary += 4000;

        } else if (22 <= age && age <=30) {
            grossSalary += 6000;

        } else {
            grossSalary += 7500;
        }
        return this.grossSalary;
    }

    public void setGrossSalary(double grossSalary, int age){
        //return this.grossSalary;
    }

    public void print () {
      System.out.println( this.ID + " : " + this.name + " - " + this.birthYear + " (" + this.age + "): " + this.grossSalary + "  sek");
      System.out.println();
    }
}
