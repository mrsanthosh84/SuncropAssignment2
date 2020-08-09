package com.suncrop.assignment2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindThePairsTest {
	
	@Test
	public void WhenFindThePairsThenCountOfPairs() {
		int numbers[] = {1,4,5,7,8,9}; 
		assertEquals(3, FindThePairs.uniquePairs(numbers, 3));
	}
	
	@Test
	public void WhenFindThePairsOtherSetThenCountOfPairs() {
		int numbers[] = {1,4,5,7}; 
		assertEquals(2, FindThePairs.uniquePairs(numbers, 3));
	}
	
	@Test
	public void WhenFindWithNoPairsThenCountOfPairsisZero() {
		int numbers[] = {}; 
		assertEquals(0, FindThePairs.uniquePairs(numbers, 3));
	}

}
