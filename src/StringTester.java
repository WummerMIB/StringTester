// 2120717 Marco Mohr, 2123474 Marie Kapusta

import java.sql.Array;
import java.util.Iterator;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class StringTester {
	private static boolean continueFormalCheck;
	
	public static void main(String[] args) {
		continueFormalCheck = true;
		while (continueFormalCheck == true) {
			System.out.println("Bitte geben sie ihre zu Überprüfende Formel ein:");
			String userInput = inputUserString();
			CheckString checked = new CheckString();
			char userInputChar = 0;
			splittArraysIntoCharrs(userInputChar, userInput, checked);
			if (checked.getIsRightOrWrong() == true) {
				System.out.println("Sie haben die Klammern richtig gesetzt");
				checkIfUserWantsToContinue(continueFormalCheck);
			}
			if (checked.getIsRightOrWrong() == false) {
				System.out.println("Sie haben die Klammern falsch gesetzt");
				checkIfUserWantsToContinue(continueFormalCheck);
			}
			System.out.println(continueFormalCheck);
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

	public static void checkIfUserWantsToContinue(boolean continueFormalCheck) {
		System.out.println("Drüchen sie Ja/ja um weiter zu machen oder irgendeine Taste um zu beenden");
		String input = inputUserString();
		if (input.equals("ja") || input.equals("Ja")) {
			continueFormalCheck = true;
		}else {
			continueFormalCheck = false;
		}
		
	}
}
