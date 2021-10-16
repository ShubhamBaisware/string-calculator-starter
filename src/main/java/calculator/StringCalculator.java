package calculator;

class StringCalculator {

    public int add(String input) {
    	String [] numbers = input.split(",");
    	
        if ( isEmpty(input)) {
        	return 0;
        }
        if( input.length() == 1) {
        	return stringToInt(input);
        }
        
        else {
        	return getSum(numbers);
        }
    }
    
    private int getSum(String [ ]numbers) {
    	int sum = 0;
    	for ( String number : numbers) {
    		sum += Integer.parseInt(number);
    	}
    	return sum;
    }
    
    private boolean isEmpty(String input) {
    	return input.isEmpty();
    }
    
    private int stringToInt(String input) {
    	return Integer.parseInt(input);
    }
    

}