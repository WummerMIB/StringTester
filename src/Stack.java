// 2120717 Marco Mohr, 2123474 Marie Kapusta
import java.util.Iterator;

public class Stack {
	
	// Is Stack in there we push brackets and pop them
	char stackArray[] = new char[1000];
	// Pointer for the Stack
	private int stkPtr = 0;
	
	// pop Method for the Stack that removes the top Element from Stack
	public char pop() {
		// decrease pointer by one 
		stkPtr--;
		// saves characters in the array to which the 
		// pointer points and writes them into a variable
		char bracketData = stackArray[stkPtr];
		// In Java if you have an empty column its zero so if we make it to zero we empty it  
		stackArray[stkPtr] = 0;
		// return char that was in Stack that was pointed at
		return bracketData;
	}
	// push Method for the Stack that adds an Element at the Top
	public void push(char c) {
		// Writes the passed char variable to the currently shown array element
		stackArray[stkPtr] = c;
		// in the end the Pointer gets increased by one to show the next empty Stack Element
		stkPtr++;
	}

	// Method that looks if the Stack is empty
	public boolean isEmpty() {
		// because you can only push or pop one think add the top if the 
		// top is empty than return true
		if (stackArray[0] == 0) {
			return true;
		}
		return false;
	}

}
