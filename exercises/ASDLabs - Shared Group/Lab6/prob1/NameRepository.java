package com.asd.lab6.prob1;

/**
 * Created by Sandip on 4/29/16.
 */
public class NameRepository implements Aggregate {
    private String names[][] =new String[][]{ {"Rob" ,"-", "Jon" ,"Jul" , "Lor", "Pat","-","-",
            "Ken"},{"-","Rob" , "Jon"}};
    @Override
    public Iterator getIterator(Predicate<String> predicate) {
        return new NameIterator(predicate);
    }
    private class NameIterator implements Iterator {
        int row;
        int col;
        private Predicate<String> predicate;

        public NameIterator(Predicate<String> predicate){
            this.predicate= predicate;
        }
        @Override
        public boolean hasNext() {
        int rowTotal = names.length;
        int colTotal = names[row].length;
        if (col>=colTotal){
            col=0;
            row++;
        }
      if (row<rowTotal)return true;
            return  false;
        }
        @Override
        public Object next() {
            if(this.hasNext()){

                    String element =names[row][col];
                    col++;
                    if (predicate.check(element)){
                        return element;
                    }else {
                        return next();
                    }
            }
            return null;
        }
    }
}
