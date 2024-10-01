import java.util.Arrays;

public class Ex9 {

    public static <T extends Comparable<? super T>> void selectionSort(T[] A) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j].compareTo(A[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(A, i, minIndex);
        }
    }

    public static <T extends Comparable<? super T>> void insertionSort(T[] A) {
        int n = A.length;
        for (int i = 1; i < n; i++) {
            T key = A[i];
            int j = i - 1;
            while (j >= 0 && A[j].compareTo(key) > 0) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
    }

    public static <T extends Comparable<? super T>> void bubbleSort(T[] A) {
        int n = A.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (A[j].compareTo(A[j + 1]) > 0) {
                    swap(A, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static <T extends Comparable<? super T>> void heapSort(T[] A) {
        int n = A.length;

        // Build heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(A, n, i);
        }

        // Extract elements one by one from the heap
        for (int i = n - 1; i >= 0; i--) {
            swap(A, 0, i);
            heapify(A, i, 0);
        }
    }

    private static <T extends Comparable<? super T>> void heapify(T[] A, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && A[left].compareTo(A[largest]) > 0) {
            largest = left;
        }

        if (right < n && A[right].compareTo(A[largest]) > 0) {
            largest = right;
        }

        if (largest != i) {
            swap(A, i, largest);
            heapify(A, n, largest);
        }
    }

    public static <T extends Comparable<? super T>> void mergeSort(T[] A) {
        int n = A.length;
        if (n > 1) {
            int mid = n / 2;
            T[] left = Arrays.copyOfRange(A, 0, mid);
            T[] right = Arrays.copyOfRange(A, mid, n);

            mergeSort(left);
            mergeSort(right);

            merge(A, left, right);
        }
    }

    private static <T extends Comparable<? super T>> void merge(T[] A, T[] left, T[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                A[k++] = left[i++];
            } else {
                A[k++] = right[j++];
            }
        }

        while (i < left.length) {
            A[k++] = left[i++];
        }

        while (j < right.length) {
            A[k++] = right[j++];
        }
    }

    public static <T extends Comparable<? super T>> void quickSort(T[] A) {
        quickSort(A, 0, A.length - 1);
    }

    private static <T extends Comparable<? super T>> void quickSort(T[] A, int low, int high) {
        if (low < high) {
            int pi = partition(A, low, high);
            quickSort(A, low, pi - 1);
            quickSort(A, pi + 1, high);
        }
    }

    private static <T extends Comparable<? super T>> int partition(T[] A, int low, int high) {
        T pivot = A[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (A[j].compareTo(pivot) <= 0) {
                i++;
                swap(A, i, j);
            }
        }
        swap(A, i + 1, high);
        return i + 1;
    }

    private static <T extends Comparable<? super T>> void swap(T[] A, int i, int j) {
        T temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        // Test the sorting algorithms

        // Create an array of objects that implement Comparable
        String[] arr = {"banana", "apple", "orange", "grape", "kiwi"};

        // Test each sorting algorithm
        selectionSortTest(arr.clone());
        insertionSortTest(arr.clone());
        bubbleSortTest(arr.clone());
        heapSortTest(arr.clone());
        mergeSortTest(arr.clone());
        quickSortTest(arr.clone());
        ArraysSortTest(arr.clone());
    }

    private static <T extends Comparable<? super T>> void printArray(T[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    private static <T extends Comparable<? super T>> void selectionSortTest(T[] arr) {
        System.out.println("Selection Sort:");
        printArray(arr);
        selectionSort(arr);
        printArray(arr);
        System.out.println();
    }

    private static <T extends Comparable<? super T>> void insertionSortTest(T[] arr) {
        System.out.println("Insertion Sort:");
        printArray(arr);
        insertionSort(arr);
        printArray(arr);
        System.out.println();
    }

    private static <T extends Comparable<? super T>> void bubbleSortTest(T[] arr) {
        System.out.println("Bubble Sort:");
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
        System.out.println();
    }

    private static <T extends Comparable<? super T>> void heapSortTest(T[] arr) {
        System.out.println("Heap Sort:");
        printArray(arr);
        heapSort(arr);
        printArray(arr);
        System.out.println();
    }

    private static <T extends Comparable<? super T>> void mergeSortTest(T[] arr) {
        System.out.println("Merge Sort:");
        printArray(arr);
        mergeSort(arr);
        printArray(arr);
        System.out.println();
    }

    private static <T extends Comparable<? super T>> void quickSortTest(T[] arr) {
        System.out.println("Quick Sort:");
        printArray(arr);
        quickSort(arr);
        printArray(arr);
        System.out.println();
    }

    private static <T extends Comparable<? super T>> void ArraysSortTest(T[] arr) {
        System.out.println("Arrays.sort:");
        printArray(arr);
        Arrays.sort(arr);
        printArray(arr);
        System.out.println();
    }
}