package ch01;
import java.util.*;

public class DoWhileTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum=0;
		int value=0;
		
		do {
			System.out.println("숫자입력[0 to Quit] > ");
			value=scan.nextInt();
			sum+=value;
		}
		while (value!=0);


	}

}
