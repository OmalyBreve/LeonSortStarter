package edu.ujcv.progra1;
import java.util.Random;



public class prom {

        public static void main(String[] args) {
            int[] arr1 = new int[1000];
            int[] arr2 = new int[1000];
            int[] arr3 = new int[1000];
            int[] arr4 = new int[1000];
            int[] arr5 = new int[1000];
            Random random = new Random();
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = Math.abs(random.nextInt(10000));
                arr2[i] = Math.abs(random.nextInt(10000));
                arr3[i] = Math.abs(random.nextInt(10000));
                arr4[i] = Math.abs(random.nextInt(10000));
                arr5[i] = Math.abs(random.nextInt(10000));
            }
            BubleSort b = new BubleSort();
            ShuffleSort s = new ShuffleSort();
            MergeSort m = new MergeSort();
            QuickSort it = new QuickSort();
            HeapSort h = new HeapSort();


            long a1 = it.sort(arr1);
            long a2 = it.sort(arr2);
            long a3 = it.sort(arr3);
            long a4 = it.sort(arr4);
            long a5 = it.sort(arr5);
            double promedio1 = a1 + a2 + a3 + a4 + a5;
            System.out.println(("BIENVENIDO, AQUI CALCULAREMOS EL PROMEDIO DE LOS 4 ALGORITMOS, EL SHUFFLESORT NO POR INEFICIENTE"));
            System.out.println("\nEl Promedio del QuickSort es de: " + (promedio1 / 5 + " Milisegundoos"));

            long b1 = m.sort(arr1);
            long b2 = m.sort(arr2);
            long b3 = m.sort(arr3);
            long b4 = m.sort(arr4);
            long b5 = m.sort(arr5);
            double promedio2 = b1 + b2 + b3 + b4 + b5;
            System.out.println("El Promedio del MergeSort Sort es de: " + (promedio2 / 5 + " Milisegundos"));

            long c1 = h.sort(arr1);
            long c2 = h.sort(arr2);
            long c3 = h.sort(arr3);
            long c4 = h.sort(arr4);
            long c5 = h.sort(arr5);
            double promedio3 = c1 + c2 + c3 + c4 + c5;
            System.out.println("El Promedio del HeapSort Sort es de: " + (promedio3 / 5 + " Milisegundos"));

            long d1 = b.sort(arr1);
            long d2 = b.sort(arr2);
            long d3 = b.sort(arr3);
            long d4 = b.sort(arr4);
            long d5 = b.sort(arr5);
            double promedio4 = d1 + d2 + d3 + d4 + d5;
            System.out.println("El Promedio del BubbleSort Sort es de: " + (promedio4 / 5 + " Milisegundos"));
        }
    }
