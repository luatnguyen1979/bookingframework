package usa.edu.mum.asd.labs.lab5.chainofresponsibility;

public class Client {

    public static void main(String[] args) {
        AbstractProcessor reporter = new Reporter();
        AbstractProcessor dataWasher = new DataWasher(reporter);
        AbstractProcessor validator = new Validator(dataWasher, "/home/eegii/labtest/invalid_callrecords.txt");

        //
        Address validAddress = new Address("2000 North Court Street, 16C", "Fairfield", "Iowa",
                "52556");
        Address inValidAddress = null;
        Agent salesLeadAgent = new Agent("L245", validAddress);
        Agent normalAgent = new Agent("346", validAddress);
        Customer validCustomer1 = new Customer("Enkh", "Erdenebat", validAddress, "6414513029",
                "eerdenebat@mum.edu");
        Customer validCustomer2 = new Customer("Enkh", "Erdenebat", validAddress, "6414513029",
                "eerdenebat@mum.edu");
        Customer invalidCustomer1 = new Customer("Enkh", "Erdenebat", inValidAddress, "6414513029",
                "eerdenebat@mum.edu");
        Customer invalidCustomer2 = new Customer("Enkh", "Erdenebat", inValidAddress, "6414513029",
                "eerdenebat@mum.edu");
        CallRecord callRecord1 = new CallRecord(validCustomer1, normalAgent, "Can you help me?");
        CallRecord callRecord2 = new CallRecord(validCustomer2, salesLeadAgent, "Can you help me?");
        CallRecord callRecord3 = new CallRecord(validCustomer1, salesLeadAgent, "Can you help me?");
        CallRecord callRecord4 = new CallRecord(invalidCustomer1, normalAgent, "Can you help me?");
        CallRecord callRecord5 = new CallRecord(invalidCustomer2, salesLeadAgent, "Can you help me?");
        validator.handleRequest(callRecord1);
        validator.handleRequest(callRecord2);
        validator.handleRequest(callRecord3);
        validator.handleRequest(callRecord4);
        validator.handleRequest(callRecord5);
    }
}
