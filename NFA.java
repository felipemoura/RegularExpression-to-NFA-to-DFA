import java.util.LinkedList;

public class NFA {
	private LinkedList<State> nfa;
	
	public NFA () {
		this.setNfa(new LinkedList<State> ());
		this.getNfa().clear();
	}

	public LinkedList<State> getNfa() {
		return nfa;
	}

	public void setNfa(LinkedList<State> nfa) {
		this.nfa = nfa;
	}
}
// This line make it work