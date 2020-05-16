package com.base.collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void setList() {
        List<String> arraylist = new ArrayList<String>();
        arraylist.add("H");
        arraylist.add("e");
        arraylist.add("l");
        arraylist.add("l");
        arraylist.add("o");
        System.out.println(arraylist);

        //is list Empty
        System.out.println("Is this list empty: " + arraylist.isEmpty());
        //add_Element
        arraylist.add("!");
        System.out.println(arraylist);

        //remove_Element
        System.out.println("removed element " + arraylist.remove("!"));
        System.out.println("update list " + arraylist);

        //get_element
        System.out.println("getting element " + arraylist.get(4));

        //index_of_an_element
        System.out.println("index/position of letter 'e' is " + arraylist.indexOf("o"));

        //update_list
        System.out.println("Adding element " + arraylist);
        arraylist.add(5, "!");
        System.out.println("Update list " + arraylist);

        //size
        System.out.println("List has a total " + arraylist.size() + " elements");

        //contains
        if (arraylist.contains("2")) {
            arraylist.remove("!");
            System.out.println("newly updated list " + arraylist);
        } else {
            System.out.println("No such element in the list");
        }

        //iterator
        for (String letter:
             arraylist) {
            if (letter.contains("l")){
                arraylist.remove("e"); //will solve this using linked list
                System.out.println(letter);
            }else
            {
                System.out.print(letter.toCharArray());
            }
        }
    }
}
