package lqas.automation;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest2 {
   
	@Test
	public void thirdTest(){
		int a = 2;
		int b = 5;
		Assert.assertTrue(b / a == 1);
	}
	
	@Test
	public void forthTest(){
		int a = 2;
		int b = 4;
		Assert.assertTrue(b * a == 8);
	}
	
}
