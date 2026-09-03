package practice;

import java.security.cert.TrustAnchor;

public class Arrays {
    public static void main(String[] args){
//        int[] A= {60, 80, 70, 90,75};
//        int totalDistance=0;
//        int avgSpeed=0;
//        for (int i=0; i<=4; i++) {
//            totalDistance = totalDistance + A[i];
//        }
//            avgSpeed=totalDistance/A.length;
//            System.out.println("total distance travelled is "+ totalDistance);
//            System.out.println("avg speed is " + avgSpeed);

//        int [] speed = {40,60,80,100};
//        int [] fuel = {3,4,6,9};
//        int bestSpeed=0;
//        double bestmileage=0;
//        for (int i=0; i<speed.length; i++){
//              double mileage= (double) speed[i]/fuel[i];
//            if (mileage > bestmileage) {
//                bestmileage=mileage;
//                bestSpeed=speed[i];
//            }
//        }
//        System.out.println(bestSpeed + " km/h");

//        int N=6;
//        int[] A = {1, 5, 10, 15, 20,25};
//                for (int i=A.length-1; i>=0; i--){
//                    System.out.print(A[i] + ", ");
//                }
//        ---------------------

        int[] A= {1,4,5,6,7,8,8,2,3,4};
        boolean Found= false;
        for (int i=0; i<A.length-1; i++) {
            if (A[i] == A[i + 1]) {
                Found = true;
                break;
            }
        }
            if (Found==true) {
                System.out.println("yes,true there are consecutive numbers in array");
            }
            else {
                System.out.println("there are no consecutive numbers in array");
            }
    }
}

