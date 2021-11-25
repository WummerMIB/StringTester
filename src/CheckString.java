
public class CheckString {

	boolean rightOrWrong;
	Stack pushStack = new Stack();
	char[] check = pushStack.getStackArray();
	int stkPt = pushStack.getStkPtr();
	
	public boolean checkIfInputIsCorrect(char toCheckInput) {
		if (toCheckInput == '(' || toCheckInput == '[' || toCheckInput == '{') {
			pushStack.push(toCheckInput);
		}

		if (check[0] == 0 && toCheckInput == ')' || check[0] == 0 && toCheckInput == ']'
				|| check[0] == 0 && toCheckInput == '}') {
			rightOrWrong = false;
			return rightOrWrong;
		}

		if (toCheckInput == ')' || toCheckInput == ']' || toCheckInput == '}') {
			pushStack.pop();
		}
		if (check[0] == 0) {
			rightOrWrong = true;
			return rightOrWrong;
		}
		if (check[0] != 0) {
			rightOrWrong = false;
			return rightOrWrong;
		}
		return (Boolean) null;
	}

	public boolean getIsRightOrWrong() {
		return rightOrWrong;
	}
}
