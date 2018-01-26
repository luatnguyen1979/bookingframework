package usa.edu.mum.asd.labs.lab10.decorator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(String.valueOf("i"));
            arrayList.add(String.valueOf("i"));
        }
        ConcreteComponentList concreteComponentList1 = new ConcreteComponentList(linkedList);
        ConcreteComponentList concreteComponentList2 = new ConcreteComponentList(arrayList);
        ListProfiler linkedListProfiler = new ListProfiler(concreteComponentList1);
        ListProfiler arrayListProfiler = new ListProfiler(concreteComponentList2);
        System.out.println("======================= Linked list =====================");
        System.out.println(linkedListProfiler.add(100));
        System.out.println(linkedListProfiler.contains(100));
        System.out.println(linkedListProfiler.size());
        System.out.println(linkedListProfiler.remove(100));
        System.out.println("======================= Array list =====================");
        System.out.println(arrayListProfiler.add(100));
        System.out.println(arrayListProfiler.contains(100));
        System.out.println(arrayListProfiler.size());
        System.out.println(arrayListProfiler.remove(100));
    }
}
