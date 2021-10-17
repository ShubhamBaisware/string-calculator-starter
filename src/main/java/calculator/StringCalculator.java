package calculator;

class StringCalculator {

    public int add(String input) {
    	
    	
        if ( isEmpty(input)) {
        	return 0;
        }
        if( input.length() == 1) {
        	return stringToInt(input);
        }
        
        else {
        	String delimeter = ",";
        	if(input.matches("//(.*)\n(.*)")) {
        		delimeter = Character.toString(input.charAt(2));
        		input= input.substring(4);
        	}
        	String numbers[] = splitNumbers(input, delimeter + "|\n");
        	return getSum(numbers);
        }
    }
    
    private String[ ] splitNumbers( String numbers, String divider) {
    	return numbers.split(divider);
    }
    
    private int getSum(String [ ]numbers)  {
    	int sum = 0;
    	isNegative(numbers);
    	for ( String number : numbers) {
    		sum +=stringToInt(number);
    	}
    	return sum;
    }
    
    private void isNegative(String[ ] numbers) {
    	for ( String number : numbers) {
    		if(stringToInt(number) < 0) {
    			throw new IllegalArgumentException("negatives not allowed"+number);
    		}
    	}
    }
    
    private boolean isEmpty(String input) {
    	return input.isEmpty();
    }
    
    private int stringToInt(String input) {
    	return Integer.parseInt(input);
    }
    

}