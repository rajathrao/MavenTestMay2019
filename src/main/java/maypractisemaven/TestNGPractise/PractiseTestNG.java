package maypractisemaven.TestNGPractise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PractiseTestNG {
	
	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("you are in Before Test");
	}
	
	@BeforeClass
	public void testBeforeClass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void testBeforeMethod() { 
		System.out.println("Before MEthod");
	}
	
	@Test(priority=2)
	public void testMethod1() {
		System.out.println("this is my first testNG method1");
	}
    @Test(priority=1)
	public void testMethod2() {
		System.out.println("this is my first testNG method2");
	}
    
    @AfterMethod
    public void testAfterMethod() {
    	System.out.println("afterMEthod");
    }
    
    @AfterClass
    public void afterClass() {
    	System.out.println("afterclass");
    }
    
    @AfterTest
    public void afterTestMethod() {
    	System.out.println("you are in after test");
    }
	
    
    //beforeSuite and AfterSuite 
	//group the teest cases -- smoke test, regression test, 
	// disable some test cases 
	
	//testNG.xml
	
	//listerners in testNG -- listerners and interface from the testNG library 
	
}
