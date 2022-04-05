package no.hvl.dat102.sorting;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		InsertionSort I_Sort = new InsertionSort();
		SelectionSort S_Sort = new SelectionSort();
		QuickSort Q_Sort = new QuickSort();
		MergeSort M_Sort = new MergeSort();
		
		int [] tabell = RandomArray(1000000,10000000);
		
//		Random tilfeldig = new Random(); 
//		int n = 32000; 
//		int antal = 10; 
//		 
//		int[][] a = new int[antal][n]; 
//		 
//		// set inn tilfeldige heiltal i alle rekker 
//		for (int i = 0; i < antal; i++){ 
//		for (int j = 0; j < n; j++){ 
//		a[i][j] = tilfeldig.nextInt(); 
//		} 
//		} 
//		 
//		// start tidsmåling 
//		for (int i = 0; i < antal; i++){ 
//		M_Sort.mergeSort(a[i],n); // blir ein eindimensjonal tabell 
//		}         
		// slutt tidsmåling 
	    
	    
	    
	    
//		I_Sort.InsertSort(tabell);
//		S_Sort.sort(tabell);
		
//		long startTime = System.currentTimeMillis();
//		Q_Sort.quick_sort(tabell,0,tabell.length-1);
//		 long endTime = System.currentTimeMillis();
//			System.out.println("Quick Sort tok " + (endTime - startTime) + " milliseconds");
		for(int i = 0; i<10;i++) {
			long startTime = System.currentTimeMillis();
			M_Sort.mergeSort(tabell, tabell.length);
			long endTime = System.currentTimeMillis();
			System.out.println("Merge Sort tok " + (endTime - startTime) + " milliseconds");

		}
	    
	    
	   
		
	}
	
	public static int [] RandomArray(int interval, int lengde) {

		Random rd = new Random(); // creating Random object
	      int[] arr = new int[lengde];
	      for (int i = 0; i < arr.length; i++) {
	         arr[i] = rd.nextInt(interval); // storing random integers in an array
	        
	      }
	      return arr;
	}
	
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
	
}
