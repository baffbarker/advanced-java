package com.jeremy.examples.guava_example2;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Multiset<String> animals = HashMultiset.create();
       
       animals.add("cat");
       animals.add("dog");
       animals.add("cat");
       
      animals.forEach(System.out::println);
    }
}
