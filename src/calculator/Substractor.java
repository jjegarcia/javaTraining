package calculator;

public class Substractor extends CalculateBase{
    public Substractor(){}
    public Substractor(double leftVal, double rightVal){
        super(leftVal,rightVal);
    }
    @Override
    public void calculate() {
        setResult( getLeftVal() - getRightVal());
    }
}
