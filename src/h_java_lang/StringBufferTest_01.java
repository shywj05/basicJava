package h_java_lang;

public class StringBufferTest_01 {

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder("a");
//		str += "a";
		
		/*
		
		Stirng str = "a";
		
		StrinfBuffer sb = new StringBuffer(str).append("a").toString();
		
		*/
//		long start = System.currentTimeMillis();
//		for(int i = 0; i < 300000; i++){
//			str += "a";
//		}
//		long end = System.currentTimeMillis();
//		
//		System.out.println(end-start);
		
		long start = System.currentTimeMillis();
		for(int i = 0; i < 300000000; i++){
			str.append("a");
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
		
	}

}
