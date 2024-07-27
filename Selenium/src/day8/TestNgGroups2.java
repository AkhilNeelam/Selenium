package day8;

import org.testng.annotations.Test;

public class TestNgGroups2 {
	
	@Test(groups= {"smoke"})
	public void smokeMethod() {
		System.out.println("smoke method");
	}
	@Test(groups={"sanity"})
	public void sanityMethod() {
		System.out.println("sanity method");
	}

}
