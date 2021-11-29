import java.util.Iterator;

public class Stack {

	char stackArray[] = new char[100];
	private int stkPtr = 0;

	public char pop() {
		System.out.println(stkPtr);
		stkPtr--;
		System.out.println(stkPtr);
		char bracketData = stackArray[stkPtr];
		stackArray[stkPtr] = 0;
		return bracketData;
	}

	public void push(char c) {
		stackArray[stkPtr] = c;
		stkPtr++;
	}
	
	public boolean isEmpty() {
		if (stackArray[0] == 0) {
			return true;
		}
		return false;
	}

}
