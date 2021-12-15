package step7_01.classArray;

import java.util.HashMap;

/*

	 # HashMap
	 
	- HashMap은 K(Key)에 V(Value)를 할당하는 방식으로 데이터가 저장된다.

*/

public class ClassArrayEx20 {

	public static void main(String[] args) {

		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		//HashMap<String, Integer> hmap2 = new HashMap<>(); // new 뒤쪽의 generic은 생략 가능
		
		// put(key, value) : HashMap의 key에 value를 할당한다. 
		// put()메서드는 존재하지 않는 key에 넣어주면 데이터가 입력되고 존재하는 key에 넣어주면 수정된다. 
		hmap.put("data1" , 1000);
		hmap.put("data2" , 2000);
		hmap.put("data3" , 3000);
		System.out.println(hmap);
		System.out.println("\n======================\n");
		
		hmap.put("data1" , 10000); // 데이터 수정
		hmap.put("data4" , 4000);  // 데이터 추가
		hmap.put("data5" , 5000);  // 데이터 추가
		
		System.out.println(hmap);
		System.out.println("\n======================\n");
		
		// size() : HashMap의 데이터개수를 반환한다.
		System.out.println(hmap.size());
		System.out.println("\n======================\n");
		
		// get(key) : HashMap의 key에 할당된 value를 얻어온다.
		System.out.println(hmap.get("data1"));
		System.out.println(hmap.get("data2"));
		System.out.println(hmap.get("data3"));
		System.out.println(hmap.get("data4"));
		System.out.println(hmap.get("data5"));
		System.out.println("\n======================\n");
		
		// keySet() : HashMap의 key만 얻어온다.
		System.out.println(hmap.keySet());
		
		for (String key : hmap.keySet()) {
			System.out.println(hmap.get(key));
		}
		System.out.println("\n======================\n");
		
		// remove(key) : HashMap의 key에 해당하는 값을 제거한다.
		hmap.remove("data2");
		hmap.remove("data3");
		System.out.println(hmap);
		
		hmap.clear();  // HashMap의 모든 데이터만 삭제
		hmap = null;   // HashMap자체를 삭제

		System.out.println("\n======================\n");
		
		
		
		// 웹에서 자주 사용하는 예시
		
		HashMap<String, Product> hmap2 = new HashMap<String, Product>();
		
		// 단순히 실습 데이터 생성
		for (int i = 0; i < 3; i++) {
			
			Product temp = new Product();
			temp.name = "데이터" + i;
			temp.price = 10000 * i;
			
			// put(식별자 , 객체);
			hmap2.put(temp.name , temp); 
			
		}
		
		System.out.println(hmap2.get("데이터0"));
		System.out.println(hmap2.get("데이터1"));
		System.out.println(hmap2.get("데이터2"));
		System.out.println();
		
		Product temp1 = hmap2.get("데이터0");
		Product temp2 = hmap2.get("데이터1");
		Product temp3 = hmap2.get("데이터2");
		
		System.out.println(temp1.name + " / " + temp1.price);
		System.out.println(temp2.name + " / " + temp2.price);
		System.out.println(temp3.name + " / " + temp3.price);
		
		System.out.println("\n======================\n");
		
		
		
		// 하나의 Map에 다른 데이터의 타입을 저장하는 예시
		HashMap<String, Object> hmap3 = new HashMap<String, Object>();
		
		hmap3.put("키1" , "문자열데이터");
		hmap3.put("키2" , 100);
		hmap3.put("키3" , new Product());
		
		System.out.println(hmap3.get("키1"));
		System.out.println(hmap3.get("키2"));
		System.out.println(hmap3.get("키3"));
		
		
	}

}

