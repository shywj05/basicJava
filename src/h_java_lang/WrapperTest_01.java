package h_java_lang;

import com.sun.imageio.plugins.common.I18N;
import com.sun.org.apache.xpath.internal.operations.Equals;

public class WrapperTest_01 {

	public static void main(String[] args) {

		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);

		System.out.println(i1 == i2);// false, i1과 i2의 주소값을 비교
		System.out.println(i1.equals(i2));// false 아니네..왜지
		//i1의 주소에 있는 값과 i2의 주소에 있는 값(문자열)을 비교하면 True 
		
		System.out.println(i1); // 주소가 나오겠찌? 아니네..왜 100이 나오지

		System.out.println(Integer.MAX_VALUE);//
		System.out.println(Integer.MIN_VALUE);//

		System.out.println(Integer.SIZE);

		// JDK1.8
		// Integer.BYTES

		Integer[] in = new Integer[3];

		in[0] = new Integer(10);
		in[1] = new Integer(20);
		in[2] = 30; // auto-boxing,

		// Integer in2 = in[1];
		int in2 = in[1]; // 이것도 된다 unBoxing

		Object[] obj = new Object[1];
		obj[0] = 10;// 오토박싱 + 업캐스팅

		int o2 = (int) obj[0];

	}
}
