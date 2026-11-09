package arrayspractice;

public class count_pairs {
    public static void main(String[] args) {
        char [] arr= {'a', 'd', 'g', 'a', 'g', 'a', 'g'};
        int pairCount=0;
        int gcount=0;
        for (int i=arr.length-1; i>=0; i--){
            if(arr[i]== 'g'){
                gcount++;
            }
            else if(arr[i]=='a'){
                pairCount= pairCount+gcount;
            }
        }
        System.out.println("total number of asked pairs is " + pairCount);
    }
}
