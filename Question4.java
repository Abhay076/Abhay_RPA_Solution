

class Question4 {
		public static void bubbleSort(int arr[], int n)
	{
		int i, j, temp;
		boolean swapped;
		for (i = 0; i < n - 1; i++) {
			swapped = false;
			for (j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (swapped == false)
				break;
		}
	}

public static void printArray(int arr[], int size)
{
    int i;
    for (i = 0; i < size; i++)
        System.out.print(arr[i] + " ");
    System.out.println();
}

 /*Function to sort array using insertion sort*/
   public static void insertion(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }    



    // Heap Sort
public static void  HeapSort(int arr[])
    {
        int N = arr.length;
        for (int i = N / 2 - 1; i >= 0; i--)
            heap(arr, N, i);

        for (int i = N - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heap(arr, i, 0);
        }
    }
   public static void heap(int arr[], int N, int i)
    {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2; 
        if (l < N && arr[l] > arr[largest])
            largest = l;
        if (r < N && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heap(arr, N, largest);
        }
    }


	public static void main(String args[])
	{
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		int n = arr.length;
        bubbleSort(arr, n);
        // insertion(arr);
        // HeapSort(arr);
		System.out.println("Sorted array: ");
		printArray(arr, n);
	}
}

