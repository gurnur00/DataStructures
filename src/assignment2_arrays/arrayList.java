package assignment2_arrays;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " -> " + list.size());

        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        System.out.println(list + " -> " + list.size());

        list.add(1,1000);

        int val = list.get(3);         // cannot use list[1]
        System.out.println(val);

        list.set(1,2000);          //cannot use list[1] = 2000
        System.out.println(list + " -> " + list.size());

        list.remove(1);
        System.out.println(list + " -> " + list.size());

        ArrayList<String> str = new ArrayList<>();
        str.add("Hi");
        str.add("Hey");
        str.add("Heya");
        str.add("Hello");
        str.add("Helloz");
        System.out.println(str + " -> " + str.size());
    }
}
