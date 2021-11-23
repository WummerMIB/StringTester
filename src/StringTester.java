// 2120717 Marco Mohr, 2123474 Marie Kapusta

import java.sql.Array;
import java.util.Iterator;
import java.util.Scanner;


public class StringTester {

	public static void main(String[] args) {
		String userInput = inputUserString();
		char userInputChar;
		
		Stack teStack = new Stack();
		teStack.push('a');
		teStack.push('b');
		teStack.pop();
			
		for (int i = 0; i < userInput.length(); i++) {
			userInputChar = userInput.charAt(i);
		}
	}

	public static String inputUserString() {	
		Scanner userInputScanner = new Scanner(System.in);
		String userInput = userInputScanner.nextLine();
		return userInput;
	}

}
