package org.basics;

import java.util.*;

public class Assignment {
    public static void main(String[] args) {
// 1)   Given a List of Integers find total count, min, max, sum, and the average for numbers by using Stream api
//    input  :list=[2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
//    output: count=10, sum=129, min=2, average=12.900000, max=29

        List<Integer> list= Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        System.out.println("count="+list.stream().count());
        System.out.println("sum="+list.stream().mapToInt(Integer::intValue).sum());
        System.out.println("min="+list.stream().min(Integer::compareTo).orElse(0));
        System.out.println("avg="+list.stream().mapToInt(Integer::intValue).average().orElse(0.0));
        System.out.println("max="+list.stream().max(Integer::compareTo).orElse(0));


//        2) Remove the duplicates from the list and ignore the case
//        if the string length is same then add it in the list then store it in Map

                List<String> list2 = Arrays.asList("Capgemini", "capgemini", "Amazon", "Microsoft");
                Set<String> set = new HashSet<>();
                List<String> tempList = new ArrayList<>();

                for (String str : list2) {
                    String lowerCase = str.toLowerCase();
                    if (set.add(lowerCase)) {
                        tempList.add(str);
                    }
                }
                Map<Integer, List<String>> map = new HashMap<>();
                for (String str : tempList) {
                    int length = str.length();
                    map.computeIfAbsent(length, k -> new ArrayList<>()).add(str);
                }
                System.out.println(map);
    }
}
