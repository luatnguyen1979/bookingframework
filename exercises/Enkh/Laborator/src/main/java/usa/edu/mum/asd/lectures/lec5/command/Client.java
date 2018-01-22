package usa.edu.mum.asd.lectures.lec5.command;

import java.util.LinkedList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        // Object receiver. Command-iig biyluulegch.
        Database receiver = new Database();

        // Command parameters
        Person childIndra = new Person("Indra", "Enkh", null);
        Person childTom = new Person("Tom", "Enkh", null);
        Person childGoogoo = new Person("Googoo", "Sha", null);
        List<Person> children = new LinkedList<>();
        children.add(childIndra);
        children.add(childTom);
        children.add(childGoogoo);
        Person personEnkh = new Person("Enkh", "Erdenebat", children);
        // Concrete & implementor of a command interface
        // Creating command object.
        SaveCommand saveCommand = new SaveCommand(receiver);
        // Invoker
        PersonSubSystemManager invoker = new PersonSubSystemManager();
        invoker.setCurrentCommand(saveCommand);
        invoker.saveParentAndChildren(personEnkh);
    }

    // Why there is no association between client and invoker?
    // Why there is association between invoker and concrete in your source code? Btw, Eegii corrected it.
}
