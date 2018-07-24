public class Main {

    public static void main(String[] args) {
    	double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
    	double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
    	char[] operators = {'d', 'a', 's', 'm'};
    	double[] results = new double[operators.length];

		for (int i = 0; i < operators.length; i++) {
			if (operators[i] == 'a')
				results[i] = leftVals[i] + rightVals[i];
			else if (operators[i] == 's')
				results[i] = leftVals[i] - rightVals[i];
			else if (operators[i] == 'd')
				results[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;
			else if (operators[i] == 'm')
				results[i] = leftVals[i] * rightVals[i];
			else {
				System.out.println("Error - invalid operators[i");
				results[i] = 0.0d;
			}
		}
		for (double theResult: results) {
			System.out.print("result = ");
			System.out.println(theResult);
		}
	}
}