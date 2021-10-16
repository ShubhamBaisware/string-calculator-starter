package calculator;

class StringCalculator {

    public int add(String input) throws Exception {
    	
    	
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
    
    private int getSum(String [ ]numbers) throws Exception {
    	int sum = 0;
    	isNegative(numbers);
    	for ( String number : numbers) {
    		sum +=stringToInt(number);
    	}
    	return sum;
    }
    
    private void isNegative(String[ ] numbers) throws Exception {
     	for ( String number : numbers) {
    		if(stringToInt(number) < 0) {
    			throw new Exception("negatives not allowed"+number);
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