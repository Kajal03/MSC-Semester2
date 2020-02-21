class Set
{
	private int arr[]; //contains the elements of the set
	private int size;

	public Set()  //constructor
	{
		arr = new int[1000];
		size = 0;
	}

	public Set(Set temp)  //copy constructor
	{
		size = temp.size;
		arr = new int[1000];  //to facilitate deep copy of contents
		for(int i=0;i<size;i++)
		{
			arr[i] = temp.arr[i];  
		}
	}


	public void addElement(int data)
	{
		int i;
		for(i=0;i<size;i++)  //to check whether the new element is already there in the set
		{
			if(arr[i]==data)
				break;
		}
		if(i==size)  //if the element is not found, hence end of loop reached then add the new element
		{
			arr[i]=data;
			size++;
		}
	}

	public void deleteElement(int data)
	{
		for(int i=0;i<size;i++)
		{
			if(arr[i]==data)
			{
				arr[i]=arr[size-1];  //to replace the element to be deleted with the last element 
				size--;              //and thereby decreasing the size of the set
				break;
			}
		}
	}

	public void printSet()  //to print the contents of the set
	{
		for(int i=0;i<size;i++)
			System.out.print(arr[i] + " ");
	}

	public void countElements()  // to display the size of the set
	{
		System.out.println(size);
	}

	public void intersection(Set temp)  // to find the intersection of the two sets
	{
		for(int i=0;i<temp.size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(temp.arr[i]==arr[j])   //if the element occurs in both the sets then print the element
				{
					System.out.print(arr[i]+ " ");
				}
			}
		}
	}

	public void difference(Set temp)  //to find the difference of two sets
	{
		int i, j;
		for(i=0;i<size;i++)
		{
			for(j=0;j<temp.size;j++)
			{
				if(temp.arr[j]==arr[i])
				{
					break;
				}
			} 
			//if the end of second set is reached and the element was not found so print the element

			if(j==temp.size)
			{
				System.out.print(arr[i] + " ");
			}
		}
	}
	
};

public class main_program
{
	public static void main(String args[])
	{
		Set s1 = new Set();
		s1.addElement(1);
		s1.addElement(2);
		s1.addElement(2);  //not added again
		System.out.print("The contents of first set : ");
		s1.printSet();
		
		System.out.println("");
		Set s2 = new Set(s1); //copy constructor invoked
		s2.addElement(7);
		System.out.print("The contents of second set : ");
		s2.printSet();	

		System.out.println("");
		s1.addElement(8);
		System.out.print("The updated contents of first set : ");
		s1.printSet();

		System.out.println("");
		System.out.print("The intersection of two sets : ");
		s1.intersection(s2);  

		System.out.println("");
		System.out.print("The difference (s1 - s2) : ");
		s1.difference(s2);  // indicates (s1 - s2)
	
		System.out.println("");
		System.out.print("The difference (s2 - s1) : ");
		s2.difference(s1);  // indicates (s2 - s1)
	
		System.out.println("");
	}
}
