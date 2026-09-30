package practice.recurssionassignment1;

public class sumOfdigits {
    public static int sumOfinteger(int N){
        if (N==0){
            return N;
        }
        int sum= N%10 + sumOfinteger(N/10);
        return sum;
    }
    public static void main(String[] args){
        System.out.println(sumOfinteger(678910569));
        System.out.println(sumOfinteger(123));
        System.out.println(sumOfinteger(909));
    }
}
