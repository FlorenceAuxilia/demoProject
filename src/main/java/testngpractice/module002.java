package testngpractice;


import org.testng.annotations.Test;

public class module002 extends base {

	

	@Test (groups = {"sanity" ,"smoke"})
	public void test001() {
		System.out.println("2Test001");
	}
	@Test (groups = {"sanity" ,"Regression"})
	public void test002() {
		System.out.println("2Test002");
	}
	@Test (groups = {"Pef" })
	public void test003() {
		System.out.println("2Test003");
	}
}
