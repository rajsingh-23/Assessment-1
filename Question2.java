package demo1;

public class Question2 {

	public static void main(String[] args) {
		int[] Arr = {-2, -3, 4, -1, -2, -1, 5, -3};
		int sumation = 0;
		int max = -9999;
		for(int i=0;i<Arr.length;i++) {
			sumation = sumation + Arr[i];
			if(sumation > max) {
				max = sumation;
			}else {
				sumation = sumation - Arr[i];
			}
			
		}
		System.out.println(max);

	}

}
