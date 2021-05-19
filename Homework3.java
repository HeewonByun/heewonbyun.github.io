package com.heewon.chapter4;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int a = 0;

		int b = 0;

		String op = null;

		int result = 0;

		System.out.println("피연산자를 입력하세요.");

		int c = scanner.nextInt();

		System.out.println("연산기호를 입력하세요.");

		String str = null;

		scanner.nextLine();

		System.out.println("피연산자를 입력하세요.");

		int d = scanner.nextInt();

		if (op.equals("+")) {

			System.out.println(a + b);

		} else if (op.equals("-")) {

			System.out.println(a - b);

		} else if (op.equals("*")) {

			System.out.println(a * b);

		} else if (op.equals("/")) {

			System.out.println(a / b);

		} else if (op.equals("%")) {

			System.out.println(a % b);

		} else {

			System.out.println("입력가능한 연산기호를 입력하세요.");

		}

	}

}
