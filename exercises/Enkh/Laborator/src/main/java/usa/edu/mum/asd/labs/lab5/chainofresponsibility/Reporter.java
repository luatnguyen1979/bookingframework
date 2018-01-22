package usa.edu.mum.asd.labs.lab5.chainofresponsibility;

public class Reporter extends AbstractProcessor {

    @Override
    public void handleRequest(CallRecord callRecord) {
        if (canHandleRequest(callRecord)) {
            if (callRecord.isASalesLead()) {
                System.out.println(callRecord.toString());
            }
        }
    }

    @Override
    boolean canHandleRequest(CallRecord callRecord) {
        return true;
    }
}
