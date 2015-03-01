import java.util.LinkedList;

public class DFA {
	private LinkedList<State> dfa;
	
	public DFA () {
		this.setDfa(new LinkedList<State> ());
		this.getDfa().clear();
	}

	public LinkedList<State> getDfa() {
		return dfa;
	}

	public void setDfa(LinkedList<State> nfa) {
		this.dfa = nfa;
	}
}
// This line make it work