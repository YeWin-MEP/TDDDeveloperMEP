package com.myanmareffectiveprogrammer.tdd.singleusecase;

import static org.hamcrest.CoreMatchers.is;

import java.math.BigDecimal;

import org.junit.*;
import static org.junit.Assert.*;

public class TicketRevenueTest {

	private TicketRevenue ticketRevenue;
	private BigDecimal expectedRevenue;

	@Before
	public void setUp() {
		ticketRevenue = new TicketRevenue();
	}

	@Test
	public void oneTicketSoldIsThirtyInRevenue() {
		expectedRevenue = new BigDecimal("30");
		assertThat(expectedRevenue, is(ticketRevenue.estimateTotalRevenue(1)));
	}

}
