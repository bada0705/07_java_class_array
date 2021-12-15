package step7_01.classArray;

/*
 * 
 * 접근 제어자 : public , private + getter/setter
 * 
 * */

class ModifierTest {
	
	private int a;
	public int b;
	
	// private 변수를 클래스 외부로 꺼내주는 메서드 getter
	int getA() { // 변수명 앞에 get을 추가하여 메서드의 이름을 지정한다.
		return this.a;
	}
	
	// private 변수를 클래스 외부에서 수정하는 메서드 setter
	void setA(int a) { // 변수명 앞에 set을 추가하여 메서드의 이름을 지정한다.
		this.a = a;
	}
	
}

class GetterSetterTest {
	
	private String productCode;
	private String productName;
	private int productPrice;
	private String managerCode;
	private String managerName;
	
	// getter & setter 생성 단축키
	// 좌측 상단 Source > Generate Getters and Getters > selectAll > Generate
	
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getManagerCode() {
		return managerCode;
	}
	public void setManagerCode(String managerCode) {
		this.managerCode = managerCode;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
}



public class ClassArrayEx17 {

	public static void main(String[] args) {
		
		ModifierTest obj = new ModifierTest();
		
		// private 변수는 클래스 외부에서 접근 불가
		// obj.a = 1000;
		// System.out.println(obj.a);
		
		obj.b = 2000;
		System.out.println(obj.b);
		
		obj.setA(1000);					//setter를 이용하여 private 변수의 값을 수정한다.
		System.out.println(obj.getA()); //getter를 이용하여 private 변수의 값을 꺼내온다.
		

	}

}
