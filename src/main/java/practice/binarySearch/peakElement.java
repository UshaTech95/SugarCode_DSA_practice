package practice.binarySearch;

public class peakElement {
    public static int peakElementIs(int []arr){
        int low=1;
        int N= arr.length;
        int high=N-2;
        if(arr[0]>arr[1]){return arr[0];}
        if(arr[N-1]>arr[N-2]){return arr[N-1];}
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return arr[mid];
            }
            if(arr[mid]<arr[mid+1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }

    public static void main(String[] args){
        int [] A= {7, 2, 3, 6, 8};
        System.out.println(peakElementIs(A));
    }
}
