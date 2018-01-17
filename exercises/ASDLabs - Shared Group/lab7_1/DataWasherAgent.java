package lab7_1;

import java.util.ArrayList;
import java.util.List;

/**
 * The Data Washer will do some analysis on each request and generate sales
 * leads before passing them to the third/last process, called Reporter.
 */
public class DataWasherAgent extends AbstractAgent {

	@Override
	public void handleRequest(List<CallRecord> callRecords) {
		System.out.println("\n\nINFO: Analysing Requests. . .");
		List<CallRecord> filteredRecords = new ArrayList<>();
		System.out.println("========Discarded Requests after analysis==========");
		for(CallRecord callRecord: callRecords){
			if(callRecord.getRequestInformation().contains("urgent")){
				filteredRecords.add(callRecord);
			}else{
				printDiscardedCallRecords(callRecord);
			}
		}
		if (this.nextAgent != null)
			this.nextAgent.handleRequest(filteredRecords);
	}
	
	private void printDiscardedCallRecords(CallRecord callRecord){
		System.err.println(callRecord);
	}
}
