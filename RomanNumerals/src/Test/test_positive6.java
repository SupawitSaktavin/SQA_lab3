package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Main.RomanNumerals;

class test_positive6 {
	RomanNumerals test = new RomanNumerals();

	@Test
	void TC_31() {
		assertEquals(1300, test.convertRomanNumToInt("MCCC"));
	}
	
	@Test
	void TC_32() {
		assertEquals(752, test.convertRomanNumToInt("DCCLII"));
	}
	
	@Test
	void TC_33() {
		assertEquals(26, test.convertRomanNumToInt("XXVI"));
	}
	
	@Test
	void TC_34() {
		assertEquals(3888, test.convertRomanNumToInt("MMMDCCCLXXXVIII"));
	}
	
	@Test
	void TC_35() {
		assertEquals(67, test.convertRomanNumToInt("LXVII"));
	}

}
