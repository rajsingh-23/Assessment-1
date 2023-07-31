package demo1;

import java.util.Arrays;

public class Question3 {

	public static void main(String[] args) {
		int[] A = {1,5,3};
		Arrays.sort(A);
		int first = A[0];
		int second = A[A.length-1];
		
		for(int i=0,j=A.length-1;i<(j-1);) {
			if(first < second) {
				first = first + A[++i];
			}else {
				second = second + A[--j];
			}
		}
		
		if(first==second) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
