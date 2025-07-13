package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Main.RomanNumerals;

class test_positive3 {
	RomanNumerals test = new RomanNumerals();

	@Test
	void TC_29() {
		assertEquals(6, test.convertRomanNumToInt("VI"));
	}
	
	@Test
	void TC_30() {
		assertEquals(11, test.convertRomanNumToInt("XI"));
	}
	
	@Test
	void TC_31() {
		assertEquals(15, test.convertRomanNumToInt("XV"));
	}
	
	@Test
	void TC_32() {
		assertEquals(51, test.convertRomanNumToInt("LI"));
	}
	
	@Test
	void TC_33() {
		assertEquals(55, test.convertRomanNumToInt("LV"));
	}
	
	@Test
	void TC_34() {
		assertEquals(60, test.convertRomanNumToInt("LX"));
	}
	
	@Test
	void TC_35() {
		assertEquals(101, test.convertRomanNumToInt("CI"));
	}
	
	@Test
	void TC_36() {
		assertEquals(105, test.convertRomanNumToInt("CV"));
	}
	
	@Test
	void TC_37() {
		assertEquals(110, test.convertRomanNumToInt("CX"));
	}
	
	@Test
	void TC_38() {
		assertEquals(150, test.convertRomanNumToInt("CL"));
	}
	
	@Test
	void TC_39() {
		assertEquals(501, test.convertRomanNumToInt("DI"));
	}
	
	@Test
	void TC_40() {
		assertEquals(505, test.convertRomanNumToInt("DV"));
	}
	
	@Test
	void TC_41() {
		assertEquals(510, test.convertRomanNumToInt("DX"));
	}
	
	@Test
	void TC_42() {
		assertEquals(550, test.convertRomanNumToInt("DL"));
	}
	
	@Test
	void TC_43() {
		assertEquals(600, test.convertRomanNumToInt("DC"));
	}
	
	@Test
	void TC_44() {
		assertEquals(1001, test.convertRomanNumToInt("MI"));
	}
	
	@Test
	void TC_45() {
		assertEquals(1005, test.convertRomanNumToInt("MV"));
	}
	
	@Test
	void TC_46() {
		assertEquals(1010, test.convertRomanNumToInt("MX"));
	}
	
	@Test
	void TC_47() {
		assertEquals(1050, test.convertRomanNumToInt("ML"));
	}
	
	@Test
	void TC_48() {
		assertEquals(1100, test.convertRomanNumToInt("MC"));
	}
	
	@Test
	void TC_49() {
		assertEquals(1500, test.convertRomanNumToInt("MD"));
	}

}
