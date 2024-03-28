package workingwithunittestingtool;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingwithChronologicalorder {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("iam before suite");
		System.out.println("data base connection start");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("iam after suite");
		System.out.println("data base connection stop");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("iam beforemethod");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("iam aftermethod");
	}

	@Test
	public void test1() {
		System.out.println("iam at test1");
	}

	@Test
	public void test2() {
		System.out.println("iam at test2");
	}

	@Test
	public void test3() {
		System.out.println("iam at test3");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("iam beforetest");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("iam at aftertest");
	}

}
