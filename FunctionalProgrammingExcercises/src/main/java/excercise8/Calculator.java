package excercise8;

public class Calculator {

    private double accum;

    public Calculator(double number) {
        this.accum = number;
        System.out.print(number);
    }

    public Calculator add(double number){
        accum += number;
        printOperation(number, " + ");
        return this;
    }

    public Calculator subtract(double number) {
        accum -= number;
        printOperation(number, " - ");
        return this;
    }

    public Calculator multiply(double number) {
        accum *= number;
        printOperation(number, " * ");
        return this;
    }

    private void printOperation(double number, String operator) {
        System.out.print(operator + number + " = " + accum);
    }
}
