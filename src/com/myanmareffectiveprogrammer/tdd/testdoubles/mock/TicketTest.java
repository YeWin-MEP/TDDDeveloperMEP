package com.myanmareffectiveprogrammer.tdd.testdoubles.mock;

import static org.mockito.Mockito.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.Test;

public class TicketTest {

	@Test
	public void tenPercentDiscount() {
		/* Create mock */
		Price price = mock(Price.class);

		/* Program mock for test */
		when(price.getInitialPrice()).thenReturn(new BigDecimal("10"));

		Ticket ticket = new Ticket(price, new BigDecimal("0.9"));
		assertThat(new BigDecimal("9.0"), is(ticket.getDiscountPrice()));

		verify(price).getInitialPrice();
	}
}