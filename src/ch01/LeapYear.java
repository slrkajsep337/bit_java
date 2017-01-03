package ch01;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2000;
		
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					System.out.println("윤년 입니다!");	 //4로 나누어지고 100으로 나누어지고 400으로도 나누어짐
				}
				else {
					System.out.println("윤년 입니다!");	 //4로 나누어지고 100으로 나누어지고 400으로는 안나누어짐
				}
			}
			else{
				System.out.println("윤년 입니다!");	 //4로 나누어지고 100으로는 안나누어짐
			}
		}
		else { 
			System.out.println("윤년이 아닙니다!");  //4로 안나누어짐
		}
		
		
	}

	
}

