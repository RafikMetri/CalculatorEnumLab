/**
 * Created with IntelliJ IDEA.
 * User: rmetri
 * Date: 10/14/13
 * Time: 9:26 PM
 */
public class Calculate implements CalculateInterface{
    public Calculate() {

    }

    @Override
    public double calculate(double num1, double num2, Operation operation) {
        double answer = 0;

        switch(operation){
            case ADD:
                answer = num1 + num2;
                break;
            case SUBTRACT:
                answer = num1 - num2;
                break;
            case MULTIPLY:
                answer = num1 * num2;
                break;
            case DIVIDE:
                answer = num1 / num2;
                break;
        }

        return answer;
    }
}