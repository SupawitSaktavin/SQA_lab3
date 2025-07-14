package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Main.RomanNumerals;

class test_negative3 {
	RomanNumerals test = new RomanNumerals();

	@Test
	void TC_49() {
		if (test.convertRomanNumToInt(null) != test.convertRomanNumToInt("VV")) {
			fail();
		}
	}

}
