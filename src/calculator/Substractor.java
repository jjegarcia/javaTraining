package calculator;

public class Substractor extends CalculateBase{
    @Override
    public void calculate() {
        setResult( getLeftVal() - getRightVal());
    }
}
