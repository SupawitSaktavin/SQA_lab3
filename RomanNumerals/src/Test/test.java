package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Main.RomanNumerals;

class test {
	RomanNumerals test = new RomanNumerals();
	
	@Test
	void test_single_digit() {
		int[] single_numbers_T = {1, 5, 10, 50, 100, 500, 1000};
		String[] single_roman_T = {"I", "V", "X", "L", "C", "D", "M"};
		for (int i=0; i<single_numbers_T.length; i++) {
			assertEquals(single_numbers_T[i], test.convertRomanNumToInt(single_roman_T[i]));
		}
	}
	
	@Test
	void test_single_digit1() {
		assertEquals(1, test.convertRomanNumToInt("I"));
	}
	
	@Test
	void test_single_digit2() {
		assertEquals(5, test.convertRomanNumToInt("V"));
	}
	
	@Test
	void test_single_digit3() {
		assertEquals(50, test.convertRomanNumToInt("L"));
	}
	
	@Test
	void test_single_digit4() {
		assertEquals(500, test.convertRomanNumToInt("D"));
	}
	
	@Test
	void test_single_digit5() {
		assertEquals(1000, test.convertRomanNumToInt("M"));
	}
	
	@Test
	void test_2digits_first_smaller1() {
		assertEquals(4, test.convertRomanNumToInt("IV"));
	}
	
	@Test
	void test_2digits_first_smaller2() {
		assertEquals(9, test.convertRomanNumToInt("IX"));
	}
	
	@Test
	void test_2digits_first_smaller3() {
		assertEquals(40, test.convertRomanNumToInt("XL"));
	}
	
	@Test
	void test_2digits_first_smaller4() {
		assertEquals(90, test.convertRomanNumToInt("XC"));
	}
	
	@Test
	void test_2digits_first_smaller5() {
		assertEquals(400, test.convertRomanNumToInt("CD"));
	}
	
	@Test
	void test_2digits_first_smaller6() {
		assertEquals(900, test.convertRomanNumToInt("CM"));
	}
	
	@Test
	void test_same_number() {
		int[] same_numbers_T = {1, 10, 100, 1000};
		String[] same_roman_T = {"I", "X", "C", "M"};
		for (int i=0; i<same_roman_T.length; i++) {
			assertEquals(same_numbers_T[i]*2, test.convertRomanNumToInt(same_roman_T[i].repeat(2)));
			assertEquals(same_numbers_T[i]*3, test.convertRomanNumToInt(same_roman_T[i].repeat(3)));
		}
		
		int[] same_numbers_F = {5, 50, 500};
		String[] same_roman_F = {"V", "L", "D"};
		for (int i=0; i<same_roman_F.length; i++) {
			assertNotEquals(same_numbers_F[i]*2, test.convertRomanNumToInt(same_roman_F[i].repeat(2)));
			assertNotEquals(same_numbers_F[i]*3, test.convertRomanNumToInt(same_roman_F[i].repeat(3)));
		}
	}
	
	@Test
	void test_2digits_first_smaller() {
		int[] F_smaller_num_T = {4, 9, 40, 90, 400, 900};
		String[] F_smaller_roman_T = {"IV", "IX", "XL", "XC", "CD", "CM"};
		for (int i=0; i<F_smaller_num_T.length; i++) {
			assertEquals(F_smaller_num_T[i], test.convertRomanNumToInt(F_smaller_roman_T[i]));
		}
		
		int[] F_smaller_num_F = {49, 99, 499, 999, 5, 45, 95, 495, 995, 490, 990, 50, 450, 950, 500};
		String[] F_smaller_roman_F = {"IL", "IC", "ID", "IM", "VX", "VL", "VC", "VD", "VM", "XD", "XM", "LC", "LD", "LM", "DM"};
		for (int i=0; i<F_smaller_num_F.length; i++) {
			assertNotEquals(F_smaller_num_F[i], test.convertRomanNumToInt(F_smaller_roman_F[i]));
		}
	}
	
	@Test
	void test_2digits_first_larger() {
		int[] F_larger_num_T = {6, 11, 15, 51, 55, 60, 101, 105, 110, 150, 501, 505, 510, 550, 600, 1001, 1005, 1010, 1050, 1100, 1500};
		String[] F_larger_roman_T = {"VI", "XI", "XV", "LI", "LV", "LX", "CI", "CV", "CX", "CL", "DI", "DV", "DX", "DL", "DC", "MI", "MV", "MX", "ML", "MC", "MD"};
		for (int i=0; i<F_larger_num_T.length; i++) {
			assertEquals(F_larger_num_T[i], test.convertRomanNumToInt(F_larger_roman_T[i]));
		}
	}
	
	@Test
	void test_multiple() {
		assertEquals(3, test.convertRomanNumToInt("III"));
		assertEquals(2, test.convertRomanNumToInt("II"));
		
	}
}
