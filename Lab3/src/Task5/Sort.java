package Task5;

public class Sort {
	
	
	
	//sorting 1
	//HEAP
	static <E> void swap(E [] array, int i, int j) {
		E o1 = array[i];
		array[i] = array[j];
		array[j] = o1;
	}
	
	
	static <E extends Comparable<E>> void heapSort(E [] array) {
		for(int i = (array.length - 1) / 2; i >= 0; i--) {
			heapify(array, i, array.length);
		}
		
		for(int i = array.length - 1; i >= 0; i--) {
			swap(array, 0, i);
			heapify(array, 0, i - 1);
		}
	}
	
	
	static <E extends Comparable<E>> void heapify(E [] array, int index, int size) {
		int max = index;
		int left = 2 * index + 1;
		int right = 2 * index + 2;
		
		if(left < size && array[left].compareTo(array[max]) == 1) {
			max = left;
		}
		
		if(right < size && array[right].compareTo(array[max]) == 1) {
			max = right;
		}
		
		if(max != index) {
			swap(array, max, index);
			heapify(array, max, size);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	//next sorting 2
	
	
	//BUBBLE
	/*
	static <E> void bubbleSort(E [] array)
    {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) { //The operator > is undefined for the argument type(s) E, E
                    // swap arr[j+1] and arr[j]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }
	*/
	
	
	//MERGE
	/*
	static <E> void mergeSort(E [] array) {
		
		int size;
		size = array.length;
		
		
		int i;
		E o1 = array[i];
		
	    if (size < 2) {
	        return;
	    }
	    int mid = size / 2;
	    int[] l = new int[mid];
	    int[] r = new int[size - mid];

	    for (int i = 0; i < mid; i++) {
	        l[i] = array[i];
	    }
	    for (int i = mid; i < size; i++) {
	        r[i - mid] = array[i];
	    }
	    mergeSort(l, mid);
	    mergeSort(r, size - mid);

	    merge(array, l, r, mid, size - mid);
	}
	*/
}

