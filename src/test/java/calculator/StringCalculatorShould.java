package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StringCalculatorShould {
	
	private StringCalculator stringCalculator;
	
	 public StringCalculatorShould() {
		 stringCalculator = new StringCalculator();
	}
	 
    // below method will returns 0 if empty string is passed
    @Test
    void empty_string_should_return_0() {
        assertEquals(0, stringCalculator.add(""));
    }
    
    // below method will returns an integer if passed a single number 
    @Test
    void string_with_single_number_should_return_number_as_int() {
        assertEquals(1, stringCalculator.add("1"));
    }
    
    // below method will returns the sum of the two numbers     
    @Test
    public void twoNumbersCommaSeperatedReturnsSum() {
    	assertEquals(3,stringCalculator.add("1,2"));
    }
    
    @Test
    public void unknownNumbersOfArgs() {
    	assertEquals(15, stringCalculator.add("1,2,3,4,5"));
    }
}
