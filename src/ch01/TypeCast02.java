package ch01;

public class TypeCast02 {

	public static void main(String[] args) {
		
		byte b;
		int i = 414;
		float f = (float)123.456;  //123.456f로 나타내도됨
		
		b=(byte)i;
		System.out.println("int 414를 byte로 변환 : " + b);
		i=(int)f;
		System.out.println("float 123.456을 int로 변환: " + i);
		b=(byte)f;
		System.out.println("float 123.456을 byte로 변환: " + b);


	}

	
}
