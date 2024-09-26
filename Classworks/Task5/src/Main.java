import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int min = 0;
        int max = 1000;
        int[] arr = initAray(min, max, 20);
        System.out.println("ћассив до сортировки:");
        printArray(arr);
        arr = sortCount(arr, countNumbers(arr, min, max), min);
        System.out.println("\nћассив после сортировки:");
        printArray(arr);
    }

    /**
     * »нициализаци€ массива случайными числами
     * @param min минимальное значение
     * @param max максимальное значение
     * @param arrayLength длина массива
     * @return возвращаемый массив
     */
    public static int[] initAray(int min, int max, int arrayLength) {
        int[] arr = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = random.nextInt(max - min) + min;
        }
        return arr;
    }

    /**
     * ѕодсчЄт количества всех чисел
     *
     * @param arr принимаемый массив
     * @return возвращаемый массив
     */
    public static int[] countNumbers(int[] arr, int min, int max) {
        int[] counts = new int[max - min];
//        for (int i = 0; i < 11; i++) {
//            counts[i] = 0;
//        }
        for (int number : arr) {
            ++counts[number - min];
        }
        return counts;
    }

    /**
     * —ортировка массива
     *
     * @param arr сортируемый массив
     * @param sortArray массив подсчЄта количества чисел
     * @return возврат отсортированного массива
     */
    public static int[] sortCount(int[] arr, int[] sortArray, int min) {
        int arraySize = arr.length;
        int[] sortedArray = new int[arraySize];
        int index = 0;
        for (int i = 0; i < sortArray.length; ++i) {

            for (int j = 0; j < sortArray[i]; j++) {
                sortedArray[index++] = i + min;
            }
        }
        return sortedArray;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num);
            System.out.print(" ");
        }
        System.out.println();
    }
}