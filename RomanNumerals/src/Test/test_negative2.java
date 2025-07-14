package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Main.RomanNumerals;

class test_negative2 {
	RomanNumerals test = new RomanNumerals();

	@Test
	void TC_43() {
		test.convertRomanNumToInt("VV");
		fail("Expected an exception for invalid input 'VV");
	}
	
	@Test
	void TC_44() {
		test.convertRomanNumToInt("VVV");
		fail("Expected an exception for invalid input 'VVV");
	}
	
	@Test
	void TC_45() {
		test.convertRomanNumToInt("LL");
		fail("Expected an exception for invalid input 'LL");
	}
	
	@Test
	void TC_46() {
		test.convertRomanNumToInt("LLL");
		fail("Expected an exception for invalid input 'LLL");
	}
	
	@Test
	void TC_47() {
		test.convertRomanNumToInt("DD");
		fail("Expected an exception for invalid input 'DD");
	}
	
	@Test
	void TC_48() {
		test.convertRomanNumToInt("DDD");
		fail("Expected an exception for invalid input 'DDD");
	}

}
