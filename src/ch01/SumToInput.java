package ch01;
import java.util.*;

public class SumToInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를입력하세요");
		int count = scan.nextInt();
		int sum=0;
		
		for(int i=1; i<=count; i++) {
			sum = sum+i;
		}
		
		System.out.println(sum);
		


	}

}
