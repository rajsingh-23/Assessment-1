package demo1;

public class Question4 {
	public static int jump(int[] a) {
		int endPoint = a[0];
		int step = a[0];
		int jump=1;
		if(a.length<1) {
			return 0;
		}else {
			if(a[0]==0) {
				return -1;
			}
		}
		
		for(int i=1;i<a.length;i++) {
			if(i==a.length-1) 
				return jump;
			endPoint = Math.max(endPoint, i+a[i]);
			step--;
			if(step==0) {
				jump++;
				if(i>endPoint)
					return -1;
				step = endPoint-i;
			}
				
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] A = {1,3,5,8,9,2,6,7,6,8,9};
		
		int result = jump(A);
		System.out.println(result);

}}
