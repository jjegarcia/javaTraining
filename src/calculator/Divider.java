package calculator;

public class Divider extends CalculateBase {
    @Override
    public void calculate() {
        double leftVal = getLeftVal();
        setResult(leftVal != 0 ? leftVal / getRightVal() : 0.0d);
    }
}
