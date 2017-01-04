package ch01;

public class WhileTest {

	public static void main(String[] args) {

		//1~10의 합을 구한다 
		int i = 1;
		int sum = 0;
		while(i<=10) {
			
			sum = sum+i; 
			i++;
		}
		System.out.println(sum);

	}

}
