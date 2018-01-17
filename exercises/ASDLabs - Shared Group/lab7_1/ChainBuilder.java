package lab7_1;

public class ChainBuilder {
	private AbstractAgent handler;

	// other necessary code here
	private void buildChain() {
		AbstractAgent validator = new ValidatorAgent();
		AbstractAgent dataWasher = new DataWasherAgent();
		AbstractAgent reporter = new ReporterAgent();
		validator.nextAgent = dataWasher;
		dataWasher.nextAgent = reporter;
		handler = validator;
	}

	public AbstractAgent getHandler() {
		buildChain();
		return handler;
	}
}