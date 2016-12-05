package com.dvanzhula.app.classwork.lesson19;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by Dmitry Vanzhula on 12/3/16.
 */
public class HashWords {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("A");
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("D");
        hashSet.add("C");
        System.out.println(hashSet);
        TreeSet treeSet = new TreeSet(hashSet);
        System.out.println(treeSet);
    }
}
