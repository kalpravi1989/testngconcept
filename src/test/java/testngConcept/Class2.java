package testngConcept;

import org.testng.annotations.Test;
import org.testng.annotations.Test;


public class Class2 {
	@Test
	public void class2Test1() {
		System.out.println("class2 Test1   " + Thread.currentThread().getId());
	}

	@Test(groups = { "demo1" })
	public void class1Test2() {
		System.out.println("class2  Test2   " + Thread.currentThread().getId());
	}

	@Test(groups = { "demo2" })
	public void class1Test3() {
		System.out.println("class2 Test3  " + Thread.currentThread().getId());
	}
}
