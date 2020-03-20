package edu.ujcv.progra1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] array = new int[100];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.abs(random.nextInt(10000000));
        }

        BubleSort b =new BubleSort();
        array = b.bubleSort(array);

        ShuffleSort s = new ShuffleSort();
        array = s.shuffleSort(array);

        MergeSort m = new MergeSort();
        array = m.mergeSort(array);

        QuickSort q = new QuickSort();
        array = q.quicksort1(array);

        HeapSort h = new HeapSort();
        h.heapSort(array);

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]+", ");
        }


        System.out.println("\n\nBubleSort tarda "+ b.sort(array)+ " milisegundos");
        //System.out.println("\n\nShuffleSort tarda "+ s.sort(array)+ " milisegundos");
        System.out.println("\n\nMergeSort tarda "+ m.sort(array)+ " milisegundos");
        System.out.println("\n\nQuickSort tarda "+ q.sort(array)+ " milisegundos");
        System.out.println("\n\nHeapSort tarda "+ h.sort(array)+ " milisegundos");



    }



}
