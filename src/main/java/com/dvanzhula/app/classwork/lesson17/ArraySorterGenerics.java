package com.dvanzhula.app.classwork.lesson17;

import java.util.Arrays;

/**
 * Created by Dmitry Vanzhula on 11/30/16.
 */
public class ArraySorterGenerics<T extends Number> {

    private T[] t;

    public ArraySorterGenerics(T[] t) {
        this.t = t;
    }

    public T[] sort() {

        for (int i = t.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (t[j].doubleValue() < t[j + 1].doubleValue()) {
                    T temporary = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = temporary;
                }
            }
        }
        return t;
    }

    public static <T extends Number>T[] sort(T[] array){
        ArraySorterGenerics<T> sorterGenerics = new ArraySorterGenerics<T>(array);
        return sorterGenerics.sort();
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[5];
        for(int i = 0; i < integers.length;i++){
            integers[i] = 100 - i;
        }
        System.out.println(Arrays.toString(integers));
        ArraySorterGenerics<Integer> arraySorterGenerics = new ArraySorterGenerics<>(integers);
        Integer[] sort = arraySorterGenerics.sort(integers);
        System.out.println(Arrays.toString(sort));

        Integer[] sort2 = ArraySorterGenerics.sort(integers);
        System.out.println(Arrays.toString(sort2));
    }
}

