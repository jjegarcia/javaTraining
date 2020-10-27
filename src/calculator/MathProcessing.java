package calculator;

public interface MathProcessing {
    String SEPARATOR =" ";
    String getKeyWord();
    double doCalculation(double leftVal, double rightVal);
    default String getFormattedOutput(){
        return null;
    }
    default double test(double leftVal, double rightVal) {
        double test= leftVal+rightVal;
    return test ;
    }
}
