import java.util.Arrays;

public class BubbleSortGeneric_cd12<T extends Comparable<? super T>> {
    T[] array;

    BubbleSortGeneric_cd12(T[] array) {
        this.array = array;
    }

    public T[] bubbleSort() { // Changed from private to public
        for (int i = array.length; i > 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swapElements(j, array);
                }
            }
        }
        return array;
    }

    private void swapElements(int index, T[] arr) {
        T temp = arr[index];
        arr[index] = arr[index + 1];
        arr[index + 1] = temp;
    }

    public static void main(String[] args) {
        Integer[] intArr = { 61, 39, 24, 55, 18, 8, 44, 10, -7, -3 };
        BubbleSortGeneric_cd12<Integer> bsg1 = new BubbleSortGeneric_cd12<>(intArr);
        Integer[] sal = bsg1.bubbleSort();
        System.out.println("Sorted array:" + Arrays.toString(sal));

        String[] strArr = { "hello", "good", "spell", "write", "sort" };
        BubbleSortGeneric_cd12<String> bsg2 = new BubbleSortGeneric_cd12<>(strArr);
        String[] sa2 = bsg2.bubbleSort();
        System.out.println("Sorted array:" + Arrays.toString(sa2));
    }
}