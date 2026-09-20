package practice;

import java.sql.SQLOutput;

public class strings {
      public static void main (String[] args) {
//        String A = "madam";
//        String R= "";
//
//        for (int i =A.length()-1; i>=0; i-- ) {
//            R = R + A.charAt(i);
//        }
//        if (A.equals(R)){
//            System.out.println("the string is palindrome");
//        }
//        else {
//            System.out.println("the string is not palindrome");
//        }
//
//    }

//          String A = "banana";
//          char B = 'a';
//          for (int i = 0; i < A.length(); i++) {
//              if (A.charAt(i) == B) {
//                  System.out.print("@");
//              }
//              else {
//                  System.out.print(A.charAt(i));
//              }
//          }
          String A= "a12b3c45";
          int Sum= 0;
          int current= 0;

          for (int i=0; i<A.length(); i++){
              char C= A.charAt(i);
              if(Character.isDigit(C)) {
                  current = current * 10 + (C - '0');
              }else {
                  Sum = Sum+current;
                  current=0;
              }
          }
          Sum=Sum+current;
          System.out.println(Sum);
      }
       }