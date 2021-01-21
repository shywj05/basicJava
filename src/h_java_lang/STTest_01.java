package h_java_lang;

import java.util.StringTokenizer;

public class STTest_01 {

	public static void main(String[] args) {
		String text = "100,,,200,,300,400";
		
		String[] sp = text.split(",,");
		
		for(int i = 0; i < sp.length; i++){
			System.out.println(sp[i]);
		}
		System.out.println("========================================================");
		StringTokenizer st = new StringTokenizer(text, ",");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());//구분자를 여러개를 줄 수 있다.01
		}
		
		
		
	}

}
