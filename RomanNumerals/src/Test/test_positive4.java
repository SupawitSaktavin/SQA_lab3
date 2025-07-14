package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Main.RomanNumerals;

class test_positive4 {
	RomanNumerals test = new RomanNumerals();

	@Test
	void TC_23() {
		assertEquals(2, test.convertRomanNumToInt("II"));
	}
	
	@Test
	void TC_24() {
		assertEquals(20, test.convertRomanNumToInt("XX"));
	}
	
	@Test
	void TC_25() {
		assertEquals(200, test.convertRomanNumToInt("CC"));
	}
	
	@Test
	void TC_26() {
		assertEquals(2000, test.convertRomanNumToInt("MM"));
	}

}
