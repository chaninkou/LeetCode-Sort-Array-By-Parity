package leetcode905;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] A = {3,1,2,4};
		
		System.out.println("Input: " + Arrays.toString(A));
		
		SortArrayEvenThenOddFunction solution = new SortArrayEvenThenOddFunction();
		
		System.out.println("Solution: " + Arrays.toString(solution.sortArrayByParity(A)));
		
	}
}
