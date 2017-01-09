package ch02;

public class Swap {

	public static void main(String[] args) {
		/*코드가 실행되지 않는 이유:stack 때문이다 
		 * 
		 */
		
		int i = 10;
		int j = 20;
		
		System.out.println(i+ ":" + j);
		
		swap(i, j);
		
		System.out.println(i+ ":" + j);
		

	}
	
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
