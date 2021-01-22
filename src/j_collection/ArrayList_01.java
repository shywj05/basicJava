package j_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList_01 {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(new Integer(5));
		list1.add(new Integer(2));
		list1.add(new Integer(3));
		list1.add(new Integer(1));
		list1.add(4);//autoBoxing
		
		List<Integer> list2 = new ArrayList<>(list1.subList(1, 3));//포함 뒤에는 미포함
		System.out.println(list1);
		System.out.println(list2);
		
		System.out.println(list1.containsAll(list2));//객체를 모두 가지고 있다.
		
		//5,2,3,1,4
		//5,50,2,3,1,4
		list1.add(1,50);
		System.out.println(list1);
		
		list1.add(6, 90);
		System.out.println(list1);
		
//		list1.add(7, 90); //터진다. 사이즈를 먼저확인하고 객체바로 뒤번호 부터 들어갈 수 있다.
		
		//지우는거~
		Integer i1 = list1.remove(2);
		System.out.println(i1);
		System.out.println(list1);
		
		System.out.println(list1.set(2,900));//몇번째를 뭐로 바꿀거냐? 반환타입 인트
		//바꾼거 이전 게 나온다 
		System.out.println(list1);
		
		//메서드들 한 번씩 써봐야 한다. 그래야 꺼내서 쓴다
		
		//collection에서는 정렬을 지원해준다. 단, 리스트만 된다.
		Collections.sort(list1);
		System.out.println(list1);
		
		
		
		
		
	}

}
