package test1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng {

	
	@BeforeMethod
	public void demo() {
		System.out.println("Afterhello");
	}
	
	
	@Test
	public void demo2() {
		System.out.println("hello2");
	}
	
	@Test
	public void demo3() {
		System.out.println("hello3");
	}
	
}
