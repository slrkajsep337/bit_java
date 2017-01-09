package ch01;

import java.util.Scanner;

public class SumToInput2 {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를입력하세요");
		
		if(args.length==0) {
			System.out.println("usage: java SumToInput2 [number]");
			return;
		}
		
		System.out.println(args[0]);
	
		
		int number = Integer.parseInt(args[0]); //parseInt;파라미터로 string이 들어오면 int값으로 리턴해주는 함수
		//int number = args[0]  ->오류 args는 String 타입이기 때문
		int n = 10;
		String s = "" + n; //->이러한 방법1으로 int를 string으로 바꿔줄 수 있다. ("" + int)
		String s1 = String.valueOf(n); //int->string 하는 방법2, 많이씀
		
		int sum = 0;

		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}

		System.out.println(sum);
		
		

	}

}
