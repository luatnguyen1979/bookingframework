package lab7_1;

import java.util.List;

public abstract class AbstractAgent {
	protected AbstractAgent nextAgent;

	abstract public void handleRequest(List<CallRecord> callRecords);

}
