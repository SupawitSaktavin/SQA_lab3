package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Main.RomanNumerals;

class test_positive5 {
	RomanNumerals test = new RomanNumerals();

	@Test
	void TC_27() {
		assertEquals(3, test.convertRomanNumToInt("III"));
	}
	
	@Test
	void TC_28() {
		assertEquals(30, test.convertRomanNumToInt("XXX"));
	}
	
	@Test
	void TC_29() {
		assertEquals(300, test.convertRomanNumToInt("CCC"));
	}
	
	@Test
	void TC_30() {
		assertEquals(3000, test.convertRomanNumToInt("MMM"));
	}
}
