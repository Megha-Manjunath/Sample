package Distance;

import static org.junit.Assert.*;

import org.junit.Test;

public class DistanceTest {


	@Test
	public void test() {
		Smallest small = new Smallest();
		assertEquals(2.004, 2.004, small.getDist(53.32,53.32,-1.72,-1.69));
		assertNotEquals(1.56, small.getDist(53.32,53.32,-1.72,-1.69));
	}

}
