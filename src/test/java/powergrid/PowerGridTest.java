package powergrid;

import static org.junit.Assert.*;

import org.junit.Test;

public class PowerGridTest {

	@Test
	public void test1() {
		assertTrue(PowerGrid.canLoadBalance(10, 15, 35));
	}

	@Test
	public void test2() {
		assertTrue(!PowerGrid.canLoadBalance(4, 8, 6));
	}

	@Test
	public void test3() {
		assertTrue(PowerGrid.canLoadBalance(40, 40, 40));
	}

	@Test
	public void test4() {
		assertTrue(PowerGrid.canLoadBalance(0, 0, 0));
	}

	@Test
	public void test5() {
		assertTrue(PowerGrid.canLoadBalance(225, 500, 475));
	}

	@Test
	public void test6() {
		assertTrue(!PowerGrid.canLoadBalance(40, 80, 0));
	}

	@Test
	public void test7() {
		assertTrue(!PowerGrid.canLoadBalance(5, 1, 3));
	}

	@Test
	public void test8() {
		assertTrue(!PowerGrid.canLoadBalance(5, 2, 2));
	}

	@Test
	public void test9() {
		assertTrue(PowerGrid.canLoadBalance(7, 2, 3));
	}

	@Test
	public void test10() {
		assertTrue(!PowerGrid.canLoadBalance(7, 5, 3));
	}

	@Test
	public void test11() {
		assertTrue(PowerGrid.canLoadBalance(15, 30, 45));
	}

	@Test
	public void test12() {
		assertTrue(PowerGrid.canLoadBalance(2, 6, 16));
	}

}
