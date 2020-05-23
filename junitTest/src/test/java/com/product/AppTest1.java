package com.product;

import junit.framework.TestCase;

public class AppTest1 extends TestCase {

	App1 a = new App1();

	public void test() {
		assertEquals(22, a.age());
		// assertEquals(23,a.age());
	}

	public void test2() {
		assertEquals(22, a.age());
	}
}
