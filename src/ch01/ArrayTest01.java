package ch01; 

public class ArrayTest01 {

	public static void main(String[] args) {
		
		int[] a = new int[4];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		//a[4] = 50; 예외발생(ArrayIndexOutOfBound)
		
		int sum = 0;
		int length = a.length;
		
		for(int i=0; i<length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
		
		//확장 for문(for~each문)
		for(int value : a) { //배열 a의 모든 인덱스를 범위로 가짐 
			System.out.println(value);
		}

	}

}
