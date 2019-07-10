package BasicProgram;

public class QGPrgrm1 {

	
public static void main(String[] args) {
	try {
		System.out.println(100/0);
    }catch (ArithmeticException ae) {
System.out.println(ae);	
	} catch (Exception e) {
		System.out.println("test2 "+e.getLocalizedMessage() );			
	}
}
	
}
