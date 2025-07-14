package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Main.RomanNumerals;

class test_negative1 {
	RomanNumerals test = new RomanNumerals();

	@Test
	void TC_40() {
		test.convertRomanNumToInt("ABC");
		fail("Expected an exception for invalid input 'ABC");
	}
	
	@Test
	void TC_41() {
		test.convertRomanNumToInt("J");
		fail("Expected an exception for invalid input 'J");
	}
	
	@Test
	void TC_42() {
		test.convertRomanNumToInt("XZ");
		fail("Expected an exception for invalid input 'X");
	}

}
