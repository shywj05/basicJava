package j_collection;

import java.util.Hashtable;
import java.util.Map;

public class Collection_01 {
	public static void main(String[] args) {
		
		/*
		1. Collection Framework
			- 의미
				: collection - 다수의 데이터를 그룹으로 저장한다.
				: FrameWork - 표준화가 가능하다 
				
		2. 핵심 interface	
			- List
				: 순서가 있다
				: 데이터의 중복을 허용한다.
				: ArrayList, LinkedList, Stack...
				: 어디에 사용하며 좋을 까??
					- 대기자 명단 같은 거
			- Set
				: 순서가 없다.
				: 데이터의 중복을 비허용한다.
				: HashSet, TreeSet
					- 양의 정수의 집합
				
			- Map
				: 순서가 없다.
				: key와 value로 이루어져 있다.
				: key는 중복 비허용
				: value는 중복 허용
					- 우편번호, 지역번호
				
		3. List
			- Vector와 ArrayList
				: Vector는 동기화를 보장한다.
				
			- LikedList
			 	: 배열의 단점을 보완하기위해
			 	: 로드시키는데 오래걸려 / 다음 요소의 주소를 가지고 있다
			 		자신의 데이터와 다음 요소의 주소값을 데이터로 가지고 있다.
			
			- DoubleLikedList
			 	: 로드시키는데 더 오래걸려  / 이전 요소와 다음요소의 주소를 가지고 있다.
				: 자신의 데이터, 다음 요소의 주소, 이전요소의 주소를 데이터로 가지고 있다.
				
			- Stack과 Queue
				: Stack
				 	=> FILO, LIFO
				 	=> 저장 push()
				 	=> 추출(한번 꺼내면 사라진다) pop()
				 	=> 맨위의 객체를 반환 : peek()
				 	=> 주어진 객체 찾기 : search()
			 	: Queue
			 		=> FIFO
			 		=> 저장 offer()
			 		=> 추출 poll()
				
		4. Set
			- Set 인터페이스를 구현한 구현체 중 대표는 HashSet이다.
			- 내부적으로 HashMap으로 만들어져 있다.
			
		5. Map
			- key, value
			- HashMap은 HashTable의 최신버전임으로 HashTable은 사용하지 않는다.
		
		
		 */
		Map<String, String> tt = new Hashtable<>();

		
		
	
	
	}
}
