package Main;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Roman : ");
		String roman = input.nextLine();
		RomanNumerals num = new RomanNumerals();
		int r = num.convertRomanNumToInt(roman);
		System.out.println("Number = " + r);
		input.close();
	}

}
