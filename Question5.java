package demo1;

public class Question5 {

	public static void main(String[] args) {
//		String[] S= {"john","alice","zack","bella","edward"};
		String[] S = {"manoj kumar","tom hanks","manoj bajpayee","tom cruise","john wick","alice smith","alice wonderland","john cena"};
		boolean flag = false;
		for(int j=0;j<S.length;j++) {
		flag = false;
		for(int i=0;i<S.length-1;i++) {
			if(S[i].compareTo(S[i+1])>0) {
				String temp = S[i];
				S[i] = S[i+1];
				S[i+1] = temp;
				flag = true;
			}
		}
		if(flag==false) {
			break;
		}
		
		}
		for(String s:S) {
			System.out.println(s);
		}
//		System.out.println(S[0].charAt(0));
	}

}
