package Method;

public class Test01 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33};
        printArr(arr);
    }
    public static void printArr(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i <arr.length; i++) {
            arr1[i] = arr[i];
        }
        System.out.print(arr1[0]);
    }
}
