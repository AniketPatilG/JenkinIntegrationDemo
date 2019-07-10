package BasicProgram;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
     Scanner  s = new Scanner(System.in);
     String sp =s.nextLine();
     System.out.println("Username is: " + sp);
     System.out.println(sp.length());
     System.out.print("Enter Fnum number : "); 
     int Fnum = s.nextInt();
  //   System.out.println("before swap Fnum =  "+Fnum);
     System.out.print("Enter Lnum number : "); 
     int Lnum = s.nextInt();
     

    
    // System.out.println("before swap Lnum =  "+Lnum);
     int temp;
     
     temp = Fnum;
     Fnum = Lnum;
     Lnum = temp;
     
    
     System.out.println("After swap Fnum =  "+Fnum);
     System.out.println("After swap Lnum =  "+Lnum);
	}

}
