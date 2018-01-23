/**
 * 
 */
package asd.day7.lab81;

/**
 * @author luatnguyen
 *
 */
public class Request {
	
		private String reqId;
		private Customer requester;
		private Agent agent;
		private String reqContent;
		private String respContent;
		private boolean isAnswered;
		private boolean isSaleLead;
		private boolean needCallBack;
		
		
		/**
		 * @param reqId
		 * @param agent
		 */
		public Request(String reqId, Agent agent) {
			super();
			this.reqId = reqId;
			this.agent = agent;
		}
		/**
		 * @return the reqId
		 */
		public String getReqId() {
			return reqId;
		}
		/**
		 * @param reqId the reqId to set
		 */
		public void setReqId(String reqId) {
			this.reqId = reqId;
		}
		/**
		 * @return the requester
		 */
		public Customer getRequester() {
			return requester;
		}
		/**
		 * @param requester the requester to set
		 */
		public void setRequester(Customer requester) {
			this.requester = requester;
		}
		/**
		 * @return the agent
		 */
		public Agent getAgent() {
			return agent;
		}
		/**
		 * @param agent the agent to set
		 */
		public void setAgent(Agent agent) {
			this.agent = agent;
		}
		/**
		 * @return the reqContent
		 */
		public String getReqContent() {
			return reqContent;
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
		/**
		 * @return the isAnswered
		 */
		public boolean isAnswered() {
			return isAnswered;
		}
		/**
		 * @param isAnswered the isAnswered to set
		 */
		public void setAnswered(boolean isAnswered) {
			this.isAnswered = isAnswered;
		}
		/**
		 * @return the isSaleLead
		 */
		public boolean isSaleLead() {
			return isSaleLead;
		}
		/**
		 * @param isSaleLead the isSaleLead to set
		 */
		public void setSaleLead(boolean isSaleLead) {
			this.isSaleLead = isSaleLead;
		}
		/**
		 * @return the needCallBack
		 */
		public boolean isNeedCallBack() {
			return needCallBack;
		}
		/**
		 * @param needCallBack the needCallBack to set
		 */
		public void setNeedCallBack(boolean needCallBack) {
			this.needCallBack = needCallBack;
		}
		
		
}
