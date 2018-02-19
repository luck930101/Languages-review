public class Sort {
	public void swap(int i, int j){
		int temp =i;
		i=j;
		j=temp;
	}
	
	public int[]  InsertionSort(int[] unsortedarray){
		int[] sortedarray = copyArray(unsortedarray);
		int temp;
		for(int i = 0;i < sortedarray.length-1; i++){
			for(int j = i+1;j > 0; j--){
				if(sortedarray[j]<sortedarray[j-1]){
					temp = sortedarray[j];
					sortedarray[j] = sortedarray[j-1];
					sortedarray[j-1] = temp;
				}
				else{
					break;
				}
			}		
		}
		return sortedarray;
	}
	
	
	public int[]  SelectionSort(int[] unsortedarray){
		int[] sortedarray = copyArray(unsortedarray);
		int min;
		int temp;
		for(int i = 0;i < sortedarray.length; i++){
			min = sortedarray[i];
			for(int j = i;j < sortedarray.length; j++){
				if(sortedarray[j]<min){
					temp = min;
					min = sortedarray[j];
					sortedarray[j] = temp;
				}
			sortedarray[i]= min;
			}		
		}
		return sortedarray;
	}
	
	
	public int[]  BubbleSort(int[] unsortedarray){
		int[] sortedarray = copyArray(unsortedarray);
		int temp;
		for(int i = sortedarray.length-1;i >0; i--){
			for(int j = 0;j < i-1; j++){
				if(sortedarray[j]>sortedarray[i]){
					temp = sortedarray[j];
					sortedarray[j] = sortedarray[i];
					sortedarray[i] = temp;
				}
			}		
		}
		return sortedarray;
	}
	
	public int[]  QuickSort(int[] unsortedarray){
		int[] sortedarray = copyArray(unsortedarray);
		QuickSortExecute(sortedarray,0,sortedarray.length-1);
		return sortedarray;
	}
	
	public void  QuickSortExecute(int[] unsortedarray,int low, int high){
		if(low>high){
			return;
		}
		int pivot = unsortedarray[low];
		int currentlow = low;
		int currenthigh = high;
		int temp;

		
		while (currentlow != currenthigh){
			while(unsortedarray[currenthigh]>pivot&&currentlow<currenthigh){
				currenthigh--;
			}
			while(unsortedarray[currentlow]<pivot&&currentlow<currenthigh){

				currentlow++;
			}
			if(currentlow<currenthigh){
				temp = unsortedarray[currenthigh];
				unsortedarray[currenthigh] = unsortedarray[currentlow];
				unsortedarray[currentlow] = temp;
			}		
		}
		temp = unsortedarray[currentlow];
		unsortedarray[currentlow] = unsortedarray[currenthigh];
		unsortedarray[currenthigh] = temp;
		
		QuickSortExecute(unsortedarray,low, currentlow-1);
		QuickSortExecute(unsortedarray,currentlow+1, high);
		
	}
	
	
	
	
	
	public void printarray(int[] array){
		for(int i = 0;i < array.length; i++){
			
			System.out.print(array[i] +", ");
		}
		System.out.println();
		
	}
	
	public boolean isSorted(int[] array){
		for(int i = 0;i<array.length-1;i++){
			if(array[i]>array[i+1]){
				return false;
			}
			else {
				continue;
			}
		}
		return true;
	}
	
	public int[] copyArray(int[] array){
		int[] newarray = new int [array.length];
		for(int i = 0; i<array.length;i++){
			newarray[i] = array[i];
		}
			
		return newarray;
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		Sort s = new Sort();
		int[] array ={9,8,7,6,5,4,3,2,1};
		s.printarray(array);
		int[] bubble = s.BubbleSort(array);
		s.printarray(array);
		int[] select = s.SelectionSort(array);
		int[] insert = s.InsertionSort(array);
		int[] quick  = s.QuickSort(array);
		s.printarray(quick);
		System.out.println("result of unsorted array is: "+ s.isSorted(array));
		System.out.println("result of InsertionSort is: "+ s.isSorted(insert));
		System.out.println("result of BubbleSort is: "+ s.isSorted(bubble));
		System.out.println("result of SelectionSort is: "+ s.isSorted(select));
		System.out.println("result of QuickSort is: "+ s.isSorted(quick));
	}

}
