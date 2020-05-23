package com.base.collections;

import java.util.*;

public class Sets {
    public static void myHashSet() {
        Set<String> set = new HashSet<>();
        set.add("b1");
        System.out.println(set);
    }

    public static void myTreeSet() {
        Set<String> tree = new TreeSet<>();
        tree.add("b1");
        System.out.println(tree);
    }

    public static void myLinkedSet() {
        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("b1");
        System.out.println(linkedSet);
    }
}
