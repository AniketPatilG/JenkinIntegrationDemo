package BasicProgram;

public class Sort {
	static int temp=0;
	

	public static void main(String[] args) {
		System.out.println("test");
		
		int arr[] = {20,30,10,15,40,50,70,63,45};
        int n = arr.length;
        int temp =0;
        
        for(int i=0;i<n-1;i++) {
        	for(int j=0;j<n-1;j++) {
        		if(arr[j]<arr[j+1]) {
        			temp = arr[j];
        			arr[j]=arr[j+1];
        			arr[j+1]=temp;
        			
        		}
        	}
        	
        }
		
		
		System.out.println("+++++++++++++++++++++++++++++");
		for(int k =0;k<arr.length;k++) {
			System.out.println(arr[k]);
			
		}
		

	}

}
