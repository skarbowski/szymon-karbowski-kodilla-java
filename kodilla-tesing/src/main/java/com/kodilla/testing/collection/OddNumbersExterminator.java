package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate (ArrayList<Integer> numbers){

           ArrayList<Integer> result = new ArrayList<>();

           for(Integer a: numbers){
               if (a%2==0)
                   result.add(a);
           }
           return result;
    }
}
