package BasicProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Duplicates {

	public static void main(String[] args) {
    String s = "AniketPatilAniketPatilAniketPatil";
    char[] ch = s.toCharArray();
  //  System.out.println(ch);
    LinkedHashMap<Character,Integer> m = new LinkedHashMap<Character,Integer>();	
    
    for (char c : ch) {
		if(m.containsKey(c)) {
			m.put(c, m.get(c)+1);
		}else {
			m.put(c, 1);
		}
			
	}
    System.out.println(m);
    System.out.print(m.keySet().toArray()[3]) ;
	}

}
