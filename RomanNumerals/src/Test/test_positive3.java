package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Main.RomanNumerals;

class test_positive3 {
	RomanNumerals test = new RomanNumerals();

	@Test
	void TC_17() {
		assertEquals(6, test.convertRomanNumToInt("VI"));
	}
	
	@Test
	void TC_18() {
		assertEquals(15, test.convertRomanNumToInt("XV"));
	}
	
	@Test
	void TC_19() {
		assertEquals(60, test.convertRomanNumToInt("LX"));
	}
	
	@Test
	void TC_20() {
		assertEquals(150, test.convertRomanNumToInt("CL"));
	}
	
	@Test
	void TC_21() {
		assertEquals(600, test.convertRomanNumToInt("DC"));
	}
	
	@Test
	void TC_22() {
		assertEquals(1500, test.convertRomanNumToInt("MD"));
	}

}
