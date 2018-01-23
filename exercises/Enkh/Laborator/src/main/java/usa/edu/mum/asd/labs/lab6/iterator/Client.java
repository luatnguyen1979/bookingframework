package usa.edu.mum.asd.labs.lab6.iterator;

public class Client {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        nameRepository.addName("Enkh");
        nameRepository.addName("Enkh1");
        nameRepository.addName("Enkh2");
        nameRepository.addName("Enkh3");
        nameRepository.addName("Enkh4");
        nameRepository.addName("Enkh5");
        nameRepository.addName("Enkh6");
        System.out.println(nameRepository.removeName(0,0));
        System.out.println(nameRepository.getSize());
        Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
    }
}
