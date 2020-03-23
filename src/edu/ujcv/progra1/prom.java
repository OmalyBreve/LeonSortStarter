package edu.ujcv.progra1;
import java.util.Random;



public class prom {

        public static void main(String[] args) {
            int[] arreglo1 = new int[1000];
            int[] arreglo2 = new int[1000];
            int[] arreglo3 = new int[1000];
            int[] arreglo4 = new int[1000];
            int[] arreglo5 = new int[1000];
            Random random = new Random();
            for (int i = 0; i < arreglo1.length; i++) {
                arreglo1[i] = Math.abs(random.nextInt(10000));
                arreglo2[i] = Math.abs(random.nextInt(10000));
                arreglo3[i] = Math.abs(random.nextInt(10000));
                arreglo4[i] = Math.abs(random.nextInt(10000));
                arreglo5[i] = Math.abs(random.nextInt(10000));
            }
            BubleSort b = new BubleSort();
            ShuffleSort s = new ShuffleSort();
            MergeSort m = new MergeSort();
            QuickSort it = new QuickSort();
            HeapSort h = new HeapSort();


            long t1 = it.sort(arreglo1);
            long t2 = it.sort(arreglo2);
            long t3 = it.sort(arreglo3);
            long t4 = it.sort(arreglo4);
            long t5 = it.sort(arreglo5);
            double promedio1 = t1 + t2 + t3 + t4 + t5;
            System.out.println(("BIENVENIDO, AQUI CALCULAREMOS EL PROMEDIO DE LOS 4 ALGORITMOS, EL SHUFFLESORT NO POR INEFICIENTE"));
            System.out.println("\nEl Promedio del QuickSort es de: " + (promedio1 / 5 + " Milisegundoos"));

            long ti1 = m.sort(arreglo1);
            long ti2 = m.sort(arreglo2);
            long ti3 = m.sort(arreglo3);
            long ti4 = m.sort(arreglo4);
            long ti5 = m.sort(arreglo5);
            double promedio2 = ti1 + ti2 + ti3 + ti4 + ti5;
            System.out.println("El Promedio del MergeSort Sort es de: " + (promedio2 / 5 + " Milisegundos"));

            long tie1 = h.sort(arreglo1);
            long tie2 = h.sort(arreglo2);
            long tie3 = h.sort(arreglo3);
            long tie4 = h.sort(arreglo4);
            long tie5 = h.sort(arreglo5);
            double promedio3 = tie1 + tie2 + tie3 + tie4 + tie5;
            System.out.println("El Promedio del HeapSort Sort es de: " + (promedio3 / 5 + " Milisegundos"));

            long tiem1 = b.sort(arreglo1);
            long tiemp2 = b.sort(arreglo2);
            long tiemp3 = b.sort(arreglo3);
            long tiemp4 = b.sort(arreglo4);
            long tiemp5 = b.sort(arreglo5);
            double promedio4 = tiem1 + tiemp2 + tiemp3 + tiemp4 + tiemp5;
            System.out.println("El Promedio del BubbleSort Sort es de: " + (promedio4 / 5 + " Milisegundos"));
        }
    }
