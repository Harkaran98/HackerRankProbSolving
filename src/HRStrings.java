public class HRStrings {




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

}
