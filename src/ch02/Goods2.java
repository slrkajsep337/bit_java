package ch02;

public class Goods2 {

	
	public static int countOfGoods;
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;  //필드에 private를 붙이는 것이 일반적 -> 정보 은닉
	
	public Goods2() {
		//System.out.println("기본 생성자 호출");
		Goods2.countOfGoods++; //클래스 내부에서 접근할 때는 클래스 이름(Goods2)을 생략하고 countOfGoods로 접근해돋 됨 
	} //기본 생성자, 내가 넣지 않아도 자동으로 넣어줌
	
//	public String getName() {
//		
//		return name;
//	}
	
//	public void setName(String name){
//						//파라미터 변수	
//		this.name = name; //두변수가 충돌하면 파라미터 변수가(인스턴스 변수보다) 우선한다
//		//객체안에 있는 자신을 this를 이용하여 표시 -> 파라미터 변수와 구분됨
//		
//	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		
		if(price<0){
			price = 0;
		}

		this.price = price;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	//return 값이 업고 parameter도 없는 method
	public void showInfo() {
		System.out.println("name: "+name+","+"price: "+price+"countStock: "+countStock+"countSold: "+countSold);
		
	}
	
	//return 값이 있고 parameter값도 있는 method 
	public double calcDiscountPrice(double rate) {
		double discountPrice = price*rate;
		return discountPrice;
	}

	
}
