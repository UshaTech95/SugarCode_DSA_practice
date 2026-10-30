package arrayspractice;

public class max_min {
    public static void main(String[] args) {
        int[] arr= {3,9,2,7,5};
        int max= arr[0];
        int min = arr[0];

        for(int i=1; i<arr.length; i++){
            if (max < arr[i]) {
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("max number in given array is " +  max);
        System.out.println("min number in given array is " +  min);
    }
}
