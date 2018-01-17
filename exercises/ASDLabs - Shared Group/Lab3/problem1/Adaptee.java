package com.asd.lab2.problem1;

/**
 * Created by Sandip on 4/26/16.
 */
public class Adaptee {

    private String[] data;
    private int start;
    private int end;
    public String startString(){
        return data[start];
    }
    public String endString(){
        return data[end];
    }
    public boolean empty(){
        return ( end == -1 );
    }
    public void add(String str){
        data[end] = str;
        end++;
    }
    public void remove(int pos){
        for ( int i = pos; i < end; i++ ){
            data[i] = data[i+1];
        }
    }
    public String get(int pos){
        return data[pos];
    }
    public int getEnd(){
        return end;
    }
    public int getStart(){
        return start;
    }

}
