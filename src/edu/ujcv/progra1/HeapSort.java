package edu.ujcv.progra1;

public class HeapSort implements SortTester {

    @Override
    public long sort(int[] array) {
        long start = System.nanoTime();
        heapSort(array);
        long end = System.nanoTime();
        return end - start;
    }
    public static int[] heapSort(int[] arr) {

        armarheap(arr);
        int sizeOfHeap = arr.length - 1;
        for (int i = sizeOfHeap; i > 0; i--) {
            intercambiar(arr, 0, i);
            sizeOfHeap = sizeOfHeap - 1;
            heapify(arr, 0, sizeOfHeap);
        }
        return arr;
    }
   