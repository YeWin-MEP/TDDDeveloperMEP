package com.myanmareffectiveprogrammer.tdd.testdoubles.mock;

import java.math.BigDecimal;

public class StubPrice implements Price {
	
	@Override
	public BigDecimal getInitialPrice() {
		return new BigDecimal("10");
	}
}
