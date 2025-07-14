package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Main.RomanNumerals;

class test_negative1 {
	RomanNumerals test = new RomanNumerals();

	@Test
	void TC_40() {
		try {
	        test.convertRomanNumToInt("ABC");
	        fail("Expected exception for invalid input 'ABC'");
	    } catch (NullPointerException  e) {

	    }
	}
	
	@Test
	void TC_41() {
		try {
	        test.convertRomanNumToInt("J");
	        fail("Expected exception for invalid input 'J'");
	    } catch (NullPointerException  e) {

	    }
	}
	
	@Test
	void TC_42() {
		try {
	        test.convertRomanNumToInt("XZ");
	        fail("Expected exception for invalid input 'XZ'");
	    } catch (NullPointerException  e) {

	    }
	}

}
