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
        	return getSum(numbers[0], numbers[1]);
        }
    }
    
    private int getSum(String num1, String num2) {
    	return Integer.parseInt(num1)+Integer.parseInt(num2);
    }
    
    private boolean isEmpty(String input) {
    	return input.isEmpty();
    }
    
    private int stringToInt(String input) {
    	return Integer.parseInt(input);
    }
    

}