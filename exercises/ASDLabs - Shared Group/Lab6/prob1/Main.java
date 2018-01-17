package com.asd.lab6.prob1;

/**
 * Created by Sandip on 4/29/16.
 */
public class Main {
    public static void main(String[] args) {

      NameRepository repository = new NameRepository();
     Iterator iterator=   repository.getIterator(new MyPredicate());

         while (iterator.hasNext()){
             System.out.println(iterator.next());
         }
    }
}
