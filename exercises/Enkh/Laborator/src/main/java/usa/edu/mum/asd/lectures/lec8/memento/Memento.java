package usa.edu.mum.asd.lectures.lec8.memento;

class Memento {

    private final String argument1;
    private final Integer argument2;

    public Memento(String argument1, Integer argument2) {
        this.argument1 = argument1;
        this.argument2 = argument2;
    }

    public String getArgument1() {
        return argument1;
    }

    public Integer getArgument2() {
        return argument2;
    }
}