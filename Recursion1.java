package BasicProgram;

public class Recursion1 {
	
	//Infinte time

	public static void Aniket() {
		System.out.println("Aniket Gurjar");
		Aniket();
	}
	//Finite Time
	static int i =0;
	public static void AniketFinite() {
		
		if (i<=10) {
			i++;
			System.out.println("TestFinte"+i);
			AniketFinite();
			
		}
		
	}
	
	public static void main(String[] args) {
		//Aniket();
		AniketFinite();

	}

}
