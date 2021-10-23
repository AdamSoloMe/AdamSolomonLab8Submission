public class LinearSearch {

    public static int search(int arr[], int x)
    {
        int n = arr.length;//1


    for(int i=0;i<n;i++){//n
        if( arr[i]==x){//1

            return i;

        }
    }
        return -1;//n

    //f(n)=n+3
    //the Big O notation of this algorthim is O(N)
    //The Big Omega notation of this algorthim is Omega(n)
    //The Big Theta notation of this algorthim is Theta(n)

    // Todo 01: - complete the implementation of linear search and test your code
    //         - prvoide asymptotic analysis of the developed solution
}
    public static void main(String args []){
        int arr1[]={10,20,30,40,50,70};
        int x=50;
        System.out.println("the position of the value which you are trying to search for within the array is at");
        System.out.println(search(arr1,x));


    }

}
