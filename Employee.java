public class Employee {
    String ID;
    String name;
    int birthYear;
    int age;
    double grossSalary;

    public Employee(String ID, String name, int birthYear, int age, double grossSalary) {
        this.ID = ID;
        this.name = name;
        this.birthYear = birthYear;
        this.age = age;
        this.grossSalary = grossSalary;
    }


    public int getAge() {
        int currentYear = 2020;
        this.age = currentYear - birthYear;
        return age;
    }

    //public void setAge(int age) {
        //int currentYear = 2020;
        //this.age = currentYear - birthYear;
   // }


    public double getGrossSalary(double grossSalary) {  //CALL IN THE MAIN.JAVA IS NOT
        if (grossSalary < 100000.00){
            this.grossSalary = grossSalary;
        } else if (grossSalary >= 100000.00); {
            this.grossSalary = grossSalary * 0.7;
        }
        return grossSalary;
    }

    //public void setGrossSalary(double grossSalary) {
        //if (grossSalary < 100000.00){
           // this.grossSalary = grossSalary;
       // } else if (grossSalary >= 100000.00); {
            //this.grossSalary = grossSalary * 0.7;
       // }

   // }


    public void print () {
      System.out.println( this.ID + " : " + this.name + " - " + this.birthYear + " (" + this.age + "): " + this.grossSalary + " SEK. ");
      System.out.println();
    }
}
