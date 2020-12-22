import java.util.*;

public class HRStrings {

    public static void main(String[] args) {

        char c=99;
        System.out.println(c);
    }


    static String superReducedString(String s) {

        StringBuilder sb=new StringBuilder(s);
        int flag=1;
        while(flag==1){
            flag=0;
            for(int i=0;i<sb.length();i++)
                if (i+1<=sb.length()-1 && sb.charAt(i) == sb.charAt(i + 1)){
                    sb.delete(i,i+2);
                    flag=1;
                }
        }

        return sb.toString().equals("") ? "Empty String":sb.toString();
    }


    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong

        int d=1,u=1,l=1,s=1,add=0;

        for(int i=0;i<password.length();i++){

            int j=password.charAt(i);
            if(j>=48 && j<=57)d=0;
            else if(j>=65 && j<=90)u=0;
            else if(j>=97 && j<=122)l=0;
            else s=0;

        }
        System.out.println("d "+d+" s "+s+" u "+u+" l "+l);

        add=d+s+u+l;
        if((password.length()+add)<6)add+=6-(password.length()+add);

        return add;
    }

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){

            j=s.charAt(i);
            //System.out.println(j);

            if(j>=65 && j<=90)
                j=((j-65+k)%26)+65;

            else if(j>=97 && j<=122)
                j=((j-97+k)%26)+97;

            sb.append((char)j);

        }
        return sb.toString();

    }

    // Complete the pangrams function below.
    static String pangrams(String s) {
        s=s.toLowerCase();


        for(char i=97;i<122;i++)
        if(!s.contains(Character.toString(i)))return "not pangram";

        return "pangram";

        }


    // Complete the weightedUniformStrings function below.
//    static String[] weightedUniformStrings(String s, int[] queries) {
//
//        HashMap<Character,Integer> hm=new HashMap<>();
//
//        StringBuilder st=new StringBuilder();
//        List<Character> l=new ArrayList<>();
//
//        l.equals()
//
//        Collections.frequency(l,'s');
//
//
//        //Collections.sort(s);
//
//
//
//        for(int i:queries){
//
//
//        }
//
//    }

    static String funnyString(String s) {
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<s.length();i++)
            l1.add((int)s.charAt(i));

        List<Integer> l2=new ArrayList<>(l1);
        Collections.reverse(l2);
        StringBuilder r=new StringBuilder(s);
        r.reverse();
        String str=l1.equals(l2)?  "Funny" :  "Not Funny";

        return str;

    }


    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {

        List<Character> cl=new ArrayList<>();

        StringBuilder sb=new StringBuilder(s);

        int count=0,flag=1;
        while(flag==1){
            //System.out.println("while ");
            flag=0;  //Take care flag=0 should be outside the for loop
            for(int i=0;i<sb.length();i++){
                // System.out.println("for "+sb);
                if(i+1<sb.length() && sb.charAt(i)==sb.charAt(i+1)){
                    sb.deleteCharAt(i);
                    count++;flag=1;
                }
            }
        }
        // System.out.println(sb);
        return count;
    }




}


