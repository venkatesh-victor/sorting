public class BubbleSort {
    
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int swapCounter = 0;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;

                    swapped = true;
                    ++swapCounter;
                }
            }
        } while (swapped);

        System.out.println("The sorted array :- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n It took " + swapCounter + " swaps to sort this array.");
    }
}
