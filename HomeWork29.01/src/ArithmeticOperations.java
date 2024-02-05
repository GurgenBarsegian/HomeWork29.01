

public class ArithmeticOperations {
    public double number1;
    public double number2;


    public ArithmeticOperations(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;

    }
    public double getResultMulti (){
        double numberX =number1 * number2;
        return numberX;
    }
    public double getResultDivide () {
        double numberY = number1 / number2;
        return numberY;
    }
    public double getResultAddition () {
        double numberQ = number1 + number2;
        return numberQ;
    }
    public double getResultSubtraction () {
        double numberW = number1 - number2;
        return numberW;
    }

    public boolean isEven () {
        boolean isEven = (getResultAddition() % 2) ==0;
        return isEven;

    }
}
