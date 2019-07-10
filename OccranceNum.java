package BasicProgram;

import java.util.HashMap;
import java.util.Scanner;

public class OccranceNum {
	static int ite = 0;
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the String");
		String Str = s.nextLine();
		
		char [] charr =Str.toCharArray();
	//	System.out.println(charr);
		HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();
int a =		charr.length;
		for(char ch:charr) {
			
			if(myMap.containsKey(ch)) {
				myMap.put(ch, myMap.get(ch)+1);
				
				//System.out.println(ch);
				
			}else {
				myMap.put(ch, 1);
			}
		}
System.out.println(myMap);
		
	}

}
