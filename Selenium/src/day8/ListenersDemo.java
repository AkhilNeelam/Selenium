package day8;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(day8.ListernersTest.class)
public class ListenersDemo {
	
	@Test
	public void test() {
		System.out.println("test method");
	}

	@Test
	public void failTestCase() {
		System.out.println("fail testcase");
		Assert.assertFalse(true); //intentinally failing the tes case using asset false
    }
	@Test
	public void skipTestcase() {
		System.out.println("Skip testcase");
		throw new SkipException("Skipping test case");
	}
}

