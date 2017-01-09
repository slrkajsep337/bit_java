package mpackage;

import ch02.Goods;

public class Apps {
	
	public static void main(String[] args) {
		
		Goods camera = new Goods();
		 
		//camera.price = 4000000;  //다른 패키지라서 오류
		//camera.countSold = 100;	 //다른 패키지라서 오류
		camera.countStock = 50;
			

	}

}
