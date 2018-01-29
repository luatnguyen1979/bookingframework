/**
 * 
 */
package asd.day9.lab13_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author luatnguyen
 *
 */
public class ListProfileApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		for (int i=0; i < 10000; i ++) {
			arrayList.add(new Integer(1));
			linkedList.add(new Integer(1));
		}
		
		DecoratorListProfile<Integer> arrayListProfile1 = new ArrayListProfiler(arrayList);
		DecoratorListProfile<Integer> linkedListProfile1 = new LinkedListProfiler(linkedList);
		Integer integerObj = new Integer(1000);
		System.out.println("\t"+arrayListProfile1.add(integerObj));
		System.out.println("\t"+linkedListProfile1.add(integerObj));
		System.out.println("\t"+arrayListProfile1.contains(integerObj));
		System.out.println("\t"+linkedListProfile1.contains(integerObj));
		System.out.println("\t"+arrayListProfile1.size());
		System.out.println("\t"+linkedListProfile1.size());
		System.out.println("\t"+arrayListProfile1.remove(integerObj));
		System.out.println("\t"+linkedListProfile1.remove(integerObj));
	}

}
