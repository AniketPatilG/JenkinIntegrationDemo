package BasicProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Test123 {
	
	
    static int divisibilityCheck(int [] A, int N) 
{ 

List<Integer> s = new ArrayList<Integer>(); 
int max_ele = Integer.MIN_VALUE; 
for (int i = 0; i < N; i++)  
{ 
s.add(A[i]); 


max_ele = Math.max(max_ele, A[i]); 
} 


LinkedHashSet<Integer> res =  new LinkedHashSet<Integer>(); 
for (int i = 0; i < N; i++)  
{ 


if (A[i] != 0) 


for (int j = A[i] * 2;  
j <= max_ele;  
j += A[i]) 
{ 


if (s.contains(j)) 
res.add(j); 
} 
} 


List<Integer> list =  new ArrayList<Integer>(res); 
Collections.reverse(list); 

for (Integer temp : list) 
System.out.print(temp + " "); 

//System.out.println(list.size());
return list.size();
} 


public static void main(String args[]) 
{ 
int [] arr = {2 ,3, 4, 6, 8, 9}; 
int n = arr.length;
divisibilityCheck(arr, n); 
//System.out.println(divisibilityCheck(arr, n));
} 
} 


