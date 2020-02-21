import heap_sort.*;

class Student
{
    
	public int id;
	public int test[];
	public int main_exam;
	public static int size=0;
	
	public Student()
	{
		size++;  // to know the no. of Student objects declared till now
	}
	public void setData(int i, int marks[], int main_exam_marks)
	{
		id = i;
		test = new int[5];
		for(int j=0;j<5;j++)
			test[j] = marks[j];

		main_exam = main_exam_marks;
	}

	
};

class main_program
{
	public static void findAverage(Student [] s)  // calculates the average makrs of each test 
	{
		int marks;
		int total = Student.size;
		for(int i=0;i<5;i++)
		{
			marks = 0;
			for(int j=0;j<Student.size;j++)
			{
				if(s[j].test[i] !=0)
					marks += s[j].test[i];	
				else total--;
			}
			System.out.println("Average marks for test "+(i+1)+" is "+marks/total);
		}
		marks = 0;
		total = Student.size;
		for(int i=0;i<Student.size;i++)
		{
			if(s[i].main_exam!=0)
				marks+=s[i].main_exam;
			else
				total--;
		}
		System.out.println("Average marks for main examination is "+marks/total);

	}

	public static void findHighest(Student [] s)  // calculates the highest makrs of each test 
		{
			int marks;
			
			for(int i=0;i<5;i++)
			{
				marks = -1;
				for(int j=0;j<Student.size;j++)
				{
					if(s[j].test[i] !=0)
					{
						if(marks<s[j].test[i])
							marks = s[j].test[i];	
					}
				}
				System.out.println("Highest marks for test "+(i+1)+" is "+marks);
			}

			marks = -1;
			for(int i=0;i<Student.size;i++)
			{
				if(s[i].main_exam!=0)
				{
					if(marks<s[i].main_exam)
						marks = s[i].main_exam;	
					
				}			
			}
			System.out.println("Highest marks for main examination is "+marks);

		}
	public static void findLowest(Student [] s)  // calculates the lowest makrs of each test 
		{
			int marks;
			
			for(int i=0;i<5;i++)
			{
				marks = 10000;
				for(int j=0;j<Student.size;j++)
				{
					if(s[j].test[i] !=0)
					{
						if(marks>s[j].test[i])
							marks = s[j].test[i];	
					}
				}
				System.out.println("Lowest marks for test "+(i+1)+" is "+marks);
			}

			marks = 10000;
			for(int i=0;i<Student.size;i++)
			{
				if(s[i].main_exam!=0)
				{
					if(marks>s[i].main_exam)
						marks = s[i].main_exam;	
					
				}			
			}
			System.out.println("Lowest marks for main examination is "+marks);

		}


	public static void main(String args[])
	{
		Student s[] = new Student[50];

		for(int i=0;i<3;i++)
		{	
			//creates 3 student objects and hard codes the values in various fields
			s[i] = new Student();
			int id = 1024*(i+1);
			int marks[] = new int[]{(i+1)*1, (i+1)*2, (i+1)*3, (i+1)*4, (i+1)*5};
			int main_exam = 90 - i;
			s[i].setData(id, marks, main_exam);

		}

		//prints output in table format
		System.out.format("%10s%10s%10s%10s%10s%10s%10s\n", "ID", "Test 1", "Test 2", "Test 3", "Test 4", "Test 5", "Main Exam");
		for(int i=0;i<Student.size;i++)
		{
		
		    System.out.format("%10d%10d%10d%10d%10d%10d%10d\n", s[i].id, s[i].test[0], s[i].test[1], s[i].test[2], s[i].test[3], 				s[i].test[4], s[i].main_exam);
		}

		
		 //calculates and prints average, lowest and highest marks in each test
		System.out.println("");
		findAverage(s); 
		System.out.println("");
		findHighest(s);
		System.out.println("");
		findLowest(s);
		System.out.println("");


		//heap sort on student id
		int arr[] = new int[Student.size];
		for(int i=0;i<Student.size;i++)
		{
			arr[i] = s[i].id;
		}
		heap.buildHeap(arr,Student.size);
		heap.heapSort(arr, Student.size);
		System.out.print("Student id sorted using heap sort: ");
		heap.display(arr, Student.size);
		System.out.println("");



		//heapsort on marks in main examination
		int arr2[] = new int[Student.size];
		for(int i=0;i<Student.size;i++)
		{
			arr2[i] = s[i].main_exam;
		}
		heap.buildHeap(arr2,Student.size);
		heap.heapSort(arr2, Student.size);
		System.out.print("Student main exam marks sorted using heap sort: ");
		heap.display(arr2, Student.size);
		System.out.println("");
	}	
};
