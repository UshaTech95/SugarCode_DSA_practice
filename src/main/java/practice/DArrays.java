package practice;

import javax.imageio.ImageTranscoder;

public class DArrays {
    public static void main(String[] args) {
//        int [] [] A= {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        int N= A.length;
//        int M= A[0].length;
//
//        for (int i=0; i<A.length; i++){
//            for (int j=0; j<A[0].length; j++) {
//                System.out.print(A[i][j] + " ");
//            }
//            System.out.println();
//        }


//        int [][] A= {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11,12}
//        };
//        int N= A.length;
//        int M= A[0].length;
//
//        for (int i=0; i<N; i++){
//            for (int j=0; j<M; j++){
//                if ( A[i][j]%2==0){
//                    System.out.print( A[i][j] + " ");
//                }
//            }
//            System.out.println();
//        }
//        int [][] A= {
//                {1,2,3,4},
//                {5,6,7,8},
//                {4,3,2,1},
//        };
//        int N= A.length;
//        int M = A[0].length;
//         for (int j=0; j<M; j++){
//             for (int i=0; i<N; i++){
//                 System.out.print( A[i][j] + " ");
//             }
//             System.out.println();
//         }
        int [][] A= {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        for (int i=0; i<A.length; i++){
            if(i % 2 == 0){
                for (int j=0; j<A.length; j++){
                    System.out.print( A[i][j] + " ");
                }
            }
            else {
                for (int j=A.length-1; j>=0; j--){
                    System.out.print(A[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
