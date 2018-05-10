package com.myanmareffectiveprogrammer.tdd.testdoubles.dummy;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.Test;

public class TicketTest {
	
	@Test
	public void tenPercentDiscount() {
		
		/*Dummy object - An object that is passed around but never used.*/
		String dummyName = "Riley";
		
		/*Pass in dummy object.*/
		Ticket ticket = new Ticket(dummyName, new BigDecimal("10"));
		
		assertThat(new BigDecimal("9.0"), is(ticket.getDiscountPrice()));
	}
}
