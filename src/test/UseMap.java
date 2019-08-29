package test;

import java.util.*;

public class UseMap {
    public static void main(String[] args) {
        Map color=new HashMap();
        color.put(1,"red");
        color.put(2,"blue");
        color.put(3,"white");
        color.put(4,"black");
        System.out.println(color);
        System.out.println(color.entrySet());
        System.out.println(color.containsValue("purple"));
        //using list
        List<String>list= new ArrayList<>();
        list.add("Bangladesh");
        list.add("Usa");
        list.add("India");
        list.add("Pakistan");
        List<String>list2= new ArrayList<>();
        list2.add("Apple");
        list2.add("Mango");
        list2.add("Bannana");
        list2.add("Grapes");
        for (String value:list2){  //using for loop
            System.out.println(value);
        }
        List<String>list3= new ArrayList<>();
        list3.add("Dog");
        list3.add("Cat");
        list3.add("Cow");
        list3.add("Horse");
        Iterator iterator=list3.iterator(); // using iterator
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Map<String, List<String>> topicList = new HashMap<>();
        topicList.put("10",list);
        topicList.put("20",list2);
        topicList.put("30",list3);
        System.out.println(topicList);



    }
}
