import java.sql.Array;
import java.util.Iterator;
import java.util.Scanner;

// 2120717 Marco Mohr, 2123474 Marie Kapusta
public class StringTester {

	private static String userInput;
	private static char userInputChar;
	private static char[] stackArray;

	public static void main(String[] args) {

		inputUserString();
		for (int i = 0; i < userInput.length(); i++) {
			userInputChar = userInput.charAt(i);
			System.out.println(userInputChar);
		}

	}
	
	public static String inputUserString() {
		Scanner userInputScanner = new Scanner(System.in);
		userInput = userInputScanner.nextLine();
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
