package mocktest;

import java.nio.charset.StandardCharsets;

public class Q3 {
    static void main(String[] args) {
        String[][] words = {
            {"cat", "elephant", "dog"},
            {"tiger", "lion", "giraffe"},
            {"ant", "horse", "fox"},
        };
        System.out.println(findLongestWord(words));
//        System.out.println(words[0][0].length());
    }
    static String findLongestWord(String[][] words){
        int maxlength= -1;
        String LongestWord = "";
        for( int i=0; i< words.length; i++){
            for(int j=0; j<words[i].length; j++){
                if (words[i][j].length() > maxlength){
                    maxlength=words[i][j].length();
                    LongestWord= words[i][j];
                }
//                System.out.print(words[i][j].length());

            }

        }
        return " " + LongestWord;
    }
}
