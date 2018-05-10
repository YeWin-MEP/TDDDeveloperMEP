package com.myanmareffectiveprogrammer.tdd.multiplecase;

import java.math.BigDecimal;

public class TicketRevenue {

	private final static int TICKET_PRICE = 30;

	public BigDecimal estimateTotalRevenue(int numberOfTicketsSold)
			throws IllegalArgumentException {
		/*Exceptional Case*/
		if (numberOfTicketsSold < 0 || numberOfTicketsSold > 100) {
			throw new IllegalArgumentException("Tix sold must == 1..100");
		}
		/* All other case */
		return new BigDecimal(TICKET_PRICE * numberOfTicketsSold);
	}
}
