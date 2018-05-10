package com.myanmareffectiveprogrammer.tdd.testdoubles.stub;

import java.math.BigDecimal;

public class StubPrice implements Price {
	
	@Override
	public BigDecimal getInitialPrice() {
		/* Return consistent price */
		return new BigDecimal("10");
	}
}
