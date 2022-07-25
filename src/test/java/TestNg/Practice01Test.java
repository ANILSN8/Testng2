package TestNg;

import org.testng.annotations.Test;

public class Practice01Test {
	
	@Test(priority=3)
	public void test1(){
		String url = System.getProperty("url");
		String browser = System.getProperty("browser");
		String username = System.getProperty("un");
		String password = System.getProperty("pw");
		System.out.println("From Tyss001");
		System.out.println("url======="+url);
		System.out.println("browser====="+browser);
		System.out.println("username======"+username);
		System.out.println("password====="+password);
		}
	
	@Test(enabled=false)
	public void test2() {
		System.out.println("From Tyss002");
	}
	
	@Test(priority=1)
	public void test3() {
		System.out.println("From Tyss003");
		System.out.println("welcome to TestYantra");
		
	}
	
	@Test(priority=4)
	public void test4() {
		System.out.println("From Tyss004");
		System.out.println("hello kranti");
	}
	
	


}
