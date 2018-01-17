package com.asd.lab13.prob2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
	public static void main(String[] args){
		Random randomGenerator = new Random();
		List<Integer> linkedList = new LinkedList<>();
		for(int i = 0; i<2345567; i++){
			linkedList.add(randomGenerator.nextInt(2345567));
		}
		linkedList = new LinkedListProfiler<>(linkedList);
		linkedList.add(234);
		linkedList.remove((Object)234);
		linkedList.contains(6868);
		linkedList.size();
		
		List<Integer> arrayList = new ArrayList<>();
		for(int i = 0; i<2345567; i++){
			arrayList.add(randomGenerator.nextInt(2345567));
		}
		arrayList = new ArrayListProfiler<>(arrayList);
		arrayList.add(234);
		arrayList.remove((Object)234);
		arrayList.contains(6868);
		arrayList.size();
		
		
	}
}
