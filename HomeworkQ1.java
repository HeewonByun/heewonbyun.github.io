package com.heewon.chapter4;

public class HomeworkQ1 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		int result = 0;
		
		if(operator == '+') {
			result = num1 + num2;
		}
		else if(operator == '-') {
			result = num1 - num2;
		}
		else if(operator == '*') {
			result = num1 * num2;
		}
		else if(operator == '/') {
			result = num1 / num2;
		}
		else {
			System.out.println("오류입니다");
			return;
		}
		System.out.println("답은 " + result + "입니다");
	
		
	}

}
