package no.hvl.dat102.sorting;

public class InsertionSort {

	public void InsertSort(int arr[]) {
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 1; i<arr.length;i++) {
			int temp = arr[i];
			int j = i -1;
			
			while(j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j = j -1;
			}
			arr[j + 1] = temp;
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("Insertion Sort tok " + (endTime - startTime) + " milliseconds");
	}
	
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
}
