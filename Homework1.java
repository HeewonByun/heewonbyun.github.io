package com.heewon.chapter4;

 // p100. 성적 학점 부여 문제 풀이

public class Homework1 {
	public static void main(String[] args) {
		
		int score = 99;
		char grade;
		
		if(score >= 90) {
			System.out.println(grade = 'A'); 
		}
		else if(score >= 80){
			System.out.println(grade = 'B');
		}
		else if(score >= 70){
			System.out.println(grade = 'C');
		}
		else if(score >=60){
			System.out.println(grade = 'D');
		}
		else{
			System.out.println(grade = 'F');
		} 
		
		
	}
}

