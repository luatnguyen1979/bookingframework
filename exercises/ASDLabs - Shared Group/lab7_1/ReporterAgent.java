package lab7_1;

import java.util.ArrayList;
import java.util.List;

/**
 * The reporter does is simply generate a report (sales leads) by State where
 * the customer lives.
 */
public class ReporterAgent extends AbstractAgent {

	public List<Agent> getAgents() {
		List<Agent> agents = new ArrayList<>();
		Address address1 = new Address("1000N 4th Street", "Fairfield", "IA", "52557");
		Address address2 = new Address("1100N 4th Street", "Fairfield", "IA", "52556");
		Agent agent1 = new Agent("A1", address1);
		Agent agent2 = new Agent("A2", address2);
		agents.add(agent1);
		agents.add(agent2);
		return agents;
	}


	@Override
	public void handleRequest(List<CallRecord> callRecords) {
		System.out.println("\n\nINFO: Reporting Requests. . .");
		System.out.println("========Discarded Requests after reporting==========");
		List<CallRecord> filteredRecords = new ArrayList<>();
		for (CallRecord callRecord : callRecords) {
			Agent agent = getAgent(callRecord);
			if (agent != null) {
				callRecord.setASalesLead(true);
				callRecord.setAgent(agent);
				filteredRecords.add(callRecord);
			} else {
				callRecord.setASalesLead(false);
				printDiscardedCallRecords(callRecord);
			}
		}
		if (this.nextAgent != null) {
			this.nextAgent.handleRequest(callRecords);
		} else {
			System.out.println("==========Final Report==========");
			for (CallRecord callRecord : filteredRecords) {
				System.out.println(callRecord);
			}
		}
	}

	private void printDiscardedCallRecords(CallRecord callRecord) {
		System.err.println(callRecord);
	}

	private Agent getAgent(CallRecord callRecord) {
		for (Agent agent : getAgents()) {
			if (agent.getWorkLocation().getZipcode().equals(callRecord.getCustomer().getAddress().getZipcode()))
				return agent;
		}
		return null;
	}
}
