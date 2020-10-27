package calculator;

/*
 ************************************************************************
 * Note: If you have difficulty building the code, it's probably due to
 *       a difference in the version of the JDK used to create this
 *       project and the JDK version you have installed.
 *
 *       To fix the JDK simply click "OK" on the dialog that appears
 *       when the build fails. This will open a project
 *       configuration dialog. On the project configuration dialog,
 *       select the appropriate JDK version for your setup
 ************************************************************************
 */
public class Main {

    public static void main(String[] args) {
        //performCalculations();
        Divider divider = new Divider();
        doCalculation(divider, 100.0d, 50.0d);
        Adder adder = new Adder();
        doCalculation(adder, 25.0d, 92.0d);

        performMoreCalculations();
    }

    private static void performMoreCalculations() {
        CalculateBase[] calculations={
                new Divider(100.0d,50.0d),
                new Adder(25.0d,92.0d),
                new Substractor(225.0d,17.0d),
                new Multiplier(11.0d,3.0d)
        };

        System.out.println("Array Calculations");
        for (CalculateBase calculation: calculations){
            calculation.calculate();
            System.out.println("result="+calculation.getResult());
        }
    }

    static void doCalculation(CalculateBase calculation, double leftVal, double rightVal) {
        calculation.setLeftVal(leftVal);
        calculation.setRightVal(rightVal);
        calculation.calculate();
        System.out.println("Calculation Result= " + calculation.getResult());
    }

    static void performCalculations() {
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];

        MathEquation[] equations = getMathEquations(leftVals, rightVals, opCodes);
        executeEquations(equations);

        MathEquation equationOverload = new MathEquation('d');
        double leftDouble = 9.0d;
        double rightDouble = 4.0;
        equationOverload.execute(leftDouble, rightDouble);
        System.out.println("with overload:" + equationOverload.getResult());

        int leftInt = 9;
        int rightInt = 4;
        equationOverload.execute(leftInt, rightInt);
        System.out.println("with overload, with int type:" + equationOverload.getResult());

    }

    private static void executeEquations(MathEquation[] equations) {
        for (MathEquation equation : equations) {
            equation.execute();
            System.out.println("result=" + equation.result);
            System.out.println("average=" + MathEquation.getAverageResult());
        }
    }

    private static MathEquation[] getMathEquations(double[] leftVals, double[] rightVals, char[] opCodes) {
        MathEquation[] equations = new MathEquation[4];
        for (int index = 0; index < equations.length; index++) {
            create(leftVals, rightVals, opCodes, equations, index);
        }
        return equations;
    }

    private static void create(double[] leftVals, double[] rightVals, char[] opCodes, MathEquation[] equations, int index) {
        equations[index] = new MathEquation(opCodes[index], leftVals[index], rightVals[index]);
    }

}



















