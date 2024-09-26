public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr);
        System.out.println();
        String answer = areTwoZerosInLine(arr)? "ћассив содержит два подр€д идущих нул€" : "ћассив не содержит два подр€д идущих нул€";
        System.out.println(answer);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.print("]");
    }

    public static boolean areTwoZerosInLine(int[] arr) {
        if ((arr == null) || (arr.length == 0)) {
            return false;
        }
        boolean isFirstZeroFound = false;
        for (int number : arr) {
            if (number == 0) {
                if (isFirstZeroFound) {
                    return true;
                }
                else {
                    isFirstZeroFound = true;
                }
            }
            else {
                isFirstZeroFound = false;
            }
        }
        return false;
    }
}