package calculator;

public class Divider extends CalculateBase {
    public Divider(){}
    public Divider(double leftVal, double rightVal){
        super(leftVal,rightVal);
    }
    @Override
    public void calculate() {
        double leftVal = getLeftVal();
        setResult(leftVal != 0 ? leftVal / getRightVal() : 0.0d);
    }
}
