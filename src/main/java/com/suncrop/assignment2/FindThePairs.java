package com.suncrop.assignment2;

public class FindThePairs {
	
	public static void main(String args[]) 
    { 
        int numbers[] = { 1, 4, 5, 7, 8, 9 }; 
        int delta = 3; 
        System.out.println("Count of pairs with given difference is: "+uniquePairs(numbers, delta)); 
    } 
	
	public static int uniquePairs(int[] numbers, int delta) {
		int count = 0;
		// Pick all elements one by one 
		if (numbers!= null && numbers.length > 0) {
			for (int element=0; element < numbers.length; element++) {
				// See if there is a pair of this picked element
				for (int value = element + 1; value < numbers.length; value++) {
					if (numbers[element] - numbers[value] == delta || numbers[value] - numbers[element] == delta) {
						count++;
					}
				}
			}
		}
		return count;
	}

}
