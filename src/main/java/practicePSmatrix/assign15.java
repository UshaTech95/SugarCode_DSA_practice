package practicePSmatrix;

import java.lang.classfile.attribute.SourceDebugExtensionAttribute;

public class assign15 {

    static void matrix (int[][] A){
        int N= A.length;
        int M= A[0].length;
        int SubMatrixCount= 0;
      for (int a1=0; a1<N; a1++){
          for (int b1=0; b1<M; b1++){

              for (int a2=a1; a2<N; a2++){
                  for (int b2=b1; b2<M; b2++){

                      for (int i=a1; i<=a2; i++){
                          for (int j=b1; j<=b2; j++){
                              System.out.print(A[i][j] + " ");
                          }
                          System.out.println();
                      }
                      System.out.println("-");
                  }
                  SubMatrixCount++;
              }
          }
      }
        System.out.println("no of submatrices is " +  SubMatrixCount);
    }

    static void main(String[] args) {
        int[][] arr = {
                {1, 2},
                {3, 4}
        };
        matrix(arr);
    }
}
