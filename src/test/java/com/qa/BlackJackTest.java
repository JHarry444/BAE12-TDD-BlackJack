package com.qa;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BlackJackTest {

	private BlackJack jack = new BlackJack();

	@Test
	public void testBothBust() {
		int expected = 0;
		int actual = jack.play(33, 33);
		assertEquals(expected, actual);
	}

	@Test
	public void testP1Bust() {
		assertEquals(19, jack.play(22, 19));
	}

	@Test
	public void testP2Bust() {
		assertEquals(16, jack.play(16, 25));
	}

	@Test
	public void testDraw() {
		assertEquals(15, jack.play(15, 15));
	}

	@Test
	public void testP1Wins() {
		assertEquals(21, jack.play(21, 17));

	}

	@Test
	public void testP2Wins() {
		assertEquals(20, jack.play(14, 20));
	}
}
