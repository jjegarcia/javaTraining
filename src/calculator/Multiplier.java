package calculator;

public class Multiplier extends CalculateBase implements MathProcessing{
    public Multiplier(){}
    public Multiplier(double leftVal, double rightVal){
        super(leftVal,rightVal);
    }
    @Override
    public void calculate() {
        setResult( getLeftVal() * getRightVal());
    }

    @Override
    public String getKeyWord() {
        return "multiply";
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        return getResult();
    }
}
