package ch01;
import java.util.*;	

public class NHelloWorld01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("count:"); //개행시키지 않는다
		int count = scan.nextInt();
		
		int i = 0;
		while(i < count) {
			System.out.println("[" + (i+1) + "]" + "Hello Wolrd");
			i++;
		}
		
		

	}

}
