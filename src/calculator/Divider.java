package calculator;

public class Divider extends CalculateBase implements MathProcessing{
    public Divider(){}
    public Divider(double leftVal, double rightVal){
        super(leftVal,rightVal);
    }
    @Override
    public void calculate() {
        double leftVal = getLeftVal();
        setResult(leftVal != 0 ? leftVal / getRightVal() : 0.0d);
    }

    @Override
    public String getKeyWord() {
        return "divide";
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        return getResult();
    }
}
