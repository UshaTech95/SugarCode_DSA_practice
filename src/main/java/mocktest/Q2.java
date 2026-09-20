package mocktest;

public class Q2 {
    static void main(String[] args) {
        int[][] marks = {
                {10, 20, 30},
                {25, 15, 20},
                {30, 10, 20},
                {15, 25, 35},
    };
        int answer=findChampion(marks);
        System.out.println(answer);
    }
    static int findChampion(int[][] marks) {
       int maxmarks;
        int champion = 0;
        for (int i = 0; i < marks.length; i++) {
            maxmarks = 0;
            for (int j = 0; j < marks[i].length; j++) {
                maxmarks += marks[i][j];
            }
            if(champion<maxmarks){
                champion = i;
            }
        }
//        if (champion > maxmarks) {
//            return champion;
//        }else{
//            return 0;
//        }
        return champion;
    }
}
