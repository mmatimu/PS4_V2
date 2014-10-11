package MainPackage;

import org.junit.Test;

import junit.framework.TestCase;

public class FVJunitTest extends TestCase{
	@Test
	public void testFutureValue() {
		FutureValue test = new FutureValue();
		assertEquals("Future Value expected to Yield $11007.03078125",11007.03078125,test.returnFutureValue(10000, 3, 3.25));
		assertEquals("Future Value expected to Yield $21724.5214967999",21724.5214967999,test.returnFutureValue(1000, 40, 8));
		
	}
}
