package practice.recurssionassignment1;

public class reversestring2 {
    public static String reverse(String S){

        if (S.isEmpty()){
            return S;
        }
        String reverseStr= S.charAt(S.length()-1)+ reverse(S.substring(0,S.length()-1));
        return reverseStr;
    }
    public static void main(String[] args){
        System.out.println(reverse("hello"));
        System.out.println(reverse("abc"));
    }
}
