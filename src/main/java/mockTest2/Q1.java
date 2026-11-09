package mockTest2;

public class Q1 {
    public static void main(String[] args) {
        int[] h= {1,2,3,4,5};
        int T = 2;
        for (int i=1; i<h.length; i++){
            if(h[i-1]>T){
                System.out.println(i + "is stable");
            }
        }
    }
}
