package heap_sort;
import java.util.Scanner;

public class heap
{
	
	public static void upheapify(int []arr, int i)  // to perculate up the element
	{
		if(i==0)
			return;

		if(arr[i-1/2]<arr[i])  //if the parent node has lesser value than child node then we swap them
					//and recursively do the same until we reach to the root element
		{
			int temp = arr[i-1/2];
			arr[i-1/2]=arr[i];
			arr[i]=temp;		
			upheapify(arr, i-1/2);
		}
		else
			return;
	}

	public static void downheapify(int []arr, int index, int size)
	{
		int leftChild = index*2 + 1;
		int rightChild = index*2 + 2;
		
		if(leftChild>=size) //no children...means it is a leaf node and hence heap property satisfied
			return;

		if(rightChild>=size) //only left child
		{
			if(arr[leftChild]>arr[index])           //if the value of the left child is greater than parent, we swap them and 
			{					//recursively call the downheapify functionn for maintanence of the heap 									//property
				int temp = arr[leftChild];
				arr[leftChild]=arr[index];
				arr[index]=temp;
				downheapify(arr,leftChild,size);
			}
			return;
		}
		else  //both children exists
		{
			int i = arr[leftChild]>arr[rightChild] ? leftChild : rightChild;  //we decide ww should swap parent with left child
			if(arr[i]>arr[index])						  //or with right child
			{
				int temp = arr[index];			//we swap that chosen child with the parent and recursively
				arr[index]=arr[i];			//call the downheapify function for the maintainence of the
				arr[i]=temp;				//heap property
				downheapify(arr, i, size);
			}
		}
	}

	public static void buildHeap(int []arr, int size)
	{
		for(int i=size-1;i>=0;i--)  //start building heap from leaf nodes assuming from index i+1 onwards heap is there
		{
			downheapify(arr,i,size);
		}
	}

	public static void deletepeek(int []arr, int size)  //delete the root element
	{
		if(size==0)
			return;
	
		int temp = arr[0];     //we swap the root element and put it at the end of the heap and decrease the size of the heap by 1
		arr[0]=arr[size-1];
		arr[size-1]=temp;
		downheapify(arr,0,size-1); //after swapping we downheapify that element to maintain the heap property
	}

	public static void heapSort(int []arr, int size) //T(n) = n log n, S = log n
	{
		for(int i=size;i>=0;i--) //this way we are deleting maximum element and placing it at the end of heap
		{
			deletepeek(arr, i);  
		}
	}

	public static void display(int []arr, int size)
	{
		for(int i = 0;i<size;i++)
			System.out.print(arr[i] + " ");
	}
/*
	public static void main(String args[])
	{
		int i;
		int arr[] = new int[100];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
	    	int size = input.nextInt();
	    	for(i=0;i<size;i++)
		{
			arr[i] = input.nextInt();  //input the elements to be sorted
		}
		
		buildHeap(arr,size);   //build a max heap
		System.out.print("Current heap: ");
		display(arr, size);
		System.out.println("");
		System.out.print("After heap sort ");
		heapSort(arr, size);    //heap sort the heap
	
		display(arr, size);
		System.out.println("");
	}
*/
}
