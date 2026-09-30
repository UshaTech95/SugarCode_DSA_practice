package practice.recurssionassignment1;

public class reverseString {

    public static String Reverse(String S){

        if(S.isEmpty()){
            return S;
        }
        String reverseStr= Reverse(S.substring(1))+S.charAt(0);
        return reverseStr;
    }
    public static void main(String[] args){
        System.out.println(Reverse("hello"));
        System.out.println(Reverse("abc"));
    }
}
