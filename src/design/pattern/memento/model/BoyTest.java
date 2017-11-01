package design.pattern.memento.model;

public class BoyTest {

	public static void main(String[] args) {
		Boy boy = new Boy();
		boy.setState("心情好...");
		
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(boy.createMemento());
		
		boy.changeState();
		
		boy.restoryMemento(caretaker.getMemento());
		
		String state = boy.getState();
		System.out.println(state);

	}

}
