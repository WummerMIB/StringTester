// 2120717 Marco Mohr, 2123474 Marie Kapusta

import java.sql.Array;
import java.util.Iterator;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class StringTester {

	public static void main(String[] args) {
		String userInput = inputUserString();
		CheckString checked = new CheckString();
		char userInputChar = 0;
		splittArraysIntoCharrs(userInputChar, userInput, checked);
		if (checked.getIsRightOrWrong() == true) {
			System.out.println("Ihr Eingegebener String ist Richtig");
		}
		if (checked.getIsRightOrWrong() == false) {
			System.out.println("Ihr Eingegebener String ist Falsch");
		}

	}

	public static String inputUserString() {
		Scanner userInputScanner = new Scanner(System.in);
		String userInput = userInputScanner.nextLine();
		return userInput;
	}

	public static void splittArraysIntoCharrs(char userInputChar, String userInput, CheckString checked) {
		for (int i = 0; i < userInput.length(); i++) {
			userInputChar = userInput.charAt(i);
			if (userInputChar == '(' || userInputChar == ')' || userInputChar == '[' || userInputChar == ']'
					|| userInputChar == '{' || userInputChar == '}') {				
				checked.checkIfInputIsCorrect(userInputChar);
			}
		}
	}
}
