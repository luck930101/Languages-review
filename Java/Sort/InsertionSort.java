package sort;

import java.util.Arrays;

public class InsertionSort {
	public static void insertionSort(int [] unsortedarray){
		for (int i = 1; i < unsortedarray.length; i++) {
			int j = i-1;
			int current = unsortedarray[i];
			while(j >= 0&&current<unsortedarray[j]){
				unsortedarray[j+1] = unsortedarray[j];
				j--;
			}
			unsortedarray[j+1]=current;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 ={9,8,7,6,5,4,3,2,1};
		int[] array2 ={3,9,8,2,3,8,0,4,2,5};
		insertionSort(array1);
		insertionSort(array2);
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));

	}

}
