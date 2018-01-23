/**
 * 
 */
package asd.day7.lab81;

/**
 * @author luatnguyen
 *
 */
public class RequestApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		Agent agent1 = new Agent("001", "Tri Nguyen");
		Agent agent2 = new Agent("002", "Duc Vo");
		
		RequestDirector reqDirector = new RequestDirector(new RequestBuilder());
		
		reqDirector.initRequest(agent1);
		reqDirector.saveRequest("Luat", "Nguyen", "1234567890", "Coudl you please deliver my package today", "yes, sir");
		reqDirector.closeRequest(true, false, false);
		
		reqDirector.initRequest(agent2);
		reqDirector.saveRequest("Dan", "Cao", "123456789", "What is my status order", "I don't know");
		reqDirector.closeRequest(false, true, true);

		reqDirector.initRequest(agent1);
		reqDirector.saveRequest("Dan", "Cao", "123456789", "I would like to check my order", "It's delivered.");
		reqDirector.closeRequest(true, true, false);

	}

}
