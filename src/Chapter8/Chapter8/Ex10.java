package Ch8_HW;

import java.util.Arrays;
import java.util.Comparator;

class Student {
    String lastName;
    String firstName;
    int section;

    public Student(String firstName, String lastName, int section) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.section = section;
    }

    @Override
    public String toString() {
        return firstName + "\t" + lastName + "\t\t" + section;
    }
}

public class Ex10 {

    public static <T> void selectSort(T[] A, Comparator<T> cmp) {
        // Implementation of Selection Sort using custom comparator
        // ...
    }

    public static <T> void insertionSort(T[] A, Comparator<T> cmp) {
        // Implementation of Insertion Sort using custom comparator
        // ...
    }

    public static <T> void bubbleSort(T[] A, Comparator<T> cmp) {
        // Implementation of Bubble Sort using custom comparator
        // ...
    }

    public static <T> void heapSort(T[] A, Comparator<T> cmp) {
        // Implementation of Heap Sort using custom comparator
        // ...
    }

    public static <T> void mergeSort(T[] A, Comparator<T> cmp) {
        // Implementation of Merge Sort using custom comparator
        // ...
    }

    public static <T> void quickSort(T[] A, Comparator<T> cmp) {
        // Implementation of Quick Sort using custom comparator
        // ...
    }

    // Comparator for ordering students first by last name, then by first name
    public static Comparator<Student> cmp = Comparator
            .<Student, String>comparing(student -> student.lastName)
            .thenComparing(student -> student.firstName);

    // Comparator for ordering students by section in ascending order
    public static Comparator<Student> cmp2 = Comparator.comparingInt(student -> student.section);

    public static void main(String[] args) {
        // Test the sorting algorithms with the given array of students

        Student[] students = {
                new Student("John", "Neubacher", 3),
                new Student("Ilya", "Lessing", 1),
                new Student("Nabeel", "Aronowitz", 3),
                new Student("Joe", "Jones", 2),
                new Student("Katie", "Senya", 1),
                new Student("John", "Alisson", 2),
                new Student("Betty", "Neubacher", 2),
                new Student("James", "Ledbetter", 2),
                new Student("Betty", "Lipschitz", 2),
                new Student("Ping", "Yi", 1),
                new Student("Jim", "Smith", 3)
        };

        // Call sorting methods with cmp comparator
        selectSortTest(students.clone(), cmp);
        insertionSortTest(students.clone(), cmp);
        bubbleSortTest(students.clone(), cmp);
        heapSortTest(students.clone(), cmp);
        mergeSortTest(students.clone(), cmp);
        quickSortTest(students.clone(), cmp);
        ArraysSortTest(students.clone(), cmp);

        // Call sorting methods with cmp2 comparator
        selectSortTest(students.clone(), cmp2);
        insertionSortTest(students.clone(), cmp2);
        bubbleSortTest(students.clone(), cmp2);
        heapSortTest(students.clone(), cmp2);
        mergeSortTest(students.clone(), cmp2);
        quickSortTest(students.clone(), cmp2);
        ArraysSortTest(students.clone(), cmp2);
    }

    private static <T> void selectSortTest(T[] arr, Comparator<T> cmp) {
        System.out.println("Selection Sort:");
        printArray(arr);
        selectSort(arr, cmp);
        printArray(arr);
        System.out.println();
    }

    private static <T> void insertionSortTest(T[] arr, Comparator<T> cmp) {
        System.out.println("Insertion Sort:");
        printArray(arr);
        insertionSort(arr, cmp);
        printArray(arr);
        System.out.println();
    }

    private static <T> void bubbleSortTest(T[] arr, Comparator<T> cmp) {
        System.out.println("Bubble Sort:");
        printArray(arr);
        bubbleSort(arr, cmp);
        printArray(arr);
        System.out.println();
    }

    private static <T> void heapSortTest(T[] arr, Comparator<T> cmp) {
        System.out.println("Heap Sort:");
        printArray(arr);
        heapSort(arr, cmp);
        printArray(arr);
        System.out.println();
    }

    private static <T> void mergeSortTest(T[] arr, Comparator<T> cmp) {
        System.out.println("Merge Sort:");
        printArray(arr);
        mergeSort(arr, cmp);
        printArray(arr);
        System.out.println();
    }

    private static <T> void quickSortTest(T[] arr, Comparator<T> cmp) {
        System.out.println("Quick Sort:");
        printArray(arr);
        quickSort(arr, cmp);
        printArray(arr);
        System.out.println();
    }

    private static <T> void ArraysSortTest(T[] arr, Comparator<T> cmp) {
        System.out.println("Arrays.sort:");
        printArray(arr);
        Arrays.sort(arr, cmp);
        printArray(arr);
        System.out.println();
    }

    private static <T> void printArray(T[] arr) {
        for (T elem : arr) {
            System.out.println(elem);
        }
    }
}

