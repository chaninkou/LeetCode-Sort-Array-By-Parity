package parity;

public class SortArrayEvenThenOddFunction {
    public int[] sortArrayByParity(int[] A) {
        int size = A.length;
        
        int start = 0;
            
        int end = size - 1;
        
        // Since we know  the size
        int[] res = new int[size];
        
        for (int i = 0; i < size; i++) {
            // Check if the reminder is 1 or 0
            // If it's 1, then add it to the end of the array
            if (A[i] % 2 == 1) {
                res[end--] = A[i];
            } else { // If its not odd, then it will be even
                // Add it to the front of the array
                res[start++] = A[i];
            }
        }
        
        return res;
    }
}
