public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, -1};
        System.out.println("Массив:");
        printArray(arr);
        System.out.printf("\nРазница между максимальным и минимальным элементами: %d", calculateDifference(arr));
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.print("]");
    }

    public static Integer calculateDifference(int[] arr) {
        if (arr == null) return null;
        if (arr.length == 0) return null;
        int max = arr[0];
        int min = max;
        int arrLength = arr.length;;
        if (arrLength > 1) {
            for (int i = 1; i < arrLength; ++i) {
                if (arr[i] < min) min = arr[i];
                if (arr[i] > max) max = arr[i];
            }
        }
        return max - min;
    }
}