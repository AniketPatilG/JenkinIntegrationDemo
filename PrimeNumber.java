package BasicProgram;

import java.util.Scanner;

public class PrimeNumber {
	static int Lnumber ;
	static int mid;
	static int flag = 0;

	public static void main(String[] args) {
	       Scanner s = new Scanner(System.in);  
	       System.out.print("Enter a number : ");  
	        Lnumber = s.nextInt(); 
	        mid = Lnumber/2;

	        
	       
		if (Lnumber == 1 || Lnumber ==0) {
			System.out.println(Lnumber+" is not Prime Number");
		}else {
			for(int i =2;i<=mid;i++) {
				if(Lnumber % i == 0) {
					System.out.println(Lnumber+" is not Prime Number");
					flag = 1;
					break;
				}
			}
			
			if (flag==0) {
				System.out.println(Lnumber+" is Prime Number");
			}
			
		}
		
	

	}

}
