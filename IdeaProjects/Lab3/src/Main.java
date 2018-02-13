import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int mpg;
        double capacity;
        double gasPercent;
        Scanner scanner = new Scanner(System.in);

        //Adding a new line for the github difference test: Test 1!
        System.out.println("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
        mpg = scanner.nextInt();
        if (mpg <= 0){
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
            System.exit(0);
        }
        System.out.println("Enter your car's tank capacity (gallons) as a positive decimal number: ");
        capacity = scanner.nextDouble();
        if (capacity <= 0){
            System.out.print("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
            System.exit(0);
        }
        System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
        gasPercent = scanner.nextDouble();
        if (gasPercent < 0 || gasPercent > 100) {
            System.out.print("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
            System.exit(0);
        }
        double range = ((mpg * (capacity* (gasPercent*0.01))));
        Math.floor(range);
        if(range <= 25) {
            System.out.print("Attention! Your current estimated range is running low: " + (int) range + " miles left!!!");
        }
        else{
            System.out.print("Keep driving! Your current estimated range is: " + (int) range + " miles!");
        }
    }
}
