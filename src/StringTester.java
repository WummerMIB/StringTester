// 2120717 Marco Mohr, 2123474 Marie Kapusta

import java.sql.Array;
import java.util.Iterator;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class StringTester {

	public static void main(String[] args) {
		boolean continueTest;
		do {
			System.out.println("Bitte geben sie hier ihre Formel ein:");
			String inputUserString = inputUserString();
			String outputString = splittArraysIntoCharrs(inputUserString);
			System.out.println(outputString);
			continueTest = checkIfUserWantsToContinue();
		} while (continueTest == true);
	}

	public static String inputUserString() {
		Scanner userInputScanner = new Scanner(System.in);
		String userInput = userInputScanner.nextLine();
		return userInput;
	}

	public static String splittArraysIntoCharrs(String userInput) {
		Stack pushStack = new Stack();
		for (int i = 0; i < userInput.length(); i++) {
			char userInputChar = userInput.charAt(i);

			if (userInputChar == '(') {
				pushStack.push(userInputChar);
			}
			if (userInputChar == '{') {
				pushStack.push(userInputChar);
			}
			if (userInputChar == '[') {
				pushStack.push(userInputChar);
			}

			if (userInputChar == ')') {
				boolean checkEmpty = pushStack.isEmpty();
				if (checkEmpty == true) {
					return "Klammern ung�ltig";
				} else {
					char test = pushStack.pop();
					if (test != '(') {
						return "Klammern ung�ltig";
					}
				}
			}
			if (userInputChar == ']') {
				boolean checkEmpty = pushStack.isEmpty();
				if (checkEmpty == true) {
					return "Klammern ung�ltig";
				} else {
					char test = pushStack.pop();
					if (test != '[') {
						return "Klammern ung�ltig";
					}
				}
			}
			if (userInputChar == '}') {
				boolean checkEmpty = pushStack.isEmpty();
				if (checkEmpty == true) {
					return "Klammern ung�ltig";
				} else {
					char test = pushStack.pop();
					if (test != '{') {
						return "Klammern ung�ltig";
					}
				}
			}
		}
		boolean checkEmpty = pushStack.isEmpty();
		if (checkEmpty == false) {
			return "Klammern ung�ltig";
		}
		if (checkEmpty == true) {
			return "Klammern g�ltig";
		}

		return "";
	}

	public static boolean checkIfUserWantsToContinue() {
		System.out.println("Dr�cken sie Ja/ja um weiter zu machen oder irgendeine Taste um zu beenden");
		String input = inputUserString();
		boolean continueFormalCheck;
		if (input.equals("ja") || input.equals("Ja")) {
			return continueFormalCheck = true;
		} else {
			return continueFormalCheck = false;
		}
	}
}
