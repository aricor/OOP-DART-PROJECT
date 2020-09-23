public class Employee {
    String ID;
    String name;
    int birthYear;
    int age;
    double grossSalary;

    public Employee(String ID, String name, int birthYear,  double grossSalary) {
        this.ID = ID;
        this.name = name;
        this.birthYear = birthYear;
        this.grossSalary = grossSalary;
    }

    public int setAndGetAge(int birthYear) {
        int currentYear = 2020;
        this.age = currentYear - birthYear;
        return this.age; 
    }

    public double setAndGetGrossSalary(double grossSalary, int age) {  //CALL IN THE MAIN.JAVA IS NOT
        if (grossSalary < 100000.00){
            this.grossSalary = grossSalary;
        } else if (grossSalary >= 100000.00); {
            this.grossSalary = grossSalary * 0.7;
        }
        if (age < 22) {
            this.grossSalary+=4000; 
        } else if (22<= age && age <=30) {
            this.grossSalary+=6000; 
        } else {
            this.grossSalary+=7500; 
        }
        return this.grossSalary; 
    }


    public void print () {
      System.out.println( this.ID + " : " + this.name + " - " + this.birthYear + " (" + this.age + "): " + this.grossSalary + " SEK. ");
      System.out.println();
    }
}
