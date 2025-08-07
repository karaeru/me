package tugas;

public class BubbleSort {
    

    public static void main(String[] args) {
        int[] data = {5, 1, 4, 2, 8};

        System.out.println("Array sebelum diurutkan:");
        for (int num : data) {
            System.out.print(num + " ");
        }

        bubbleSort(data);

        System.out.println("\n\nArray setelah diurutkan:");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
    
    public static void bubbleSort(int[] array) {
        int n = array.length;

        // Loop melalui semua elemen array
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
