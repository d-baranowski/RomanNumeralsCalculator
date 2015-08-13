import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
	RomanCalculator calc = new RomanCalculator();
	
	@Test
	public void onePlusOne() {
		assertEquals("II",calc.newAdd("I","I"));
	}
	
	@Test
	public void twoPlusTwo(){
		assertEquals("IV",calc.newAdd("II","II"));
	}
	
	@Test
	public void onePlusThree(){
		assertEquals("IV",calc.newAdd("I","III"));
	}
	
	@Test
	public void twentyPlusTwenty(){
		assertEquals("XL",calc.newAdd("XX","XX"));
	}
	
	@Test
	public void fiveHundredPlusFiveHundred(){
		assertEquals("M",calc.newAdd("D","D"));
	}
	
	@Test
	public void fiveteenPlusSixty(){
		assertEquals("LXXIV",calc.newAdd("XIV","LX"));
	}
	
	@Test
	public void test(){
		assertEquals("VIII",calc.newAdd("IV","IV"));
	}
	
	@Test
	public void largeNumbers(){
		assertEquals("MCCCXIII",calc.newAdd("MCLXXIV","CXXXIX"));
	}
	
	@Test
	public void replaceSubstractive(){
		String test = calc.replaceSubtractiveSymbols("MCLXXIV");		
		assertEquals("MCLXXIIII",test);
	}
	
	@Test
	public void sort(){
		String test = calc.sort("MCLXXIIIICXXXVIIII");
		assertEquals("MCCLXXXXXVIIIIIIII",test);
	}

}
