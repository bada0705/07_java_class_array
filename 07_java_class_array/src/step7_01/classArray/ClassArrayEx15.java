package step7_01.classArray;

// # 생성자를 이용한 멤버 변수 초기화

class Fruit {
	
	String name;
	int price;
	
	// [참고] 생성자 생성 단축키 
	// 좌측상단 Source태그 > generate Constructor using fileds.. > modifier package클릭 > generate
	Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	void printData() {
		System.out.println(this.name + "( " + this.price + "원 )");
	}
	
}


public class ClassArrayEx15 {

	public static void main(String[] args) {

		// 생성자를 이용한 멤버변수 초기화
		Fruit fruit1 = new Fruit("사과", 1200);
		fruit1.printData();
		
		Fruit fruit2 = new Fruit("수박", 12000);
		fruit2.printData();
		
		// 생성자의 파라메타 개수가 일치하지 않으므로 Error
		// Fruit fruit3 = new Fruit();
		
	}

}
