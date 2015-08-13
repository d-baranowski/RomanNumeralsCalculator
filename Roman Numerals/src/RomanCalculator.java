import java.util.ArrayList;
import java.util.Arrays;

public class RomanCalculator {
	
	static char[] order = {'I','V','X','L','C','D','M'};
	static char[] threeAllowed = {'I','X','C'};
	static char[] twoAllowed = {'V','L','D'};
		
	public static void main(String[] args) {
	
	}
	
	public static String replaceSubtractiveSymbols(String number){
		number = number.replaceAll("IV", "IIII");
		number = number.replaceAll("IX", "VIIII");
		number = number.replaceAll("XL", "XXXX");
		number = number.replaceAll("XC", "LXXXX");
		number = number.replaceAll("CD", "CCCC");
		number = number.replaceAll("CM", "DCCCC");
		return number;
	}
	
	public static String sort(String number){
		ArrayList<RomanNumber> roman = new ArrayList<RomanNumber>();
		
		for (char i : number.toCharArray()){
			roman.add(new RomanNumber(i));
		}
		
		roman.sort(null);
		number = new String();
		for (RomanNumber i: roman){
			number = number + i.toString();
		}
		
		return number;
	}
	
	public static String combine(String number){
		number = number.replaceAll("IIIII", "V");
		number = number.replaceAll("VV", "X");
		number = number.replaceAll("XXXXX", "L");
		number = number.replaceAll("LL", "C");
		number = number.replaceAll("CCCCC", "D");
		number = number.replaceAll("DD", "M");
		number = number.replaceAll("IIII", "IV");
		number = number.replaceAll("VIIII", "IX");
		number = number.replaceAll("XXXX", "XL");
		number = number.replaceAll("LXXXX", "XC");
		number = number.replaceAll("CCCC", "CD");
		number = number.replaceAll("DCCCC", "CM");
		return number;
	}
	
	public static String newAdd(String first, String second){
		String number = "";
		String one = RomanCalculator.replaceSubtractiveSymbols(first);
		String two = RomanCalculator.replaceSubtractiveSymbols(second);
		number = RomanCalculator.sort(one.concat(two));
		number = RomanCalculator.combine(number);
		return number;
	}

}