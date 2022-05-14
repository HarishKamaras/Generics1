package com.bridgelabz.maximumgenerics;

public class GenericClass<T extends Comparable <T>> {
    public void testMaxium(T... n) {
       Integer i=0;
       T max = n[i];
       for (T a:n) {
           if (n[i].compareTo(max) > 0)
               max = n[i];
           i++;
       }
       System.out.println("The maximum Value is : "+max);
   }
}

