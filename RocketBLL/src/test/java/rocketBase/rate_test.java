package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.RateException;

public class rate_test {

	//TODO - RocketBLL rate_test
	//		Check to see if a known credit score returns a known interest rate
	
	//TODO - RocketBLL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score
	@Test
	public void test() {
		assert(1==1);
	}

	int cs = 750;
	double myrate = 3.75;
	
	@Test
	public void creditIntrestTest() throws RateException {
		double rate = RateBLL.getRate(cs);
		assertTrue(rate == myrate);
		
		try {
			assertEquals(RateBLL.getRate(700), 0.00, 7.0);
			} catch (RateException error) {
				error.printStackTrace();
		}
		try {
			assertEquals(RateBLL.getRate(445), 0.00, 4.0);
		} catch (RateException error) {
			error.printStackTrace();
		}
		
	}
	
	@Test
	public void RateExcptionTest() throws RateException{
		int cs = 0;
		try{
			double myrate = RateBLL.getRate(cs);
		}
		catch(Exception error){
			boolean isRateException = error instanceof RateException;
			assertTrue(isRateException);
		}
	}
}
