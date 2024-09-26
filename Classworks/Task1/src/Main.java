public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 4, 0};
        System.out.print("Максимальный элемент: ");
        System.out.println(findMax(arr));
        System.out.print("Индекс максимального элемента: ");
        System.out.println(findMaxIndex(arr));
        System.out.print("Минимальный элемент: ");
        System.out.println(findMin(arr));
        System.out.print("Индекс минимального элемента: ");
        System.out.println(findMinIndex(arr));
    }

    public static int findMax(int[] arr) {
        int maxElem = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElem) maxElem = arr[i];
        }
        return maxElem;
    }

    public static int findMin(int[] arr) {
        int minElem = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minElem) minElem = arr[i];
        }
        return minElem;
    }

    public static int findMaxIndex(int[] arr) {
        int maxElem = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElem) {
                maxElem = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int findMinIndex(int[] arr) {
        int minElem = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minElem) {
                minElem = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}