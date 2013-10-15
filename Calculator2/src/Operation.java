/**
 * Created with IntelliJ IDEA.
 * User: rmetri
 * Date: 10/14/13
 * Time: 8:10 AM
 */

public enum Operation{
    ADD((double)0, (double)0),
    SUBTRACT((double)0, (double)0),
    MULTIPLY((double)0, (double)0),
    DIVIDE((double)0, (double)0);

    private double num1;
    private double num2;

    Operation(double _num1, double _num2) {
        num1 = _num1;
        num2 = _num2;
    }
}