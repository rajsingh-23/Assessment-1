package demo1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		boolean range = true;
		
		Scanner sc = new Scanner(System.in);
		
		int intRange; 
		
		
		
		
		while(range) {
			System.out.println("Enter a starting distance (between 5 km to 8 km):");
			
			intRange = sc.nextInt();
			
			if(intRange >= 5 && intRange <= 8) {
				for(int i=intRange;i>=1;i--) {
					System.out.println("Distance to run: "+i);
					if(i == (intRange-1)) {
						System.out.println("Good start, keep it up!");
					}
					if(((i-2) == 0) || ((i-1) == 0)) {
						System.out.println("Almost there!");
					}
	
				}
				System.out.println("Done for the day!");
				range = false;
			}else {
				System.out.println("Sorry, Choose between 5 km to 8 km):");
				range = true;
			}
		}
		
		sc.close();
	}

}
