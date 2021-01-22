package j_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
//		for(int i = 0; i < 10; i++){
//			int ran = (int)(Math.random()*5);
//			set.add(ran);//autoBoxing 떄문에 이렇게 써도 된다.
//			boolean re = set.add(ran);
//			System.out.println(re);
//		}
//		System.out.println(set);
		
		//1.로또 번호 6개 저장하기 1~45번
		while(set.size() < 6){
			int ran = (int)(Math.random()*45+1);
			set.add(ran);
		}
		System.out.println(set);
		
		List<Integer> list = new ArrayList<>(set);
		
//		list.addAll(set);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}

}
