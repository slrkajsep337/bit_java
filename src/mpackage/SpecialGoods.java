package mpackage;

import ch02.Goods;  //crtl+shift+O

public class SpecialGoods extends Goods{

	void test() {
		//name = "canon"; private은 자식에서도 접근할 수 없기 때문에 오류가 난다.
		price = 20000; //protected는 자식에서 접근할 수 있다.
		countStock = 20; //public은 다된다
		
	}

}
