package com.myanmareffectiveprogrammer.tdd.testdoubles.stub;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.Test;

public class TicketTest {

	@Test
	public void tenPercentDiscount() {
		/* StubPrice stub */
		Price price = new StubPrice();

		/* Create ticket */
		Ticket ticket = new Ticket(price);

		/* Check price */
		assertThat(new BigDecimal("9.0"), is(ticket.getDiscountPrice()));
	}
}