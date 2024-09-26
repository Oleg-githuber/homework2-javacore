public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 1};
        printArray(arr);
        System.out.print(" - ");
        System.out.println(checkBalance(arr));
    }

    public static boolean checkBalance(int[] arr) {
        int arrLength = arr.length;
        int left = 0;
        int right = 0;
        int leftIndex = 0;
        int rightIndex = arrLength - 1;
        while (leftIndex <= rightIndex) {
            if (left <= right) {
                left += arr[leftIndex++];
            }
            else {
                right += arr[rightIndex--];
            }
        }
        if (left == right) return true;
        else return false;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.print("]");
    }
}