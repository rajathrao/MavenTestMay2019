package maypractisemaven.TestNGPractise;

import org.testng.annotations.Test;
import org.testng.Assert;

public class AssertionsInTestNG {
	@Test()
	public void test1() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void test3() {
		Assert.assertEquals("America", "American");
	}
	

}
