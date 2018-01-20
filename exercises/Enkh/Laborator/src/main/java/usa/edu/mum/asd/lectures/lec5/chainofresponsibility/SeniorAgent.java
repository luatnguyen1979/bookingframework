package usa.edu.mum.asd.lectures.lec5.chainofresponsibility;

public class SeniorAgent extends AbstractAgent {

    @Override
    public void handleRequest(Request req) {
        if (this.canHandleRequest(req)) {
            //handle this request
            req.setAnswered(true);
        } else {
            if (this.nextAgent != null)
                this.nextAgent.handleRequest(req);
        }
    }
}