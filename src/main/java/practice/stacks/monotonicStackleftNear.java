package practice.stacks;

import java.util.Arrays;
import java.util.Stack;

public class monotonicStackleftNear {
    public static void main(String[] args) {
        int [] arr= {4,6,10,11,7,8,3,5,2,4,9,1,12};
        int N= arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans= new int[N];
        Arrays.fill(ans,-1);
        for (int i = 0; i <N ; i++) {
            while(st.size()>0 && arr[st.peek()]>=arr[i]){//to print indexes
                st.pop();
            }
            if(st.size()>0){
                ans[i]=st.peek();
            }
            st.push(i);
            /*to print elements
            while(st.size()>0 && st.peek()>=arr[i]) {
                st.pop();
            }
           if(st.size()>0){
               ans[i]=st.peek();
           }
           st.push(arr[i]);
             */
        }
        System.out.print(Arrays.toString(ans));
    }
}
