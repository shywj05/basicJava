package j_collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
				
		Map<String, Integer> params = new HashMap<>();
		
		//이게 추가하는 거다
		params.put("이종찬", new Integer(100));
		params.put("길정우", 30);//autoboxing
		params.put("이미라", 200);
		
		
		
		//꺼내는거
		System.out.println(params.put("길정우", 150));
		int jung = params.get("길정우");//unboxing
		System.out.println(jung);
		//키를통해서 벨류값 가져온다.
		
		
		//지우는 거
		params.remove("이종찬");
		System.out.println(params);
		
		
	}

}
