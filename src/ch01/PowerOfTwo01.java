package ch01;
import java.util.*;


public class PowerOfTwo01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in );

		int result = 1;
		System.out.print("승수: ");

		int pow = scan.nextInt();
		int i=0;
		// Q: 아래 while 반복문을 작성하시오.
		
		while(i<pow) {
			//i<2
			result = result*2;
			i++;
			
		}
		
		
		System.out.println("2의 " + pow + "제곱은 " + result + "입니다.");


	}

}
