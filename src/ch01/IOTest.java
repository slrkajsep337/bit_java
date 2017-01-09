package ch01;
import java.util.*;	


public class IOTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );

		int count1 = scanner.nextInt();
		int count2 = scanner.nextInt();
		//String str = scanner.next();
		
		System.out.println(count1 + ":" + count2);
		
		// Q: 아래 while 반복문을  사용하여  “Hello World”를 입력 받은 수 만큼 출력 하세요.

		scanner.close();
	}

}