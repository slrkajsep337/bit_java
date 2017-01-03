package ch01;

public class TypeCast {

	public static void main(String[] args) {
		// 암시적(implicity) casting ; 대입되는 값이 작은경우
		int i1 = 9999;
		long l1 = i1; //잘리지 않으니까 신경x 명시안해도 됨
		
		//명시적(explicity) casting ; 
		long l2 = 9234567898823L;  //int값을 벗어나면 L을 붙여 long임을 알려줘야함(작은값은 안붙여도됨)
		int i2 = (int)l2;  //long값이 잘리는걸 안다고 (int)명시
		
		System.out.println(l1+":"+i1);
		System.out.println(l2+":"+i2);

	}

}
