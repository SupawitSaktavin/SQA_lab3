package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Main.RomanNumerals;

class test_positive1 {
	RomanNumerals test = new RomanNumerals();
	
	@Test
	void TC_1() {
		assertEquals(1, test.convertRomanNumToInt("I"));
	}
	
	@Test
	void TC_2() {
		assertEquals(5, test.convertRomanNumToInt("V"));
	}
	
	@Test
	void TC_3() {
		assertEquals(10, test.convertRomanNumToInt("X"));
	}
	
	@Test
	void TC_4() {
		assertEquals(50, test.convertRomanNumToInt("L"));
	}
	
	@Test
	void TC_5() {
		assertEquals(100, test.convertRomanNumToInt("C"));
	}
	
	@Test
	void TC_6() {
		assertEquals(500, test.convertRomanNumToInt("D"));
	}
	
	@Test
	void TC_7() {
		assertEquals(1000, test.convertRomanNumToInt("M"));
	}

}
