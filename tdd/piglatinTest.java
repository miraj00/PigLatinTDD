package piglatin.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class piglatinTest {

	
	@Test
	public void apple() {
		String translatedName = PigLatin.translate("aaple");
		assertEquals("aapleway", translatedName);		
	}
	
	@Test
	public void elseWord() {
		
		String translatedName = PigLatin.translate("else");
		assertEquals("elseway", translatedName);		
	}
	
	@Test
	public void giraffe() {
		
		String translatedName = PigLatin.translate("giraffe");
		assertEquals("iraffegay", translatedName);		
	}
	
	
	@Test
	public void test1() {
		String translatedName = PigLatin.translate("AAlOk");
		assertEquals("aalokway", translatedName);		
	}
	
	@Test
	public void test2() {
		String translatedName = PigLatin.translate("eMage");
		assertEquals("emageway", translatedName);		
	}
	
	@Test
	public void test3() {
		String translatedName = PigLatin.translate("imli");
		assertEquals("imliway", translatedName);		
	}
	
	
	@Test
	public void test4() {
		String translatedName = PigLatin.translate("OraNge");
		assertEquals("orangeway", translatedName);		
	}
	
	@Test
	public void test5() {
		String translatedName = PigLatin.translate("UmbRelLa");
		assertEquals("umbrellaway", translatedName);		
	}

	
	@Test
	public void test6() {
		String translatedName = PigLatin.translate("SaMudra");
		assertEquals("amudrasay", translatedName);		
	}

	@Test
	public void test7() {
		String translatedName = PigLatin.translate("harry");
		assertEquals("arryhay", translatedName);		
	}
	
	@Test
	public void test8() {
		String translatedName = PigLatin.translate("NiceIDEA");
		assertEquals("iceideanay", translatedName);		
	}
	
	@Test
	public void testCapitalToLower() {
		String translatedName = PigLatin.translate("INKPEN");
		assertEquals("inkpenway", translatedName);		
	}	
	
	@Test
	public void oneConstantExample1() {
		String translatedName = PigLatin.translate("harry");
		assertEquals("arryhay", translatedName);		
	}
	
	@Test
	public void oneConstantExample2() {
		String translatedName = PigLatin.translate("INKPEN");
		assertEquals("inkpenway", translatedName);		
	}
		
	@Test
	public void startsWith2Consonants() {
		String translatedName = PigLatin.translate("SpAIN");
		assertEquals("ainspay", translatedName);		
	}
	
	@Test
	public void startsWith2Consonants2() {
		String translatedName = PigLatin.translate("brazil");
		assertEquals("azilbray", translatedName);		
	}
	
	@Test
	public void startsWithMoreConsonants() {
		String translatedName = PigLatin.translate("FGHJKLMNOpW");
		assertEquals("opwfghjklmnay", translatedName);		
	}	
	
}
