package test;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {
    public static void main(String[] args) {
        ArrayList city = new ArrayList();
        city.add("Tampa");
        city.add("Miami");
        city.add("Seffner");
        city.add("St Pete");
        System.out.println(city.get(3));
        System.out.println(city.remove(2));
        System.out.println(city.size());
        for(Object cityNames:city){  //using for loop
            System.out.println(cityNames);
        }

        ArrayList state = new ArrayList();
        state.add("FL");
        state.add("NY");
        state.add("VA");
        Iterator iterator = state.iterator(); //using Iterator
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
