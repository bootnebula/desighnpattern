package com.desighnpattern.behavioural.stratergypattern;

public class Boot {


    public static void main(String[] args) {

        SortingContext sortingContext = new SortingContext(new BubbleSort());
        int[] array1 = {5, 2, 9, 1, 5};
        sortingContext.performSort(array1); // Output: Sorting using Bubble Sort

        // Change strategy to MergeSortStrategy
        sortingContext.setSortingStrategy(new MergeSort());
        int[] array2 = {8, 3, 7, 4, 2};
        sortingContext.performSort(array2); // Output: Sorting using Merge Sort

        // Change strategy to QuickSortStrategy
        sortingContext.setSortingStrategy(new HeapSort());
        int[] array3 = {6, 1, 3, 9, 5};
        sortingContext.performSort(array3); // Output: Sorting using Quick Sort

    }
}
