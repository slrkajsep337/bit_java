package ch01;

public class SwitchTest {

	public static void main(String[] args) {
		int month = 10;
		int days = 0;
		
		switch(month) {
		
		case 1 : {
			days=31;
			//break;
		}
		case 2 : {
			days=28;
			//break;
		}
		case 3 : {
			days=31;
			//break;
		}
		case 4 : {
			days=30;
			//break;
		}
		case 5 : {
			days=31;
			//break;
		}
		case 6 : {
			days=30;
			//break;
		}
		case 7 : {
			days=31;
			//break;
		}
		case 8 : {
			days=31;
			//break;
		}
		case 9 : {
			days=30;
			//break;
		}
		case 10 : {
			days=31;
			//break;
		}
		case 11 : {
			days=30;
			//break;
		}
		case 12 : {
			days=31;
			break;
		}	//마지막에 꼭 break를 넣어주어야함, 끝까지 다실행하기 때문에 
		    //밑의 case와 처리가 같은 경우에는 break를 생략할 수도 있다 
		default : {
			System.out.println("해당월이 없습니다.");
		}
			
		}
		
		System.out.println(month + "월은" + days + "까지 있습니다.");

	}

}


