package com.heewon.chapter4;

public class Homework2 {

	public static void main(String[] args) {
	
		int floor = 2;
		String screen;
				
		switch(floor){
		
			case 1:	screen = "1층은 약국";
				break;
				
			case 2: screen = "2층은 정형외과";
				break;
			
			case 3: screen = "3층은 피부과";
				break;
				
			case 4: screen = "4층은 치과";
				break;
			
			case 5: screen = "5층은 헬스클럽";
				break;
			
			default: screen = "오류";
				
		}		
		System.out.println( screen + "입니다.");
	}

}
