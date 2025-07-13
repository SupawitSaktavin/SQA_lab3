package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Main.RomanNumerals;

class test_positive2 {
	RomanNumerals test = new RomanNumerals();
	
	@Test
	void TC_1() {
		assertEquals(4, test.convertRomanNumToInt("IV"));
	}
	
	@Test
	void TC_2() {
		assertEquals(9, test.convertRomanNumToInt("IX"));
	}

	@Test
	void TC_3() {
		test.convertRomanNumToInt("IL");
		fail();
	}

	@Test
	void TC_4() {
		test.convertRomanNumToInt("IC");
		fail();
	}
	
	@Test
	void TC_5() {
		test.convertRomanNumToInt("ID");
		fail();
	}
	
	@Test
	void TC_6() {
		test.convertRomanNumToInt("IM");
		fail();
	}
	
	@Test
	void TC_7() {
		test.convertRomanNumToInt("VX");
		fail();
	}
	
	@Test
	void TC_8() {
		test.convertRomanNumToInt("VL");
		fail();
	}
	
	@Test
	void TC_9() {
		test.convertRomanNumToInt("VC");
		fail();
	}
	
	@Test
	void TC_10() {
		test.convertRomanNumToInt("VD");
		fail();
	}
	
	@Test
	void TC_11() {
		test.convertRomanNumToInt("VM");
		fail();
	}
	
	@Test
	void TC_12() {
		assertEquals(40, test.convertRomanNumToInt("XL"));
	}
	
	@Test
	void TC_13() {
		assertEquals(90, test.convertRomanNumToInt("XC"));
	}
	
	@Test
	void TC_14() {
		test.convertRomanNumToInt("XD");
		fail();
	}
	
	@Test
	void TC_15() {
		test.convertRomanNumToInt("XM");
		fail();
	}
	
	@Test
	void TC_16() {
		test.convertRomanNumToInt("LC");
		fail();
	}
	
	@Test
	void TC_17() {
		test.convertRomanNumToInt("LD");
		fail();
	}
	
	@Test
	void TC_18() {
		test.convertRomanNumToInt("LM");
		fail();
	}
	
	@Test
	void TC_19() {
		assertEquals(400, test.convertRomanNumToInt("CD"));
	}
	
	@Test
	void TC_20() {
		assertEquals(900, test.convertRomanNumToInt("CM"));
	}
	
	@Test
	void TC_21() {
		test.convertRomanNumToInt("DM");
        fail();
	}

}
