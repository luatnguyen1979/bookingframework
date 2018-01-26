package usa.edu.mum.asd.lectures.lec11.mediator;

public interface ChatroomMediator {

    public void sendMessage(String msg, User user);

    public void addUser(User user);
}
