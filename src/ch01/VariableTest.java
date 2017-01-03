package ch01;

public class VariableTest {
	int number;
	
	public void test() {
		int j = number + 10; //인스턴스 변수는 초기화 된다
	}

	public static void main(String[] args) {
		int i;
		
		boolean isHoliday = false;
		char c = 'A'; //문자리터럴
		char c1 = 65; //값(아스키코드)
		byte b = 10;
		short s = 20; 
		int k = 10; 
		long l = 123456789;
		float f = 3.14f;
		double d = 3.14;
		
		System.out.println(isHoliday);
		System.out.println(c);
		System.out.println(c1);
		System.out.println(b);
		System.out.println(s);
		System.out.println(k);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		//*상수
		final int MAX_SPEED = 20;//final은 변수를 상수로 바꿔주는 자료형(max_speed의 값을 바꿀 수 없음)
								//클래스 앞에도 final을 사용할 수 있다 
		//MAX_SPEED = 200;  -> error
		
		
		//*String 객체 확인
		String str = new String ("Hello"); //new는 새로 만들 때만 사용한다
		System.out.println(str);
		
		//*string객체를 리터럴로 사용하기
		String str1 = "Hello";
		System.out.println(str1);
	}

}
