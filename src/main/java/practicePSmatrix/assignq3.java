package practicePSmatrix;

import java.sql.SQLOutput;

public class assignq3 {

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

    static void main(String[] args) {
        int[][] arr = {
                {1, 2,5,6},
                {3, 4,7,8},
                {9,10,11,12},
        };
        int[][] resultPf = SumOfPrefixMatrices(arr);
        int[][] queries = {
                {0, 0, 1, 1},
                {1, 1, 2, 2},
                {0, 0, 2, 2}
        };
        for (int q = 0; q < queries.length; q++) {
            int a1 = queries[q][0];
            int b1 = queries[q][1];
            int a2 = queries[q][2];
            int b2 = queries[q][3];

            int N = resultPf.length;
            int M = resultPf[0].length;
            int sum = 0;
            if (a1 == 0 && b1 == 0) {
                sum = resultPf[a2][b2];
            } else if (a1 == 0) {
                sum = resultPf[a2][b2] - resultPf[a2][b1 - 1];
            } else if (b1 == 0) {
                sum = resultPf[a2][b2] - resultPf[a1 - 1][b2];
            } else {
                sum = resultPf[a2][b2] - resultPf[a2][b1 - 1] - resultPf[a1 - 1][b2] + resultPf[a1 - 1][b1 - 1];
            }
            System.out.println("sum of requested submatrix is " + sum);
        }

    }
}

