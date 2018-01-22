package usa.edu.mum.asd.labs.lab5.chainofresponsibility;

public class DataWasher extends AbstractProcessor {

    public DataWasher(AbstractProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    @Override
    public void handleRequest(CallRecord callRecord) {
        if (canHandleRequest(callRecord)) {
            if (callRecord.getAgent().getAgentId().startsWith("L"))
                callRecord.setASalesLead(true);
            else
                callRecord.setASalesLead(false);
            if (nextProcessor != null) nextProcessor.handleRequest(callRecord);
        }
    }

    @Override
    boolean canHandleRequest(CallRecord callRecord) {
        return callRecord.isValid();
    }
}
