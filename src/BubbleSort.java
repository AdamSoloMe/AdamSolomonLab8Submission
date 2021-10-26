public class BubbleSort{

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { 
            for (inner = 0; inner < outer; inner++) { 
                if (a[inner] > a[inner + 1]) { 
                    temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                    //ToDo 3: complete this algorithm, test it, provide its time complexity
                    // The time Complexity of this algorithm is O(N^2)
                }
            }
        }
    }
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }



    public static void main(String args[]){
        int arr1[]={53,38,22,27,7,25,42,35,66,39,55,38,62,1,35,67,18,5,38,34};
        bubbleSort(arr1,20);

        System.out.println("Sorted array");
        printArray(arr1);

    }
}
