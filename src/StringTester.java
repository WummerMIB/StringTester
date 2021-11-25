// 2120717 Marco Mohr, 2123474 Marie Kapusta

import java.sql.Array;
import java.util.Iterator;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class StringTester {

	public static void main(String[] args) {
		Stack pushStack = new Stack();
		boolean continueTest;
		do {
		System.out.println("Bitte geben sie hier ihre Formel ein:");
		String inputUserString = inputUserString();
		String outputString = splittArraysIntoCharrs(inputUserString, pushStack);
		System.out.println(outputString);
		continueTest = checkIfUserWantsToContinue();
		}while(continueTest == true);
	}

	public static String inputUserString() {
		Scanner userInputScanner = new Scanner(System.in);
		String userInput = userInputScanner.nextLine();
		return userInput;
	}

	public static String splittArraysIntoCharrs(String userInput, Stack pushStack) {

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
			boolean firstInput = pushStack.isEmpty();
			if (firstInput == true && userInputChar == ')' || firstInput == true && userInputChar == ']'
					|| firstInput == true && userInputChar == '}') {
				return "Es ist Falsch";
			}

			if (userInputChar == ')') {
				char a = pushStack.pop();
				boolean checkEmpty = pushStack.isEmpty();
				if (a == '[' || a == '{') {
					return "Es ist Falsch";
				} else if (checkEmpty == true) {
					return "Es ist Richtig";
				}
			}
			if (userInputChar == ']') {
				char a = pushStack.pop();
				boolean checkEmpty = pushStack.isEmpty();
				if (a == '(' || a == '{') {
					return "Es ist Falsch";
				} else if (checkEmpty == true) {
					return "Es ist Richtig";
				}
			}
			if (userInputChar == '}') {
				char a = pushStack.pop();
				boolean checkEmpty = pushStack.isEmpty();
				if (a == '(' || a == '[') {
					return "Es ist Falsch";
				}
				if (checkEmpty == true) {
					return "Es ist Richtig";
				}
			}
		}
		boolean finalInput = pushStack.isEmpty();
		if (finalInput == false) {
			return "Es ist Falsch";
		}else if(finalInput == true) {
			return "Bitte geben sie eine Formel ein";
			}
		return "";
	}

	public static boolean checkIfUserWantsToContinue() {
		System.out.println("Dr�chen sie Ja/ja um weiter zu machen oder irgendeine Taste um zu beenden");
		String input = inputUserString();
		boolean continueFormalCheck;
		if (input.equals("ja") || input.equals("Ja")) {
			return continueFormalCheck = true;
		} else {
			return continueFormalCheck = false;
			
		}

	}
}
