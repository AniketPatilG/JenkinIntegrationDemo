package BasicProgram;

import java.util.Scanner;

public class SwapWithoutemp {

	public static void main(String[] args) {
	     Scanner  s = new Scanner(System.in);
	     System.out.print("Enter Fnum number : "); 
	     int Fnum = s.nextInt();
	     System.out.print("Enter Lnum number : "); 
	     int Lnum = s.nextInt();
	     
	     Fnum = Fnum - Lnum;
	     Lnum = Fnum + Lnum;
	     Fnum = Lnum - Fnum;
	     
	     System.out.println("After swap Lnum =  "+Lnum);
	     System.out.println("After swap Fnum =  "+Fnum);
	     
	     
	}

}
