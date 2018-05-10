package com.myanmareffectiveprogrammer.tdd.junit;

import java.math.BigDecimal;

/*Standard JUnit Imports*/
import org.junit.*;
import static org.junit.Assert.*;

public class BigDecimalTest {

	private BigDecimal x;

	/* Set up before each test */
	@Before
	public void setUp() {
		x = new BigDecimal("1.5");
	}

	/*Tear down after each test*/
	@After
	public void tearDown() {
		x = null;
	}

	/*Perform test*/
	@Test
	public void addingTwoBigDecimals() {
		assertEquals(new BigDecimal("3.0"), x.add(x));
	}

	/*Deal with expected exception*/
	@Test(expected = NumberFormatException.class)
	public void numberFormatException() {
		x = new BigDecimal("Not a number");
	}

}
