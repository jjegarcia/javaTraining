package calculator;

public class Adder extends CalculateBase{
    @Override
    public void calculate() {
        setResult( getLeftVal() + getRightVal());
    }
}
