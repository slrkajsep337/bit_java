package ch02;

public class GoodsApp2 {

	public static void main(String[] args) {
		
		Goods2 goods = new Goods2(); //생성자 실행 
		
//		goods.price = -1; 객체 변수에 바로 접근하면 잘못된 데이터를 세팅할 가능성이 있음
		goods.setPrice(-1);
		System.out.println(goods.getPrice());
		

		//static 변수 테스트
		System.out.println(Goods2.countOfGoods);
		//static이 붙어있는 변수를 사용할 때는 클래스 이름을 사용하여 접근해야 한다. 
		
		Goods2 goods1 = new Goods2();
		System.out.println(Goods2.countOfGoods); 
		
		Goods2 goods2 = new Goods2();
		System.out.println(Goods2.countOfGoods);
		
		Goods2 goods3 = new Goods2();
		System.out.println(Goods2.countOfGoods);
		
		goods2.setName("tv");
		goods2.setPrice(1000);
		goods2.setCountStock(12);
		goods2.setCountSold(15);
		
		goods2.showInfo();
		double discountprice = goods3.calcDiscountPrice(0.6);
		System.out.println(discountprice);
		
	}

}
