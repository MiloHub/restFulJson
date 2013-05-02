package com.spring.restful.TestREST;

import java.util.Arrays;

public class TestArray {
	
	public static void main(String[] args) {
		
		int[] test ={-1, 6, 3, 4, 7, 4};
		System.out.println(array_inversion_count (test));
		
		
	}
	
	static int merge(int[] A, int[] left, int[] right) {
	    int i = 0, j = 0, count = 0;
	    while (i < left.length || j < right.length) {
	        if (i == left.length) {
	            A[i+j] = right[j];
	            j++;
	        } else if (j == right.length) {
	            A[i+j] = left[i];
	            i++;
	        } else if (left[i] <= right[j]) {
	            A[i+j] = left[i];
	            i++;                
	        } else {
	            A[i+j] = right[j];
	            count += left.length-i;
	            j++;
	        }
	    }
	    return count;
	}

	static int array_inversion_count (int[] A) {
	    if (A.length < 2)
	        return 0;

	    int m = (A.length + 1) / 2;
	    int left[] = Arrays.copyOfRange(A, 0, m);
	    int right[] = Arrays.copyOfRange(A, m, A.length);

	    return array_inversion_count (left) + array_inversion_count (right) + merge(A, left, right);
	}

}
