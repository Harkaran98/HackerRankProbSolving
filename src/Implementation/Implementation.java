package Implementation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Implementation {

    public static void main(String[] args){




    }


    public static int InbetweenSets(List<Integer> a, List<Integer> b) {

        List<Integer> l=new ArrayList<>();

        Object[] ar=l.toArray();
        for(Object i:ar){}
        int x=ar.length;
        int minb=Integer.MAX_VALUE;
        int maxa=Integer.MIN_VALUE;
        for(int i:a)if(i>maxa)maxa=i;
        for(int i:b)if(i<minb)minb=i;
        //System.out.println("min "+min+" max "+max);

        int count=0,flag=0;
        for(int i=maxa;i<=minb;i++){
            flag=1;
            for(int j:a){
                if((i%j)!=0){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                for(int j:b){
                    if((j%i)!=0){
                        flag=0;
                        break;

                    }

                }

            }

            if(flag==1)count++;

        }
        return(count);



    }

    static int[] breakingRecords(int[] scores) {
        int count1=0,count2=0,max=scores[0],min=scores[0];
        for(int i:scores){
            if(max<i){
                count1++;
                max=i;
            }
            if(min>i){
                count2++;
                min=i;
            }


        }
        int[] arr={count1,count2};
        return (arr);

    }

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int pairs=0,count=0;
        HashSet<Integer> h=new HashSet<>();
        for(int i:ar){
            h.add(i);
        }

        for(int i:h){
            count=0;
            for (int j:ar){
                if(i==j)count++;
            }

            if(count/2>0)pairs+=(count/2);
        }

        return pairs;

    }

    public static int pickingNumbers(List<Integer> a) {
        HashSet<Integer> hs = new HashSet<>(a);
        List<Integer> l=null;
        int maxsize=0;
        for(int i:hs){
            l=new ArrayList<>();
            for(int j:a){
                if((i-j)<=1 && i-j>=0){
                    l.add(j);
                }
            }
            if(maxsize<l.size())maxsize=l.size();
        }

        return maxsize;
    }

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int count=0;
        for(int x=i;x<=j;x++){
            StringBuilder s=new StringBuilder(String.valueOf(x));
            int rev=(Integer.parseInt(String.valueOf(s.reverse())));
            if((Math.abs(x-rev))%k==0)count++;

        }

        return count;

    }

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] arr=new int[a.length];
        int[] ret=new int[queries.length];
        for(int i=0;i<a.length;i++){

            arr[(i+k)%a.length]=a[i];

        }
        for(int i=0;i<queries.length;i++){


            ret[i]=arr[queries[i]];


        }
        return ret;

    }

    //Trick to convert char into string is- add "" to char
    static int findDigits(int n) {
        int count=0;
        String s=String.valueOf(n);
        for(int i=0;i<s.length();i++) {
            int x = Integer.parseInt("" + s.charAt(i));
            if (x != 0)
                if ((n % x) == 0) count++;

        }
        return count;

    }

    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:arr)hs.add(i);
        int max=Integer.MIN_VALUE;
        int temp=0;
        for(int i:hs){
            temp=0;
            for(int j=0;j<arr.length;j++)
            {
                if(i==arr[j])temp++;
            }
            if(temp>max)max=temp;
        }

        return arr.length-max;

    }

}

