package day7;

import org.testng.annotations.Test;

public class TestNG1 {

	@Test(priority =  2,invocationCount = 2)//this test cases will run 4 times,if 0 will not run 
	public void test() {
		System.out.println("test method");
	}
	@Test(priority =  1,enabled = false) //to skip the testcase
	public void test1() {
		System.out.println("test1 method");
	}
	//we can give the priority as same i.e 1 for both,the execution starts as per alphabetical order
	//we can give - 1->what ever - value is there it will execute first
	//-4,-1 it will execute -4 first then -1 will excute
	//witout priority also the program runs
	//no priorirty is menthod for method ,it will excute the first ,then priority will excute next
	//if we want to excute same test cases multiple times then use invocationcount
}
