package BasicProgram;

public class Test1 {

	public static void main(String[] args) {
int temp=0;
System.out.println("test");
		int arr [] = {10,20,40,30,10,20,40,30,20,37};
		int len =  arr.length-1;
		for(int i = 0;i<len;i++) {
			for(int j=0;j<len;j++) {
				
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
			
		}
		for(int k=0;k<len;k++) {
			System.out.println(arr[k]);
		}
		
		System.out.println("test");
	}

}
