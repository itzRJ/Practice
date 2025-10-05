public class SortingAssignment {

    //Q1
    public void bubbleSort(int[] arr)
    {
        int n = arr.length;
        // Traverse through all array elements
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                // Last i elements are already in place
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }


    //Q2
    public void selectionSort(int[] arr)
    {
        int n = arr.length;
         // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    //Q3
    public void insertionSort(int[] arr)
    {
        int n = arr.length;

        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
            // Move elements of arr[0..i-1], that are greater than key,
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            // Move the key to its correct position
            arr[j+1] = key;
        }
    }

}
