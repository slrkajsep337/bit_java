package ch01;

public class ContinueTest {

	public static void main(String[] args) {
		
		for(int i=0; i<20; i++) {
			
//			if(i%2 != 0) {
//				System.out.println(i);
//			}  '!='인 조건은 좋지 않음
			
			if(i%2==0) {
				continue;
			}
			
			if(i%3==0) {
				continue;
			}
			
			System.out.println(i);
			
		}
	}

}
