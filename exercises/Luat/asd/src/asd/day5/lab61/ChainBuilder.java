/**
 * 
 */
package asd.day5.lab61;

/**
 * @author luatnguyen
 *
 */
public class ChainBuilder {
	private AbstractAgent handler;
	
	
	public AbstractAgent getHandler() {
		buildChain();
		return handler;
	}
	private void buildChain() {
		AbstractAgent validator = new ValidatorAgent();
		AbstractAgent dataWasher = new DataWasher();
		AbstractAgent reporter = new ReporterAgent();
		validator.nextAgent = dataWasher;
		dataWasher.nextAgent = reporter;
		handler = validator;
	}

}
