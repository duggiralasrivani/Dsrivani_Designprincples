package pack1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalTest {

	

	@Test
	public void test1() {
    	Cal c=new Cal();

		assertEquals(9,c.add(5,4));
	
		
	}
	@Test
	public void test2() {
    	Cal c=new Cal();

		assertEquals(1,c.sub(5,4));
	
		
	}
	@Test
	public void test3() {
    	Cal c=new Cal();

		assertEquals(1,c.div(5,4));
	
		
	}
	@Test
	public void test4() {
    	Cal c=new Cal();

		assertEquals(12,c.mul(3,4));
		
	}
	

}
