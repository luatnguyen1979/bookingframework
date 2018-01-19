package usa.edu.mum.asd.labs.lab2.adapter;

public class Client {

    public static void main(String[] args) {
        Target1 target1 = new Adapter();
        System.out.println(target1.isEmpty());
        target1.push("1");
        target1.push("2");
        System.out.println("Size=" + target1.size());
        System.out.println(target1.pop());
        System.out.println(target1.pop());
        System.out.println(target1.isEmpty());
        System.out.println("=======================");
        Target2 target2 = new Adapter();
        System.out.println(target2.isEmpty());
        target2.enqueue("1");
        target2.enqueue("2");
        System.out.println("Size=" + target2.size());
        System.out.println(target2.dequeue());
        System.out.println(target2.dequeue());
        System.out.println(target2.isEmpty());
        System.out.println("Size=" + target2.size());
    }
}
