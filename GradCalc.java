import java.util.Scanner;


public class GradCalc {
    public static void main(String[] args){
        Scanner gradeScan = new Scanner(System.in);

        boolean running = true;

        while (running) { 
            System.out.print("Enter your grade percentage: ");
            int grade = gradeScan.nextInt();

            if (grade >= 90){
                System.out.println("You have an A!");
            } 
            else if (grade >= 80){
                System.out.println("You have a B!");
            }
            else if (grade >= 70){
                System.out.println("You have a C");
            }
            else if (grade >= 60){
                System.out.println("You have a D");
            }
            else if (grade < 60) {
                System.out.println("You have an F");
            }
            else {
                System.out.println("Invalid input");
            }

            System.out.print("Would you like to calculate another grade? ");
            String answer = gradeScan.next();

            if (answer.equalsIgnoreCase("n")){
                running = false;
            }
        }
    }  
}
