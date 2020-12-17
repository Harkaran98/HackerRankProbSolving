import java.util.List;

public class DynamicProg {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }


    public static long getWays(int n, List<Long> c) {

        Long[] coins=new Long[c.size()];
        coins=c.toArray(coins);
        long s=getNumberOfWays(n,coins);
        return s;
    }

    static long getNumberOfWays(long N, Long[] Coins)
    {
        // Create the ways array to 1 plus the amount
        // to stop overflow
        long[] ways = new long[(int)N + 1];

        // Set the first way to 1 because its 0 and
        // there is 1 way to make 0 with 0 coins
        ways[0] = 1;

        // Go through all of the coins
        for (int i = 0; i < Coins.length; i++) {

            // Make a comparison to each index value
            // of ways with the coin value.
            for (int j = 0; j < ways.length; j++) {
                if (Coins[i] <= j) {

                    // Update the ways array
                    ways[j] += ways[(int)(j - Coins[i])];
                }
            }
        }

        // return the value at the Nth position
        // of the ways array.
        return ways[(int)N];
    }



    static int fib(int n){  //0 , 1, 1, 2, 3, 5, ....
        int num=0;          //if sequence starts with n=1 as 0
        if(n==1)return 0;
        int a=0,b=1;
        for(int i=1;i<n;i++){
            num=a+b;
            a=b;
            b=num;
        }


        return a;
    }



}
