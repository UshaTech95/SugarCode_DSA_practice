package practice;

public class loops {
    public static void main(String[] args) {

//        print1-5 numbers
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
//    }
//        even or odd
//        int N = 16;
//        if (N % 2 == 0) {
//            System.out.println(N + " is even number");
//        }
//        else {
//            System.out.println(N + " is odd number");
//        }
////        left screw pyramids
//            for(int i=1; i<=5; i++){
//           for(int j=1; j<=i; j++){
//                     System.out.print("*");
//                  }
//                   System.out.println();
//               }
//        for(int i=1; i<=5; i++){
//            for(int j=i; j<=5; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        -----------------------
//        Pyramid Pattern
//        int N = 7;
//        for (int i = 1; i <= N; i++) {
//                for (int j = 1; j <= N-i; j++) {
//                    System.out.print(" ");
//                }
//                for (int j = 1; j <= 2 * i-1 ; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//    }
//        --------------------
//        numerical values with spaces
//        int N=5 ;
//        for (int i=1; i<=N; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print(i+ " ");
//            }
//            System.out.println();
//        }
//        ------------------------
        int N=5;
        for (int i = 1; i<=N; i++) {
            for (int j=0; j<=N-i; j++) {
                System.out.print(" ");
            }
                for (int j=1; j<= 2*i-1; j++) {
                System.out.print("*");
            }
                System.out.println();
        }
        for (int i=1; i<=N+1; i++){
            System.out.print("*");
            for (int j=1; j<=2*N-1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i=1; i<=2*N+1; i++) {
            System.out.print("*");
        }

    }
}
