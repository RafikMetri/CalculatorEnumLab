import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: rmetri
 * Date: 10/14/13
 * Time: 8:09 AM
 */

public class Main {
    public static void main (String[] args){
        boolean exit = false;

        Scanner input = new Scanner(System.in);
        Calculate calculate = new Calculate();

        while(exit == false){
            System.out.println(" # Choose an operation by entering it's number:\n    1. Add\n    2. Substract\n    3. Multiply\n    4. Divide");
            int userInput = input.nextInt();

            Operation operation = Operation.ADD;

            switch(userInput){
                case 1:
                    operation = Operation.ADD;
                    break;
                case 2:
                    operation = Operation.SUBSTRACT;
                    break;
                case 3:
                    operation = Operation.MULTIPLY;
                    break;
                case 4:
                    operation = Operation.DIVIDE;
                    break;
            }

            System.out.println(" # Enter the first number:");
            double num1 = input.nextDouble();
            System.out.println(" # Enter the first number:");
            double num2 = input.nextDouble();

            double answer = calculate.calculate(num1, num2, operation);



            System.out.println("\n ## Answer: " + answer + "\n\n # Would you like to make another calculation?\n    1. Yes\n    2. No");
            userInput = input.nextInt();

            if(userInput == 2)
                exit = true;

            System.out.println("\n\n****************\n\n");
        }
        System.out.println("***Program end***");
    }
}