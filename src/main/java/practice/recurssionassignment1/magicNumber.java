package practice.recurssionassignment1;

public class magicNumber {
    public static int sumOfdigits(int N){
        if( N==0){
            return N;
        }
        return N%10 + sumOfdigits(N/10);
    }
    public static int magic(int N){
        if(N<10) {
            if (N==1)
            return 1;
        else{
                return 0;
            }
        }
        return magic(sumOfdigits(N));
    }

    public static void main(String[] args){
        System.out.println(magic(83557));
        System.out.println(magic(12345));
    }
}
