package BasicProgram;


public class QGPrgm {

	
	public static void main(String[] args) {
		String s ="Aniket Patil is good guy";
   String [] wrds = s.split(" ");
     int wrdlen = wrds.length;
     
     StringBuilder  sb = new StringBuilder();
     for (int i = wrds.length-1; i >=0 ; i--) {
    	// 
    	for (int j = 0; j < wrds[i].length(); j++) {
    		 
    		if (j%2==0) {
    			char s1 =wrds[i].toUpperCase().charAt(j);
    			sb.append(s1);
    		}else {
    			sb.append(wrds[i].charAt(j));
    		}
		} 
		
    	sb.append(" ");
	}
     System.out.println(sb);
     
	}

}
