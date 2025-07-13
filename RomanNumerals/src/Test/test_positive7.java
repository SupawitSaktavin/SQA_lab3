package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Main.RomanNumerals;

class test_positive7 {
	RomanNumerals test = new RomanNumerals();

	@Test
	void TC_1() {
		assertEquals(14, test.convertRomanNumToInt("XIV"));
	}
	
	@Test
	void TC_2() {
		assertEquals(54, test.convertRomanNumToInt("LIV"));
	}
	
	@Test
	void TC_3() {
		assertEquals(104, test.convertRomanNumToInt("CIV"));
	}
	
	@Test
	void TC_4() {
		assertEquals(504, test.convertRomanNumToInt("DIV"));
	}
	
	@Test
	void TC_5() {
		assertEquals(1004, test.convertRomanNumToInt("MIV"));
	}
	
	@Test
	void TC_6() {
		assertEquals(59, test.convertRomanNumToInt("LIX"));
	}
	
	@Test
	void TC_7() {
		assertEquals(109, test.convertRomanNumToInt("CIX"));
	}
	
	@Test
	void TC_8() {
		assertEquals(509, test.convertRomanNumToInt("DIX"));
	}
	
	@Test
	void TC_9() {
		assertEquals(1009, test.convertRomanNumToInt("MIX"));
	}
	
	@Test
	void TC_10() {
		test.convertRomanNumToInt("CIL");
		fail();
	}
	
	@Test
	void TC_11() {
		test.convertRomanNumToInt("DIL");
		fail();
	}
	
	@Test
	void TC_12() {
		test.convertRomanNumToInt("MIL");
		fail();
	}
	
	@Test
	void TC_13() {
		test.convertRomanNumToInt("DIC");
		fail();
	}
	
	@Test
	void TC_14() {
		test.convertRomanNumToInt("MIC");
		fail();
	}
	
	@Test
	void TC_15() {
		test.convertRomanNumToInt("MID");
		fail();
	}
	
	@Test
	void TC_16() {
		test.convertRomanNumToInt("LVX");
		fail();
	}
	
	@Test
	void TC_17() {
		test.convertRomanNumToInt("CVX");
		fail();
	}
	
	@Test
	void TC_18() {
		test.convertRomanNumToInt("DVX");
		fail();
	}
	
	@Test
	void TC_19() {
		test.convertRomanNumToInt("MVX");
		fail();
	}
	
	@Test
	void TC_20() {
		test.convertRomanNumToInt("CVL");
		fail();
	}
	
	@Test
	void TC_21() {
		test.convertRomanNumToInt("DVL");
		fail();
	}
	
	@Test
	void TC_22() {
		test.convertRomanNumToInt("MVL");
		fail();
	}
	
	@Test
	void TC_23() {
		test.convertRomanNumToInt("DVC");
		fail();
	}
	
	@Test
	void TC_24() {
		test.convertRomanNumToInt("MVC");
		fail();
	}
	
	@Test
	void TC_25() {
		test.convertRomanNumToInt("MVD");
		fail();
	}
	
	@Test
	void TC_26() {
		assertEquals(140, test.convertRomanNumToInt("CXL"));
	}
	
	@Test
	void TC_27() {
		assertEquals(540, test.convertRomanNumToInt("DXL"));
	}
	
	@Test
	void TC_28() {
		assertEquals(1040, test.convertRomanNumToInt("MXL"));
	}
	
	@Test
	void TC_29() {
		assertEquals(590, test.convertRomanNumToInt("DXC"));
	}
	
	@Test
	void TC_30() {
		assertEquals(1090, test.convertRomanNumToInt("MXC"));
	}
	
	@Test
	void TC_31() {
		test.convertRomanNumToInt("MXD");
		fail();
	}
	
	@Test
	void TC_32() {
		test.convertRomanNumToInt("DLC");
		fail();
	}
	
	@Test
	void TC_33() {
		test.convertRomanNumToInt("MLC");
		fail();
	}
	
	@Test
	void TC_34() {
		test.convertRomanNumToInt("MLD");
		fail();
	}
	
	@Test
	void TC_35() {
		assertEquals(1400, test.convertRomanNumToInt("MCD"));
	}
	
	@Test
	void TC_36() {
		assertEquals(16, test.convertRomanNumToInt("XVI"));
	}
	
	@Test
	void TC_37() {
		assertEquals(56, test.convertRomanNumToInt("LVI"));
	}
	
	@Test
	void TC_38() {
		assertEquals(106, test.convertRomanNumToInt("CVI"));
	}
	
	@Test
	void TC_39() {
		assertEquals(506, test.convertRomanNumToInt("DVI"));
	}
	
	@Test
	void TC_40() {
		assertEquals(1006, test.convertRomanNumToInt("MVI"));
	}
	
	@Test
	void TC_41() {
		assertEquals(61, test.convertRomanNumToInt("LXI"));
	}
	
	@Test
	void TC_42() {
		assertEquals(111, test.convertRomanNumToInt("CXI"));
	}
	
	@Test
	void TC_43() {
		assertEquals(511, test.convertRomanNumToInt("DXI"));
	}
	
	@Test
	void TC_44() {
		assertEquals(1011, test.convertRomanNumToInt("MXI"));
	}
}
