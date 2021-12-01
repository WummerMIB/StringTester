// 2120717 Marco Mohr, 2123474 Marie Kapusta
import java.sql.Array;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.jar.Attributes.Name;

import javax.naming.AuthenticationException;

public class StringTester {

	public static void main(String[] args) {
		// boolean if you want to continue the program 
		boolean continueTest;
		// do the program while continueTest is true
		do {
			// Shows in Terminal what User should do
			System.out.println("Bitte geben sie hier ihre Formel ein:");
			// Saves user input in a String 
			String inputUserString = inputUserString();
			// calls Method to show if input is correct and saves answer if correct or wrong in String Variable
			String outputString = splittArraysIntoCharrs(inputUserString);
			// shows user if he made a right or wrong input
			System.out.println(outputString);
			// calls Method and asks if user wants to continue
			continueTest = checkIfUserWantsToContinue();
		// if user wants to stop than continueTest is made to false and than the program ends 
		} while (continueTest == true);
	}

	// method for user input in an String 
	public static String inputUserString() {
		// Scanner Method for Input
		Scanner userInputScanner = new Scanner(System.in);
		// writes text in String
		String userInput = userInputScanner.nextLine();
		// return user input
		return userInput;
	}

	// Method that split string into char and than pops push 
	// into Stack and checks if input was right or wrong
	public static String splittArraysIntoCharrs(String userInput) {
		// initialize an Object from Stack to call method pop, push and is empty
		Stack pushStack = new Stack();
		// for loop to split string into chars 
		for (int i = 0; i < userInput.length(); i++) {
			// saves individuell char from Input in an variable
			char userInputChar = userInput.charAt(i);

			// if input is (, [ or { than push it in the Stack
			if (userInputChar == '(') {
				pushStack.push(userInputChar);
			}
			if (userInputChar == '{') {
				pushStack.push(userInputChar);
			}
			if (userInputChar == '[') {
				pushStack.push(userInputChar);
			}

			// if user input is ),] or } than check if the Stack is empty because if yes than input is false
			// than if the Stack is not empty pop the last input and check if the returned char is right with the 
			// bracket for example () the pop returns ( so it is right if it returns [{ its wrong 
			if (userInputChar == ')') {
				boolean checkEmpty = pushStack.isEmpty();
				if (checkEmpty == true) {
					return "Klammern ungültig";
				} else {
					char test = pushStack.pop();
					if (test != '(') {
						return "Klammern ungültig";
					}
				}
			}
			if (userInputChar == ']') {
				boolean checkEmpty = pushStack.isEmpty();
				if (checkEmpty == true) {
					return "Klammern ungültig";
				} else {
					char test = pushStack.pop();
					if (test != '[') {
						return "Klammern ungültig";
					}
				}
			}
			if (userInputChar == '}') {
				boolean checkEmpty = pushStack.isEmpty();
				if (checkEmpty == true) {
					return "Klammern ungültig";
				} else {
					char test = pushStack.pop();
					if (test != '{') {
						return "Klammern ungültig";
					}
				}
			}
		}
		// at the end if Stack is empty than the input is correct but 
		// if there is something on the Stack than return wrong
		boolean checkEmpty = pushStack.isEmpty();
		if (checkEmpty == false) {
			return "Klammern ungültig";
		}
		if (checkEmpty == true) {
			return "Klammern gültig";
		}

		return "";
	}
	
	
	// Method to ask if user wants to continue
	public static boolean checkIfUserWantsToContinue() {
		// Shows in Terminal what User should do
		System.out.println("Drücken sie Ja/ja um weiter zu machen oder irgendeine Taste um zu beenden");
		// calls Method that allows user to make an input and save it an string
		String input = inputUserString();
		// boolean if user wants to continue
		boolean continueFormalCheck;
		// if input is ja or Ja than continue everything else ends the program
		if (input.equals("ja") || input.equals("Ja")) {
			return continueFormalCheck = true;
		} else {
			return continueFormalCheck = false;
		}
	}
}
