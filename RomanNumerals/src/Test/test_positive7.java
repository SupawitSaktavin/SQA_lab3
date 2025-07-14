package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Main.RomanNumerals;

class test_positive7 {
	RomanNumerals test = new RomanNumerals();

	@Test
	void TC_36() {
		assertEquals(524, test.convertRomanNumToInt("DXXIV"));
	}
	
	@Test
	void TC_37() {
		assertEquals(760, test.convertRomanNumToInt("DCCLX"));
	}
	
	@Test
	void TC_38() {
		assertEquals(1462, test.convertRomanNumToInt("MCDLXII"));
	}
	
	@Test
	void TC_39() {
		assertEquals(1233, test.convertRomanNumToInt("MCCXXXIII"));
	}
	
}
