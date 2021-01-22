package j_collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class StackQueueTest {

	public static void main(String[] args) {
		
		Stack<String> st = new Stack<>();//자바에서는 거의 Stack 구조를 많이 사용한다.
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		while(!st.empty()){
			System.out.println(st.pop());//먼저들어간 놈이 나중에 나온다.
		}
		
		System.out.println("=============================================");
		
		LinkedList<String> qu = new LinkedList<>();
		
		qu.offer("0");
		qu.offer("1");
		qu.offer("2");
		
		//꺼내는건 없을 때 까지 돌려야 한다. 그래스 while
		while(!qu.isEmpty()){
			System.out.println(qu.poll());
		}
		
		
		
	}

}
