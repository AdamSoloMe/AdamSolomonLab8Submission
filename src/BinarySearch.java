public class BinarySearch {

    //anytime you intialize/decalre a one dimiesimonal; array without giving it a size the space complexirty is considered as n
    //if a size is given to the array then the space complexity is constant so O(1)
    //anytime you decalre a varaibale it is consider as 1
    //when an
    public static int runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) {
        //n+1+1+1 = F(n)=n+3

        int index = Integer.MAX_VALUE;//since this is the only variable which is being  declared
        //and it not

        //example of N^2 Space complexity
        // int multi-array[][] this is a multi diemionsial array therefore it's space complexity is n^2
        ////this example below is also n^2 because it is allocating a new array for each iteration of the loop n times
        /*for(int i=0;i<n;i++){
        int newarr[]=new int [n];

        }
        */

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static void main(String args[]) {
        int arr1[] = new int[20];
        for (int i = 0; i <= 19; i++) {
            arr1[i] = i;
        }
        int x = 15;
        System.out.println(runBinarySearchIteratively(arr1, x, 0, 22));
    }
}

        //ToDo 2: Call the above method and test the algorithm
        // provide time and space analysis

        //the Time compelxity of this algorthim is O(Log n)
        //since we are only decarling/allocating two variables in memory
        //the space complexity of this algoerthim is O(1)

