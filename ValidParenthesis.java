public class ValidParenthesis {
	public static void main(String[] args) {
		// To avoid shadowing 
		java.util.Stack<Character> stt = new java.util.Stack();
		String st ="{(([]))}";
		char ch[] = st.toCharArray();
		for(char chh :ch) {
			if(chh=='{' || chh=='(' || chh=='[') {
				stt.push(chh);
			}
			else {
				char ct = stt.peek();
				if(chh=='}' && ct =='{') {
					stt.pop();
				}
				else if(chh==']' && ct =='[') {
					stt.pop();
				}
				else if(chh==')' && ct =='(') {
					stt.pop();
				}
				else {
					stt.push(chh);
				}
			}
		}
		if(stt.size()==0) {
			System.out.println("Parenthesis is valid");
		}
		else {
			System.out.println("Parenthesis is not valid");
		}

	}

}
