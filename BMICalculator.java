import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args){
        //declare variables
        double height;
        double weight;
        double bmi;
        boolean keepgoing = true;
        Scanner reader  = new Scanner(System.in);
        //double semicolon makes it an infinite loop

        for(;;) {

        System.out.println("What is your height in inches?");
        height = reader.nextDouble();
        System.out.println("What is your weight in pounds?");
        weight = reader.nextDouble();
        
        bmi = weight / (height * height) * 703;
        System.out.print("BMI:");
        System.out.println(bmi);
        System.out.println("Do you want to go again? (y/n)");
        if (keepgoing) {
            String input = reader.next();
            if(input.equals("n")) System.exit(0);
            else if (input.equals("y")) keepgoing = true;
            else System.out.println("Type y or n") ;
            }
        }
    }
}