public class Main {

    public static void main(String[] args) {
	    double val1 = 100.0d;
	    double val2 = 50.0d;
	    double result;
	    char operation = 'd';

	    if (operation == 'a')
	        result = val1 + val2;
	    else if (operation == 's')
	        result = val1 - val2;
	    else if (operation == 'd')
	    	result = val2 != 0.0d ? val1 / val2 : 0.0d;
//	    	if (val2 != 0.0d) {
//	        	result = val1 / val2;
//	    	}
//	    	else {
//	    		result = 0.0d;
//			}
	    else if (operation == 'm')
	        result = val1 * val2;
	    else {
			System.out.println("Error - invalid operation");
			result = 0.0d;
		}
        System.out.println(result);
    }
}
