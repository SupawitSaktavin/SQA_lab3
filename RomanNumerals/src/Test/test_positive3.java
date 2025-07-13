package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Main.RomanNumerals;

class test_positive3 {
	RomanNumerals test = new RomanNumerals();

	@Test
	void TC_1() {
		assertEquals(6, test.convertRomanNumToInt("VI"));
	}
	
	@Test
	void TC_2() {
		assertEquals(11, test.convertRomanNumToInt("XI"));
	}
	
	@Test
	void TC_3() {
		assertEquals(15, test.convertRomanNumToInt("XV"));
	}
	
	@Test
	void TC_4() {
		assertEquals(51, test.convertRomanNumToInt("LI"));
	}
	
	@Test
	void TC_5() {
		assertEquals(55, test.convertRomanNumToInt("LV"));
	}
	
	@Test
	void TC_6() {
		assertEquals(60, test.convertRomanNumToInt("LX"));
	}
	
	@Test
	void TC_7() {
		assertEquals(101, test.convertRomanNumToInt("CI"));
	}
	
	@Test
	void TC_8() {
		assertEquals(105, test.convertRomanNumToInt("CV"));
	}
	
	@Test
	void TC_9() {
		assertEquals(110, test.convertRomanNumToInt("CX"));
	}
	
	@Test
	void TC_10() {
		assertEquals(150, test.convertRomanNumToInt("CL"));
	}
	
	@Test
	void TC_11() {
		assertEquals(501, test.convertRomanNumToInt("DI"));
	}
	
	@Test
	void TC_12() {
		assertEquals(505, test.convertRomanNumToInt("DV"));
	}
	
	@Test
	void TC_13() {
		assertEquals(510, test.convertRomanNumToInt("DX"));
	}
	
	@Test
	void TC_14() {
		assertEquals(550, test.convertRomanNumToInt("DL"));
	}
	
	@Test
	void TC_15() {
		assertEquals(600, test.convertRomanNumToInt("DC"));
	}
	
	@Test
	void TC_16() {
		assertEquals(1001, test.convertRomanNumToInt("MI"));
	}
	
	@Test
	void TC_17() {
		assertEquals(1005, test.convertRomanNumToInt("MV"));
	}
	
	@Test
	void TC_18() {
		assertEquals(1010, test.convertRomanNumToInt("MX"));
	}
	
	@Test
	void TC_19() {
		assertEquals(1050, test.convertRomanNumToInt("ML"));
	}
	
	@Test
	void TC_20() {
		assertEquals(1100, test.convertRomanNumToInt("MC"));
	}
	
	@Test
	void TC_21() {
		assertEquals(1500, test.convertRomanNumToInt("MD"));
	}

}
