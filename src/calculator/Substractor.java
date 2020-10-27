package calculator;

public class Substractor extends CalculateBase implements MathProcessing {
    public Substractor() {
    }

    public Substractor(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        setResult(getLeftVal() - getRightVal());
    }

    @Override
    public String getKeyWord() {
        return "substract";
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        return getResult();
    }
}
