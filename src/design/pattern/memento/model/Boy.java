package design.pattern.memento.model;

public class Boy {

	private String state = "";

	public void changeState() {
		this.state = "心情可能不好...";
	}

	public Memento createMemento() {
		return new Memento(this.state);
	}

	public void restoryMemento(Memento memento) {
		this.setState(memento.getState());
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
