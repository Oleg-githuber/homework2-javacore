public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printArray(arr);
        arr = addNumberToArray(arr, 4);
        printArray(arr);
        arr = addNumberToArray(arr, 5, 1);
        printArray(arr);
    }

    public static int[] addNumberToArray(int[] arr, int newNumber) {
        int arrLength = arr.length;
        int[] newArr = new int[arrLength + 1];
        for (int i = 0; i < arrLength; ++i) {
            newArr[i] = arr[i];
        }
        newArr[arrLength] = newNumber;
        return newArr;
    }

    public static int[] addNumberToArray(int[] arr, int newNumber, int index) {
        int arrLength = arr.length;
        if (index > arrLength) return addNumberToArray(arr, arrLength, newNumber);
        int[] newArr = new int[arrLength + 1];
        for (int i = 0; i < index; ++i) {
            newArr[i] = arr[i];
        }
        newArr[index] = newNumber;
        for (int i = index + 1; i <= arrLength; ++i) {
            newArr[i] = arr[i - 1];
        }
        return newArr;
    }

    public static void printArray(int[] arr) {
        for (int num: arr) {
            System.out.print(num);
            System.out.print(" ");
        }
        System.out.println();
    }
}