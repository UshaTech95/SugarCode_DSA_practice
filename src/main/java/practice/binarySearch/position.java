package practice.binarySearch;

public class position {

    public static int insertPosition(int[] arr, int K) {
        int low = 0;
        int N = arr.length;
        int high = N - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == K) {
                return mid;
            }
            if (arr[mid] < K) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 5, 6};
        System.out.println(insertPosition(A, 3));
        System.out.println(insertPosition(A,2));
        System.out.println(insertPosition(A,8));
    }
}
