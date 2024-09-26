public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr);
        System.out.print(" -> ");
        System.out.println(countEvens(arr));
    }

    public static int countEvens(int[] arr) {
        int count = 0;
        for (int number : arr) {
            if ((number % 2) == 0) ++count;
        }
        return count;
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