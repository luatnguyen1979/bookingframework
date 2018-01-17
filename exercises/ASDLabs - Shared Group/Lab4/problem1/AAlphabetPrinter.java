package com.asd.lab4.prob1;

/**
 * Created by Sandip on 4/27/16.
 */
public abstract  class AAlphabetPrinter {
    private static final  int MATRIX_ROW = 10;
    private static final  int MATRIX_COL = 20;
    /*
    * Basic Steps Involved:
    * Identifying the type of symmetry
    * Constructing the complete image from the symmetric figure
    * Printing the complete letter in the console
    * */
    public final void process(char[][] originalHalf){
         Symmetry symmetry= identifySymmetry(originalHalf);
         char[][] completeImage= reconstruct(originalHalf,symmetry);
         print(completeImage);
    }
 public abstract  Symmetry identifySymmetry(char[][] originalHalf);
public abstract  char[][] reconstruct(char[][] originalHalf,Symmetry symmetry);
public abstract  void print(char[][] completeImage);


    public enum  Symmetry{
        VERTICAL,NONE,HORIZONTAL

    }




}
