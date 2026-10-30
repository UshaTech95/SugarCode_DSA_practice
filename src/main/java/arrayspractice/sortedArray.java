package arrayspractice;

public class sortedArray {
    public static void main(String[] args) {
        int [] arr= {2,3,4,1,6,7,8,9};
        boolean sorted= true;
        for(int i=1; i< arr.length; i++){
           if(arr[i-1]>arr[i]) {
               sorted = false;
               break;
           }
        }
        if(sorted==true){
            System.out.println("array is sorted");
        } else{
            System.out.println("array is not sorted");}
    }
};
