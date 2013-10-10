package lqas.automation;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
   
	@Test
	public void firstTest(){
		int a = 2;
		int b = 4;
		Assert.assertTrue(a + b == 6);
	}
	
	@Test
	public void secondTest(){
		int a = 2;
		int b = 4;
		Assert.assertTrue(b - a == 2);
	}
	
}
