package practicePSmatrix;

import java.sql.SQLOutput;

public class assign15Q2 {
    static int[][] SumOfPrefixMatrices(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        int[][] pf = new int[N][M];
        for (int i = 0; i < M; i++) {
            pf[0][i] = A[0][i];
        }
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < M; j++) {
                pf[i][j] = pf[i - 1][j] + A[i][j];
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 1; j < M; j++) {
                pf[i][j] = pf[i][j - 1] + pf[i][j];
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(pf[i][j] + ",");
            }
            System.out.println(" ");
        }
        return pf;
    }
        static void main(String[] args){
            int[][] arr = {
                    {1, 2},
                    {3, 4},
            };
            int[][] resultPf= SumOfPrefixMatrices(arr);
            int N= resultPf.length;
            int M= resultPf[0].length;
            int total=0;
            int sum=0;
            for (int a1=0; a1<N; a1++){
                for (int b1=0; b1<M; b1++){
                    for (int a2=a1; a2<N; a2++){
                        for (int b2=b1; b2<M; b2++){

                            if(a1==0 && b1==0){
                                sum=resultPf[a2][b2];
                            }
                            else if(a1==0){
                                sum=resultPf[a2][b2] - resultPf[a2][b1-1];
                            }
                            else if(b1==0){
                                sum=resultPf[a2][b2]-resultPf[a1-1][b2];
                            }
                            else{
                                sum=resultPf[a2][b2]-resultPf[a2][b1-1]-resultPf[a1-1][b2]+resultPf[a1-1][b1-1];
                            }
                            total= total+sum;
                        }
                    }
                }
            }
            System.out.println("Sum of all submatrices = " + total);
    }

}
