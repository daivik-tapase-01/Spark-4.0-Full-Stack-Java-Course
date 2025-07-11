package javabasics.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        // order, duplicate, index access

        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        System.out.println(nums);

        System.out.println(nums.get(3));

        System.out.println(nums.size());

        if(nums.isEmpty()){
            System.out.println("List empty");
        }else{
            System.out.println("not empty..");
        }

        nums.add(3,90);
        System.out.println(nums);

        nums.remove(3);
        System.out.println(nums);

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        System.out.println("list is: " + list);

        if(list.isEmpty()){
            System.out.println("list is empty");
        }else{
            System.out.println("list is not empty");
        }

        list.clear();
        System.out.println("list is: " + list);

        if(list.isEmpty()){
            System.out.println("list is empty");
        }else{
            System.out.println("list is not empty");
        }

        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()){
            int data = it.next();
            if(data == 30){
                System.out.println("removing 30");
                it.remove();
            }else{
                System.out.println(data);
            }
        }

    }
}
