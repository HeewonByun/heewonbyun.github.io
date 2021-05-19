package com.heewon.chapter4;

public class HomeworkQ2 {

	public static void main(String[] args) {
		int dan;
		int i;

		for (dan = 2; dan <= 9; dan++) {
			if (dan % 2 != 0)
				continue;
			for (i = 1; i <= 9; i++) {
				System.out.println(dan + " X " + i + " = " + dan * i);
			}
			System.out.println("-----------");
		}
	}

}
