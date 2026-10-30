package arrayspractice;

public class odd_even {
    public static void main(String[] args) {
        int[] arr = {3, 9, 2, 7, 5, 8,10,65,44};
        int evenCount=0;
        int oddCount=0;
        String evens= "";
        String odds= "";
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                evenCount++;
                evens= evens + arr[i]+ " ";
            }
            else{
                oddCount++;
                odds= odds + arr[i]+ " ";

            }
        }
        System.out.println("even numbers count in given array is " + evenCount +"----> " + evens);
        System.out.println("odd numbers count in given array is " + oddCount + "----->" + odds );
    }
}
