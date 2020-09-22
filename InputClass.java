import java.util.Scanner;

public class InputClass {

    private static Scanner input;

    InputClass () {
        input = new Scanner(System.in);
    }

    public String inputString (String message){
        String returnValue;
        System.out.println(message);
        returnValue = input.nextLine();

        return returnValue;
    }
    
    public int inputInt (String message){
        int returnValue = 0;

        System.out.println(message);
        returnValue = input.nextInt();
        input.nextLine();
        return returnValue;
        
    }

    public double inputDouble (String message){
        double returnValue = 0.0;

        System.out.println(message);
        returnValue = input.nextDouble();
        input.nextLine();
        return returnValue;
        
    }

}