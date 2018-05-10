package com.myanmareffectiveprogrammer.tdd.multiplecase;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class TicketRevenueTest {

	private TicketRevenue ticketRevenue;
	private BigDecimal expectedRevenue;

	@Before
	public void setUp() {
		ticketRevenue = new TicketRevenue();
	}

	/*Negative sold case*/
	@Test(expected = IllegalArgumentException.class)
	public void failIfLessThanZeroTicketsAreSold() {
		ticketRevenue.estimateTotalRevenue(-1);
	}

	/*0 sold case*/
	@Test
	public void zeroSalesEqualsZeroRevenue() {
		assertThat(BigDecimal.ZERO, is(ticketRevenue.estimateTotalRevenue(0)));
	}

	/*1 sold case*/
	@Test
	public void oneTicketSoldIsThirtyInRevenue() {
		expectedRevenue = new BigDecimal("30");
		assertThat(expectedRevenue, is(ticketRevenue.estimateTotalRevenue(1)));
	}

	/*N sold case*/
	@Test
	public void tenTicketsSoldIsThreeHundredInRevenue() {
		expectedRevenue = new BigDecimal("300");
		assertThat(expectedRevenue, is(ticketRevenue.estimateTotalRevenue(10)));
	}

	/*> 100 sold case*/
	@Test(expected = IllegalArgumentException.class)
	public void failIfMoreThanOneHundredTicketsAreSold() {
		ticketRevenue.estimateTotalRevenue(101);
	}

}
