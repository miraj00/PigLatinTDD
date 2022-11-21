package piglatin.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class piglatinTest {

	@Test
	public void apple() {
		PigLatin newString = new PigLatin ();
		String translatedName = newString.translate("aaple");
		assertEquals("aapleay", translatedName);		
	}
	
	@Test
	public void elseWord() {
		PigLatin newString = new PigLatin ();
		String translatedName = newString.translate("else");
		assertEquals("elseay", translatedName);		
	}
	
	@Test
	public void giraffe() {
		PigLatin newString = new PigLatin ();
		String translatedName = newString.translate("giraffe");
		assertEquals("iraffegay", translatedName);		
	}
	
	
	@Test
	public void test1() {
		PigLatin newString = new PigLatin ();
		String translatedName = newString.translate("AAlOk");
		assertEquals("aalokay", translatedName);		
	}
	
	@Test
	public void test2() {
		PigLatin newString = new PigLatin ();
		String translatedName = newString.translate("eMage");
		assertEquals("emageay", translatedName);		
	}
	
	@Test
	public void test3() {
		PigLatin newString = new PigLatin ();
		String translatedName = newString.translate("imli");
		assertEquals("imliay", translatedName);		
	}
	
	
	@Test
	public void test4() {
		PigLatin newString = new PigLatin ();
		String translatedName = newString.translate("OraNge");
		assertEquals("orangeay", translatedName);		
	}
	
	@Test
	public void test5() {
		PigLatin newString = new PigLatin ();
		String translatedName = newString.translate("UmbRelLa");
		assertEquals("umbrellaay", translatedName);		
	}

	
	@Test
	public void test6() {
		PigLatin newString = new PigLatin ();
		String translatedName = newString.translate("SaMudra");
		assertEquals("amudrasay", translatedName);		
	}

	@Test
	public void test7() {
		PigLatin newString = new PigLatin ();
		String translatedName = newString.translate("harry");
		assertEquals("arryhay", translatedName);		
	}
	
	@Test
	public void test8() {
		PigLatin newString = new PigLatin ();
		String translatedName = newString.translate("NiceIDEA");
		assertEquals("iceideanay", translatedName);		
	}
	
	@Test
	public void testCapitalToLower() {
		PigLatin newString = new PigLatin ();
		String translatedName = newString.translate("INKPEN");
		assertEquals("inkpenay", translatedName);		
	}	
	
	@Test
	public void oneConstantExample1() {
		PigLatin newString = new PigLatin ();
		String translatedName = newString.translate("harry");
		assertEquals("arryhay", translatedName);		
	}
	
	@Test
	public void oneConstantExample2() {
		PigLatin newString = new PigLatin ();
		String translatedName = newString.translate("INKPEN");
		assertEquals("inkpenay", translatedName);		
	}
		
	@Test
	public void startsWith2Consonants() {
		PigLatin newString = new PigLatin ();
		String translatedName = newString.translate("SpAIN");
		assertEquals("ainspay", translatedName);		
	}
	
	@Test
	public void startsWith2Consonants2() {
		PigLatin newString = new PigLatin ();
		String translatedName = newString.translate("brazil");
		assertEquals("azilbray", translatedName);		
	}
	
	@Test
	public void startsWithMoreConsonants() {
		PigLatin newString = new PigLatin ();
		String translatedName = newString.translate("FGHJKLMNOpW");
		assertEquals("opwfghjklmnay", translatedName);		
	}	
	
}
