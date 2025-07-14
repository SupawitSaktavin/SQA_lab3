package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Main.RomanNumerals;

class test_negative3 {
	RomanNumerals test = new RomanNumerals();

	@Test
	void TC_49() {
		test.convertRomanNumToInt("XXXX");
		fail("Expected an exception for invalid input 'XXXX");
	}
	
	@Test
	void TC_50() {
		test.convertRomanNumToInt("IIII");
		fail("Expected an exception for invalid input 'IIII");
	}
	
	@Test
	void TC_51() {
		test.convertRomanNumToInt("CCCC");
		fail("Expected an exception for invalid input 'CCCC");
	}
	
	@Test
	void TC_52() {
		test.convertRomanNumToInt("MMMM");
		fail("Expected an exception for invalid input 'MMMM");
	}

}
