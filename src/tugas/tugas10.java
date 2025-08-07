package tugas;

import java.util.Arrays;
import java.util.Scanner;

public class tugas10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Masukkan jumlah data yang ingin dimasukkan: ");
        int jumlahData = scanner.nextInt();
        int[] data = new int[jumlahData];


        System.out.println("Masukkan nilai data:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            data[i] = scanner.nextInt();
        }

        System.out.println("\nPilih metode pengurutan:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.println("3. Merge Sort");
        System.out.print("Pilihan Anda: ");
        int metode = scanner.nextInt();


        System.out.println("\nPilih jenis pengurutan:");
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        System.out.print("Pilihan Anda: ");
        int jenisPengurutan = scanner.nextInt();


        if (metode == 1) {
            if (jenisPengurutan == 1) {
                bubbleSortAscending(data);
            } else {
                bubbleSortDescending(data);
            }
        } else if (metode == 2) {
            if (jenisPengurutan == 1) {
                quickSortAscending(data, 0, data.length - 1);
            } else {
                quickSortDescending(data, 0, data.length - 1);
            }
        } else if (metode == 3) {
            if (jenisPengurutan == 1) {
                mergeSortAscending(data, 0, data.length - 1);
            } else {
                mergeSortDescending(data, 0, data.length - 1);
            }
        }


        System.out.println("\nHasil pengurutan:");
        System.out.println(Arrays.toString(data));


        System.out.println("\nAntrean data secara urut:");
            for (int i = 0; i < data.length; i++) {
                System.out.println("Data ke-" + (i + 1) + ": " + data[i]);
        }


        scanner.close();
    }


    public static void bubbleSortAscending(int[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {

                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    
    public static void bubbleSortDescending(int[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] < data[j + 1]) {
    
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    
    public static void quickSortAscending(int[] data, int low, int high) {
        if (low < high) {
            int pivot = partitionAscending(data, low, high);
            quickSortAscending(data, low, pivot - 1);
            quickSortAscending(data, pivot + 1, high);
        }
    }

    public static int partitionAscending(int[] data, int low, int high) {
        int pivot = data[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (data[j] < pivot) {
                i++;
        
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        i++;
        int temp = data[i];
        data[i] = data[high];
        data[high] = temp;

        return i;
    }
    
    public static void quickSortDescending(int[] data, int low, int high) {
        if (low < high) {
            int pi = partitionDescending(data, low, high);
            quickSortDescending(data, low, pi - 1);
            quickSortDescending(data, pi + 1, high);
        }
    }

    public static int partitionDescending(int[] data, int low, int high) {
        int pivot = data[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (data[j] > pivot) {
                i++;
                
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        
        int temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;

        return i + 1;
    }
    
    public static void mergeSortAscending(int[] data, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSortAscending(data, left, mid);
            mergeSortAscending(data, mid + 1, right);
            mergeAscending(data, left, mid, right);
        }
    }

    public static void mergeAscending(int[] data, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = data[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = data[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                data[k] = L[i];
                i++;
            } else {
                data[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            data[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            data[k] = R[j];
            j++;
            k++;
        }
    }

    
    public static void mergeSortDescending(int[] data, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSortDescending(data, left, mid);
            mergeSortDescending(data, mid + 1, right);
            mergeDescending(data, left, mid, right);
        }
    }

    public static void mergeDescending(int[] data, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = data[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = data[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] >= R[j]) {
                data[k] = L[i];
                i++;
            } else {
                data[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            data[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            data[k] = R[j];
            j++;
            k++;
        }
    }
}
