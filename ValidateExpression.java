public class ValidateExpression {

	// Return if the string is valid with regular expression or not
	public static boolean validate(DFA dfa, String s) {
		
		State state = dfa.getDfa().getFirst();
		
		// Especial case when is empty string
		if (s.compareTo("e") == 0) {
			// If first is state is accept state, so empty string is valid
			if (state.isAcceptState()) 	{	return true; 	}
			else						{	return false; 	}
			
		} else if (dfa.getDfa().size() > 0) {	

			for (int i = 0 ; i < s.length(); i++) {
				// No transition, so break the DFA
				// and it's invalid string
				if (state == null) { break; }
				
				// Get the transition with the input
				state = state.getNextState().get(s.charAt(i)).get(0);
			}
			
			// Is valid string
			if (state != null && state.isAcceptState()) {	return true;	} 
			// is INvalid string
			else 										{	return false;	}
		
		} else {
			return false;
		}
		
	}
}
// This line make it work