package practicePSmatrix;

public class test {
        // builds the 2D prefix sum
        static int[][] SumOfPrefixMatrices(int[][] A) {
            int N = A.length, M = A[0].length;
            int[][] pf = new int[N][M];

            for (int j = 0; j < M; j++) pf[0][j] = A[0][j];
            for (int i = 1; i < N; i++)
                for (int j = 0; j < M; j++)
                    pf[i][j] = pf[i-1][j] + A[i][j];
            for (int i = 0; i < N; i++)
                for (int j = 1; j < M; j++)
                    pf[i][j] = pf[i][j-1] + pf[i][j];

            return pf;
        }

        // answers ONE query: top-left (a1,b1) to bottom-right (a2,b2). No loops!
        static int submatrixSum(int[][] pf, int a1, int b1, int a2, int b2) {
            int sum = pf[a2][b2];
            if (a1 > 0)            sum -= pf[a1-1][b2];
            if (b1 > 0)            sum -= pf[a2][b1-1];
            if (a1 > 0 && b1 > 0)  sum += pf[a1-1][b1-1];
            return sum;                 // hand the answer back
        }

        static void main(String[] args) {
            int[][] arr = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int[][] resultPf = SumOfPrefixMatrices(arr);   // build prefix ONCE, here in main

            int[][] queries = {
                    {0, 0, 1, 1},   // {topRow, leftCol, bottomRow, rightCol}
                    {1, 1, 2, 2},
                    {0, 0, 2, 2}
            };

            for (int q = 0; q < queries.length; q++) {
                int topRow    = queries[q][0];   // a1
                int leftCol   = queries[q][1];   // b1
                int bottomRow = queries[q][2];   // a2
                int rightCol  = queries[q][3];   // b2

                int answer = submatrixSum(resultPf, topRow, leftCol, bottomRow, rightCol);
                System.out.println(answer);
            }
        }
    }
