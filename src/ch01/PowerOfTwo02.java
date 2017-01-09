package ch01;
import java.util.*;

public class PowerOfTwo02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in );

		int result = 1;
		System.out.print("승수: ");

		int pow = scan.nextInt();
		
		// Q: 아래 for문을 작성하시오.
		for(int i=pow; i>0; i--) {
			result=result*2;
			
		}
		
		
		System.out.println("2의 " + pow + "제곱은 " + result + "입니다.");


	}

}
