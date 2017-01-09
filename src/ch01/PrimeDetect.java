package ch01;
import java.util.*;

public class PrimeDetect {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("소수인지 판단할 숫자: ");

		int divisor = 2;
		int num = scan.nextInt();
		boolean isPrime = true;
		int result=0;
		
		while(1<num) {
			
			result=(num/divisor);
			if(result==0) {
				System.out.println(num + "은 소수가 아닙니다.");
				break;
			}
			else {
				System.out.println(num + "은 소수입니다.");
				break;
			}
		}
	//1트루 0falseo
		
//		if (isPrime = true) {
//			System.out.println(num + "은 소수입니다.");
//		} else {
//			System.out.println(num + "은 소수가 아닙니다.");
//
//		}

	}

}
