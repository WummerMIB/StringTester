import java.sql.Array;
import java.util.Iterator;
import java.util.Scanner;

// 2120717 Marco Mohr, 2123474 Marie Kapusta
public class StringTester {

	
	
	

	public static void main(String[] args) {
		String userInput = inputUserString();
		char userInputChar;
		
		for (int i = 0; i < userInput.length(); i++) {
			userInputChar = userInput.charAt(i);
			if ('[' == userInputChar) {
				pushInput(userInputChar);
			} else if (']' == userInputChar) {
				popInput();
			}
			if ('(' == userInputChar) {
				pushInput(userInputChar);
			} else if (')' == userInputChar) {
				popInput();
			}
			if ('{' == userInputChar) {
				pushInput(userInputChar);
			} else if ('}' == userInputChar) {
				popInput();
			}
		}
	}

	public static void pushInput(char userInputChar) {
		Stack stackBracketOpen = new Stack();
		stackBracketOpen.push(userInputChar);
	}

	public static void popInput() {
		Stack stackBracketOpen = new Stack();
		stackBracketOpen.pop();
	}

	public static String inputUserString() {
		
		Scanner userInputScanner = new Scanner(System.in);
		String userInput = userInputScanner.nextLine();
		return userInput;
	}

	public static String getUserInput() {
		return userInput;
	}

	public static void setUserInput(String userInput) {
		StringTester.userInput = userInput;
	}

	public static char getUserInputChar() {
		return userInputChar;
	}

	public static void setUserInputChar(char userInputChar) {
		StringTester.userInputChar = userInputChar;
	}

	public static char[] getStackArray() {
		return stackArray;
	}

	public static void setStackArray(char[] stackArray) {
		StringTester.stackArray = stackArray;
	}
}
