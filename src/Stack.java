import java.util.Iterator;

public class Stack {

	char stackArray[] = new char[5];
	private int stkPtr = 0;

	public char pop() {
		char bracketData = stackArray[stkPtr];
		bracketData = 0;
		stackArray[stkPtr] = bracketData;
		stkPtr--;
		return bracketData;
	}

	public void push(char c) {
		System.out.println(c);
		stackArray[stkPtr] = c;
		stkPtr++;
	}

	public void peek() {
		for (char i : stackArray) {
			char b = (char) (i + '0');
			System.out.println(b);
		}
	}

	public int getStkPtr() {
		return this.stkPtr;
	}
}
