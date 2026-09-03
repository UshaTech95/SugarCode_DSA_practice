package practice;

import java.sql.SQLOutput;

public class strings {
    public static void main (String[] args){
        String A = "faf";
        String R= "";

        for (int i =A.length()-1; i>=0; i-- ) {
            R = R + A.charAt(i);
        }
        if (A.equals(R)){
            System.out.println("the string is palindrome");
        }
        else {
            System.out.println("the sring is not palindrome");
        }

    }
}
