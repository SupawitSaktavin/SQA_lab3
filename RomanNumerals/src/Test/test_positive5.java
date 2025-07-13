package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Main.RomanNumerals;

class test_positive5 {
	RomanNumerals test = new RomanNumerals();

	@Test
	void TC_54() {
		assertEquals(3, test.convertRomanNumToInt("III"));
	}
	
	@Test
	void TC_55() {
		assertEquals(30, test.convertRomanNumToInt("XXX"));
	}
	
	@Test
	void TC_56() {
		assertEquals(300, test.convertRomanNumToInt("CCC"));
	}
	
	@Test
	void TC_57() {
		assertEquals(3000, test.convertRomanNumToInt("MMM"));
	}
}
