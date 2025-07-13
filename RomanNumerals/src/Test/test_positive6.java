package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Main.RomanNumerals;

class test_positive6 {
	RomanNumerals test = new RomanNumerals();

	@Test
	void TC_58() {
		assertEquals(6, test.convertRomanNumToInt("VI"));
	}

}
