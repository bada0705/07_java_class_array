package step7_01.classArray;

/*
 * 
 * # 클래스 배열 생성
 * 
 * */

class Product {
	
	String name;
	int price;
	
}

public class ClassArrayEx01 {

	public static void main(String[] args) {

		// 클래스 배열 생성방법
		// 클래스명[] 객체명 = new 클래스명[배열의 크기];
		
		Product[] productList = new Product[3];
		
		productList[0] = new Product();
		productList[0].name = "기계식 키보드";
		productList[0].price = 45000;

		productList[1] = new Product();
		productList[1].name = "무소음 마우스";
		productList[1].price = 35000;
		
		Product product = new Product();
		product.name = "장패드";
		product.price = 10000;
		productList[2] = product;
		
		// 엘리먼트(배열의 요소) 조회
		for (int i = 0; i < productList.length; i++) {
			//System.out.println(productList[i]);
			System.out.println("name = " + productList[i].name);
			System.out.println("price = " + productList[i].price);
			System.out.println();
		}
		
		// [응용] 생각해보기
		Product[] temp1 = productList;			
		Product temp2   = productList[1];
		String temp3    = productList[1].name;
		int temp4       = productList[1].price;
		
		
		Product temp = productList[2]; 
		System.out.println("temp : " + temp);
		System.out.println("productList[2] : " + productList[2]);
		
		System.out.println("temp.name : " + temp.name);
		System.out.println("productList[2].name : " + productList[2].name);
		
		temp.name = "장패드1";
		System.out.println("temp.name : " + temp.name);
		System.out.println("productList[2].name : " + productList[2].name);
		
		productList[2].name = "장패드2";
		System.out.println("temp.name : " + temp.name);
		System.out.println("productList[2].name : " + productList[2].name);
		
	}

}
