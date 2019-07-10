package BasicProgram;



	import java.util.*;

	class Student{
		private int id;
		private String fname;
		private double cgpa;
		public Student(int id, String fname, double cgpa) {
			super();
			this.id = id;
			this.fname = fname;
			this.cgpa = cgpa;
		}
		public int getId() {
			return id;
		}
		public String getFname() {
			return fname;
		}
		public double getCgpa() {
			return cgpa;
		}
	}

	//Complete the code
	public class Solution
	{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			int testCases = Integer.parseInt(in.nextLine());
			
			List<Student> studentList = new ArrayList<Student>();
			while(testCases>0){
				int id = in.nextInt();
				String fname = in.next();
				double cgpa = in.nextDouble();
				
				Student st = new Student(id, fname, cgpa);
				studentList.add(st);
				
				testCases--;
			}
			String [] a = new String [studentList.size()] ;
	      
	      for (int i = 0; i <= a.length ; i++) {
		      	for(Student st: studentList){
					//System.out.println(st.getFname());
					a[i]=st.getFname();
				}
			
	    	}
	    Arrays.sort(a);

	      for (int i = 0; i < a.length ; i++) {
					System.out.println(a[i]);
			
	    	}
	    
	    
		}
	}


////////////////////////
