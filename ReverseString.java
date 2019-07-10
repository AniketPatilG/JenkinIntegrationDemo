package BasicProgram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
 System.out.println("Enter the string");
 String str = s.nextLine();
 String rvsnum ="";
 
 for (int i = str.length()-1;i>=0;i--) {
	 rvsnum = rvsnum + str.charAt(i);
	 
 }
		System.out.println(rvsnum);
		
		
	}
/* char c [] ;
// LinkedHashSet<Character> hs =new LinkedHashSet<Character>();
 HashSet<Character> hs =new HashSet<Character>();
 int l = str.length();

 for(int i =0; i<l;i++){

 hs.add(str.charAt(i));
 
 }
 System.out.println(hs.size());
	*/
	}	

