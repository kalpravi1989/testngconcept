package testngConcept;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class1 {
	@Test(invocationCount = 3)
	public void class1Test1() {
		System.out.println("class1 Test1   " + Thread.currentThread().getId());
	}

	@Test(groups = { "demo1" }, dependsOnMethods = { "class1Test1" })
	@Parameters("myName")
	public void class1Test2(String name) {
		System.out.println(name + "class1 Test2   " + Thread.currentThread().getId());
	}

	@Test(groups = { "demo2" })
	public void class1Test3() {
		System.out.println("class1 Test3  " + Thread.currentThread().getId());
	}
}
