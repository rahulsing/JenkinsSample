package jenkins.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMain {

	/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/
	@Test
	public void addTwoNumTest() {
		// fail("Not yet implemented");
		assertEquals(10, HelloWorld.addTwoNum(5,5));
	}
	@Test
	public void subTwoNumTest() {
		// fail("Not yet implemented");
		assertEquals(0, HelloWorld.subTwoNum(5,5));
	}
}
