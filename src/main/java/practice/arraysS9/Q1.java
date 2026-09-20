package practice.arraysS9;

public class Q1 {
    static void main(String[] args) {
        int[] A= {2,6,7,8,9};
        int B = 3;
        int n= A.length;
        B = B % n;

        for (int j=0; j<B; j++){
            int last= A[n-1];
            for(int i=n-1; i>0; i--){
                A[i]=A[i-1];
            }
        }
    }

}
