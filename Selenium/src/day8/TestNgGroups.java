package day8;

import org.testng.annotations.Test;

public class TestNgGroups {
	@Test(groups= {"smoke"})
	public void test1() {
		System.out.println("test1 method");
	}
	@Test(groups= {"smoke","regression"})
	public void test2() {
		System.out.println("test2 method");
	}
	@Test(groups= {"regression"})
	public void test3() {
		System.out.println("test3 method");
	}
	@Test(groups= {"sanity"})
	public void test4() {
		System.out.println("test4 method");
	}
	@Test(groups= {"sanity"})
	public void test5() {
		System.out.println("test5 method");
	}
	@Test(groups= {"smoke"})
	public void test6() {
		System.out.println("test6 method");
	}

}
