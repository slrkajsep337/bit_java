package ch01;

public class ArrayTest04 {

	public static void main(String[] args) {
		
		
		Student s1 = new Student();
		Student[] students = new Student[3]; //배열 버전
		
		for(Student s : students) {  //for(자료형 생성한변수 : )
			System.out.println(s);
		}
		
		System.out.println("======================");
		students[0] = new Student(); //객체를 생성함 
		students[0].name = "둘리"; //객체를 생성했기 때문에 "둘리"를 삽입할 수 있음
		
		for(Student s : students) {  //for(자료형 생성한변수 : )
			if(s!=null) 
				System.out.println(s.name);
			
		}

	}

}
