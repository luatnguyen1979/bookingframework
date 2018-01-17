package usa.edu.mum.asd.lectures.lec2.adapter;

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
    }
}
