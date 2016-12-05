package com.dvanzhula.app.classwork.lesson19;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dmitry Vanzhula on 12/3/16.
 */
public class Maps {
    public static void main(String[] args) {

        Map map = new HashMap<>();
        map.put("Zara","8");
        map.put("Dima", "10");
        map.put("Sasha", "17");
        System.out.println(map.get("Zara"));
        System.out.println("    Map Elements");
        System.out.println("\t" + map);
        System.out.println("\n" + "value:" + "" + map.containsValue("10"));

    }
}