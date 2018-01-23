/**
 * 
 */
package asd.day7.lab81;

/**
 * @author luatnguyen
 *
 */
public class CallContent {
	private String reqContent;
	private String respContent;
	/**
	 * @return the reqContent
	 */
	
	
	public String getReqContent() {
		return reqContent;
	}
	/**
	 * @param reqContent
	 * @param respContent
	 */
	public CallContent(String reqContent, String respContent) {
		super();
		this.reqContent = reqContent;
		this.respContent = respContent;
	}
	/**
	 * @param reqContent the reqContent to set
	 */
	public void setReqContent(String reqContent) {
		this.reqContent = reqContent;
	}
	/**
	 * @return the respContent
	 */
	public String getRespContent() {
		return respContent;
	}
	/**
	 * @param respContent the respContent to set
	 */
	public void setRespContent(String respContent) {
		this.respContent = respContent;
	}
	
	
}
