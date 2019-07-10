package BasicProgram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DuplicateInt {

	public static void main(String[] args) {
  int [] arr = {1,2,4,5,2,3,5,10,7};
  int[] result = new int[arr.length];
  Arrays.sort(arr);
		int prev = arr[0] ;
     for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
		if(prev!=arr[i]) {
			result[i]= arr[i];
		}
		
		prev=arr[i];
	}
  
     
     for (int i = 0; i < result.length; i++) {
		System.out.println(result[i]);
	}
	}

}
