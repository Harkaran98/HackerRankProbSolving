import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Greedy {



//https://stackoverflow.com/questions/15452429/java-arrays-sort-2d-array - Reference for comparing 2d arrays
    static int luckBalance(int k, int[][] contests) {

        //Sort according to the luck
        Arrays.sort(contests, (a, b) -> Double.compare(a[0], b[0]));
        //System.out.println("After sorting");

//
//        for(int[] ar:contests){
//            System.out.println(ar[0]+" "+ar[1]);
//
//        }

        //Checking number of important events
        int imp=0;
        for(int i=0;i<contests.length;i++){

            if(contests[i][1]==1)imp++;
        }


        int mustwin=imp-k;
        System.out.println("Imp- "+imp + " Must win- "+mustwin);
        int count=0;
        int luck=0;

        //Calculating luck
        for(int i=0;i<contests.length;i++){

            if(contests[i][1]==1 && count<mustwin){luck-=contests[i][0];count++;}
            else if(contests[i][1]==0 || count>=mustwin)luck+=contests[i][0];

        }
        return luck;


    }


    // Complete the getMinimumCost function below
    //GreedyFlorist
    static int getMinimumCost(int k, int[] c) {
        Arrays.sort(c);
        int i=c.length-1;
        int sum=0;
        int prev_bought=0;
        while(i>=0){

            for(int j=0;j<k && i>=0;j++){

                sum+=(1+prev_bought)*c[i];
                i--;

            }
            prev_bought++;


        }

        return sum;

    }

    //MAX_MIN
    // Complete the maxMin function below.
    static int maxMin(int k, int[] arr) {
        Arrays.sort(arr);
        int min_diff=Integer.MAX_VALUE;
        for(int i=0;i<=arr.length-k;i++){
            if(min_diff>(arr[i+k-1]-arr[i]))min_diff=arr[i+k-1]-arr[i];

        }

        return min_diff;

    }




}



