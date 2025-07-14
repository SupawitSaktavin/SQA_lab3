package Main;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RomanNumerals test = new RomanNumerals();
		int num1 = test.convertRomanNumToInt(null);
		int num2 = test.convertRomanNumToInt("VVV");
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}

}
