package ch01;

public class Relation {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		System.out.println(10 < 3);
		System.out.println(10 > 3);
		System.out.println(10 >= 3);
		System.out.println(10 <= 3);
		System.out.println(10 == 3);
		System.out.println(10 != 3);
		
		System.out.println((10 > 3) && (10 < 3)); //헷갈리면 괄호로 묶기
		System.out.println((10 < 3) || (10 > 3));
		System.out.println(!(10 > 3));
		
		
		boolean x = 7 == 9; 
	}

}
