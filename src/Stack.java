import java.util.Iterator;

public class Stack {

	char stackArray[] = new char[5];
	private int stkPtr = 0;

	public char pop() {
		stkPtr--;
		char bracketData = stackArray[stkPtr];
		bracketData = 0;
		stackArray[stkPtr] = bracketData;
		return bracketData;
	}

	public void push(char c) {		
		stackArray[stkPtr] = c;
		stkPtr++;
	}


	public int getStkPtr() {
		return this.stkPtr;
	}
}
