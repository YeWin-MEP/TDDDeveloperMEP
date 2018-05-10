package com.myanmareffectiveprogrammer.tdd.testdoubles.mock;

import java.math.BigDecimal;

public class HttpPrice implements Price {

	@Override
	public BigDecimal getInitialPrice() {
		return HttpPricingService.getInitialPrice();
	}

	private static class HttpPricingService {
		// Return arbitrary price, in this case 10 so that the test fails
		static BigDecimal getInitialPrice() {
			return new BigDecimal("20");
		}
	}
}