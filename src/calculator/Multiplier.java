package calculator;

public class Multiplier extends CalculateBase{
    @Override
    public void calculate() {
        setResult( getLeftVal() * getRightVal());
    }
}
