import static org.junit.Assert.*;
import org.junit.Test;

public class CalcTest{

	
	@Test
	public void testAdd() {
		Calc c = new Calc();
		assertEquals(30, c.add(10,20));
	}
	@Test
	public void testSub() {
		Calc c = new Calc();
		assertEquals(-10, c.sub(10,2));
	}
	@Test
	public void testMultipleInc() {
		Calc c = new Calc();
		c.inc(25);
		c.inc(25);
		asserEquals(50, c.getResult());
	}
}
