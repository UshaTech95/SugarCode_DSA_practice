package mocktest;

public class Q1 {
    static void main(String[] args) {
        int[] score = {72, -1, 45, 90, 63, -1, 81};
        int[] score1 = {-1,-1,-1};
        int answer= getScoreRange(score);
        System.out.println(answer);
    }
    static int getScoreRange (int[] marks) {
            int max = 0;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < marks.length; i++) {
                if (marks[i] > max) {
                    max = marks[i];
                }
                if (marks[i] >= 0 && marks[i] < min) {
                    min = marks[i];
                }
            }
            if(max==0 && min==Integer.MAX_VALUE) {
                return -1;
            }else{
                return max-min;
            }
        }
    }
