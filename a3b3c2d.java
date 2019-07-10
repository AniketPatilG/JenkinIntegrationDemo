package BasicProgram;

public class a3b3c2d {
	public static void main(String[] args) {

        // String orignalString = "aaabbcccd";
        String orgString = "aaaaaaabcccdedddabbce";
        // String orignalString = "abbcccddd";
        StringBuilder sortedString = new StringBuilder();

        int occr = 1;
        char rChar = orgString.charAt(0);
        
        for (int num = 1; num < orgString.length(); num++) {
        	
            if (orgString.charAt(num) == rChar) {
                ++occr;
            } else {
                if (occr != 1) {
                    sortedString.append(rChar).append(occr);
                } else {
                    sortedString.append(rChar);
                }
                
                
                occr = 1;
                rChar = orgString.charAt(num);
            }
        }
        if (occr != 1)
            sortedString.append(rChar).append(occr);
        else
            sortedString.append(rChar);
        
        
        System.out.println(sortedString.toString());
    }

}
