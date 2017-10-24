/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortalgorithms;

import java.util.Random;

/**
 *
 * @author Kuba
 */
public class SortAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long start, stop;
        HeapSort2 h2 = new HeapSort2();
        MergeSort ms = new MergeSort();
        QuickSort qs = new QuickSort();
        InsertSort is = new InsertSort();

        System.out.println("~~~~~~HEAPSORT~~~~~~");
        double[] vd = new double[10];
        generateRandomValues(vd);
        System.out.println("Łańcuch przed posortowaniem: \t" + arrayToString(vd));
        start = System.nanoTime();
        h2.sort(vd);
        stop = System.nanoTime();
        System.out.println("Łańcuch po posortowaniu: \t" + arrayToString(vd));
        System.out.println("Czas sortowania tablicy: " + (stop - start) + " ns");
        System.out.println();

        System.out.println("~~~~~~MERGESORT~~~~~~");
        int[] vi1 = new int[10];
        generateRandomValues(vi1);
        System.out.println("Łańcuch przed posortowaniem: \t" + arrayToString(vi1));
        start = System.nanoTime();
        ms.sort(vi1);
        stop = System.nanoTime();
        System.out.println("Łańcuch po posortowaniu: \t" + arrayToString(vi1));
        System.out.println("Czas sortowania tablicy: " + (stop - start) + " ns");
        System.out.println();

        System.out.println("~~~~~~QUICKSORT~~~~~~");
        int[] vi2 = new int[10];
        generateRandomValues(vi2);
        System.out.println("Łańcuch przed posortowaniem: \t" + arrayToString(vi2));
        start = System.nanoTime();
        qs.sort(vi2);
        stop = System.nanoTime();
        System.out.println("Łańcuch po posortowaniu: \t" + arrayToString(vi2));
        System.out.println("Czas sortowania tablicy: " + (stop - start) + " ns");
        System.out.println();

        System.out.println("~~~~~~INSERTSORT~~~~~~");
        int[] vi3 = new int[10];
        generateRandomValues(vi3);
        System.out.println("Łańcuch przed posortowaniem: \t" + arrayToString(vi3));
        start = System.nanoTime();
        is.sort(vi3);
        stop = System.nanoTime();
        System.out.println("Łańcuch po posortowaniu: \t" + arrayToString(vi3));
        System.out.println("Czas sortowania tablicy: " + (stop - start) + " ns");
        System.out.println();
    }

    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static String arrayToString(double[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void generateRandomValues(double[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextDouble();
        }
    }

    public static void generateRandomValues(int[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
        }
    }
}
