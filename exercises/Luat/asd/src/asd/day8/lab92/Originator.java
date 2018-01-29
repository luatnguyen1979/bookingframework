/**
 * 
 */
package asd.day8.lab92;

/**
 * @author luatnguyen
 *
 */
public class Originator {
	private String changeState;

	public String getChangeState() {
		return changeState;
	}

	public void setChangeState(String ChangeState) {
		this.changeState = ChangeState;
	}

	public Memento saveStateToMemento() {
		return new Memento(changeState);
	}

	public void getStateFromMemento(Memento memento) {
		changeState = memento.getState();
	}
}
