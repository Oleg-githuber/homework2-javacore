import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int min = 0;
        int max = 1000;
        int[] arr = initAray(min, max, 20);
        System.out.println("������ �� ����������:");
        printArray(arr);
        arr = sortCount(arr, countNumbers(arr, min, max), min);
        System.out.println("\n������ ����� ����������:");
        printArray(arr);
    }

    /**
     * ������������� ������� ���������� �������
     * @param min ����������� ��������
     * @param max ������������ ��������
     * @param arrayLength ����� �������
     * @return ������������ ������
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
     * ������� ���������� ���� �����
     *
     * @param arr ����������� ������
     * @return ������������ ������
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
     * ���������� �������
     *
     * @param arr ����������� ������
     * @param sortArray ������ �������� ���������� �����
     * @return ������� ���������������� �������
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