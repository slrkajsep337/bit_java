package ch02;

public class GoodsApp {
	static int i;
	
	public static void main(String[] args) {
			
		Goods camera = new Goods();
		
		//camera.name = "nikon";  private이라 외부에서 접근x
		//protected는 같은 package에서 접근 가능, 자식 클래스(다른 package에 있어도)에서 접근 가능 
		camera.price = 4000000;
		camera.countSold = 100;
		camera.countStock = 50;
		
		
		

	}

}
