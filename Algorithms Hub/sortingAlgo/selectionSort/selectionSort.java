// Java program to implement selection sort

class Main
{
  // To sort the array using selection sort
	public static void sort(int arr[])
	{
		int n = arr.length;

		// One by one move boundary of the unsorted subarray
		for (int i = 0; i < n-1; i++)
		{
			// Find the minimum element in the remaining unsorted array
			int min = i;
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[min])
					min = j;

			// Swap the minimum element with the first element
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

	// To print the array
	public static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	public static void main(String args[])
	{
		int arr[] = {9, 5, 45, 91, 25, 12, 11};
		System.out.print("Original Array : \n");
		printArray(arr);
		sort(arr);
		System.out.println();
		System.out.print("Sorted array : \n");
		printArray(arr);
	}
}
