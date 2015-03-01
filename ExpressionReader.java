import java.util.ArrayList;
import java.util.Scanner;

public class ExpressionReader {
	private static Scanner s;
	private static String regular;
	
	// Reads all the expressions in this arrayList
	private static ArrayList<String> expressions = new ArrayList<String>();
	
	// stores de NFA
	private static NFA nfa;
	
	// stores the DFA
	private static DFA dfa;

	public static void main(String[] args) {
		// Create a Scanner object
		s = new Scanner (System.in);

		// Read the regular expression
		regular = s.next();

		// Read all the expressions to apply the regular expression
		while(s.hasNext()) {	expressions.add (s.next());		}
		
		// Generate NFA using thompson algorithms with the Regular Expression
		setNfa (RegularExpression.generateNFA (regular));		
		
		// Generate DFA using the previous NFA and the Subset Construction Algorithm
		setDfa (RegularExpression.generateDFA (getNfa()));
		
		// Validate all the string with the DFA
		// yes = valid string
		// no = invalid string
		for (String str : expressions) {
			if (ValidateExpression.validate(getDfa(), str)) {	System.out.println ("yes");	}
			else 											{	System.out.println ("no");	}
		}
			
		// End of program
	}

	// Getters and Setters
	public static NFA getNfa() {
		return nfa;
	}

	public static void setNfa(NFA nfa) {
		ExpressionReader.nfa = nfa;
	}

	public static DFA getDfa() {
		return dfa;
	}

	public static void setDfa(DFA dfa) {
		ExpressionReader.dfa = dfa;
	}
}
// This line make it work