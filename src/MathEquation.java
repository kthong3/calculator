public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char operator;
    private double result;

    public double getLeftVal() { return leftVal;}
    public void setLeftVal(double leftVal) { this.leftVal = leftVal;}

    public double getRightVal() { return rightVal;}
    public void setRightVal(double rightVal) { this.rightVal = rightVal;}

    public double getOperator() { return operator;}
    public void setOperator(char operator) { this.operator = operator;}

    public double getResult(){return result;}

    public MathEquation(){}

    public MathEquation(char operator){
        this.operator = operator;
    }

    public MathEquation(char operator, double leftVal, double rightVal){
        this(operator);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public void execute(){
        switch(operator) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error - invalid operator");
                result = 0.0d;
                break;
        }
    }
}
