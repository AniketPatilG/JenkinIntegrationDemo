package BasicProgram;

public class ReverseWords {

	static String s = "My Name is Aniket";
	public static void main(String[] args) {
		String [] wrd = s.split(" ");
		String tmp = "";
		StringBuilder b = new StringBuilder();
		for(int i = wrd.length-1;i>=0;i--) {
         wrd[i] = tmp+wrd[i];
         System.out.print(wrd[i]+" ");
		}

	}

}
