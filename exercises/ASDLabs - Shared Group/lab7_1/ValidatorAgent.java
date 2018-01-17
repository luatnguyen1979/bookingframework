package lab7_1;

import java.util.ArrayList;
import java.util.List;

/**
 * The first one (Validator) will check if a request has the valid contact
 * information provided (email, phone and address) and then separates the valid
 * from the invalid ones. The invalid requests will be saved in a
 * "discarded-requests" file.
 */
public class ValidatorAgent extends AbstractAgent {

	@Override
	public void handleRequest(List<CallRecord> callRecords) {
		List<CallRecord> filteredRecords = new ArrayList<>();
		System.out.println("INFO: Validating Requests. . .");
		System.out.println("========Discarded Requests after validation==========");
		for (CallRecord callRecord : callRecords) {
			if (callRecord.getCustomer() != null && callRecord.getCustomer().getAddress() != null
					&& callRecord.getCustomer().isValidCustomer()
					&& callRecord.getCustomer().getAddress().isValidAddress()) {
				callRecord.setValid(true);
				filteredRecords.add(callRecord);
			} else {
				callRecord.setValid(false);
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