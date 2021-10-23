public class Problem1 {
    public static long getSumOfPrimes(int n){
        int sum=0;
        int number;
        int isPrime;
        for(int i = 1; i <=n; i++)//O(N*Sqaure root of n)
        {

            isPrime=1;

            for (int j = 2; j <= i/2; j++){///O(sqrt n)
                if(i % j == 0)
                {
                    isPrime=0;
                    break;
                }

            }

            if(isPrime==1)
            {
                System.out.println(i);
                sum +=i;
            }

        }
        return sum;
    }
    public static void main(String args[]){
        System.out.println(getSumOfPrimes(20));

    }
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time
    //The Time Complexity is O(n*Square root of n)
    //space complexity involves allocating memory
    // The space compexlity of this algorthim is O(1)
}
