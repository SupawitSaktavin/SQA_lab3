package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Main.RomanNumerals;

class test_positive2 {
	RomanNumerals test = new RomanNumerals();
	
	@Test
	void TC_8() {
		assertEquals(4, test.convertRomanNumToInt("IV"));
	}
	
	@Test
	void TC_9() {
		assertEquals(9, test.convertRomanNumToInt("IX"));
	}
	
	@Test
	void TC_10() {
		test.convertRomanNumToInt("VX");
		fail("Expected an exception for invalid input 'VX");
	}
	
	@Test
	void TC_11() {
		assertEquals(40, test.convertRomanNumToInt("XL"));
	}
	
	@Test
	void TC_12() {
		assertEquals(90, test.convertRomanNumToInt("XC"));
	}
	
	@Test
	void TC_13() {
		test.convertRomanNumToInt("LC");
		fail("Expected an exception for invalid input 'LC");
	}
	
	@Test
	void TC_14() {
		assertEquals(400, test.convertRomanNumToInt("CD"));
	}
	
	@Test
	void TC_15() {
		assertEquals(900, test.convertRomanNumToInt("CM"));
	}
	
	@Test
	void TC_16() {
		test.convertRomanNumToInt("DM");
        fail("Expected an exception for invalid input 'DM");
	}

}
