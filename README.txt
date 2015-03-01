README.txt

@author Felipe Moreira Moura
@NUID	59797811
@course	Computer Engineering
@class	CSCE 428 - Project 01: Regular Expression

Files:
	* MakeFile
	* Java classes
		* NFA.java
		* DFA.java
		* State.java
		* RegularExpression.java
		* ExpressionReader.java
		* ValidateExpression.java

Compiling:
	* To compile it just use "make", it will compile all java files with javac.

Regular Expression to NFA:
	* The following functions in RegularExpression.java converts a regular Expression to NFA:
		- RegularExpression.generateNFA(String)
		- RegularExpression.Priority(char, Character)
		- RegularExpression.doOperation()
		- RegularExpression.star()
		- RegularExpression.concatenation()
		- RegularExpression.union()
		- RegularExpression.pushStack(char)
		- RegularExpression.AddConcat(String)
		- RegularExpression.isInputCharacter(char)



NFA to DFA:
	* The following functions in RegularExpression.java converts a NFA to DFA:
		- RegularExpression.generateDFA(NFA)
		- RegularExpression.removeEpsilonTransition()
		- RegularExpression.moveStates(Character, Set<State>, Set<State>)



DFA to Valid Expression:
	* The following functions in ValidateExpression.java converts a DFA to a Valid or invalid expressoin:
		- ValidateExpression.validate(DFA, String)



Runing:
	* You can run the program by typing it in the standard I/O.
	* You can run the program by FILE REDIRECTION only if the file is in the following order :
		~Regular Expression (ONLY 1)
		~Strings (as much as you want)



Results:
	* Wait about 1 seconds for small regular expression to show the results. If the string is valid or not
		* If the string is valid the program will output "yes"
		* If the string is Invalid the program will output "no"




