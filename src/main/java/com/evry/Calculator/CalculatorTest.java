package com.evry.Calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	Calculate cal = new Calculate();
	private Calculate calculate;

	/** * Initialization */
	@Before
	public void setUp() {
		calculate = new Calculate();
	}

	/** * Test case for Multiplicaton method */
	@Test
	public void test() {
		int i = calculate.Mul(2, 2, 2);
		assertEquals(8, i);
	}

	@Test
	public void test1() {
		int i = calculate.Add(2, 2);
		assertEquals(4, i);
	}

	/** * destroy the object */
	@After
	public void tearDown() {
		calculate = null;
	}
}
