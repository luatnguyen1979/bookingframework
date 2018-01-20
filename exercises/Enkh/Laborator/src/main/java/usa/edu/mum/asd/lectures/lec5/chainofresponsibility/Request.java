package usa.edu.mum.asd.lectures.lec5.chainofresponsibility;

/**
 * Created by Eegii
 */
public class Request {

    private final String request;

    private final Level level;

    private boolean answered;

    public Request(String request, Level level) {
        this.request = request;
        this.level = level;
        this.answered = false;
    }

    public String getRequest() {
        return request;
    }

    public Level getLevel() {
        return level;
    }

    public boolean isAnswered() {
        return answered;
    }

    public void setAnswered(boolean answered) {
        this.answered = answered;
    }
}
