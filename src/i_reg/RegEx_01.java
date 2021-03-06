package i_reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_01 {

	public static void main(String[] args) {

		/*
		1. 정규식이란?
			- 텍스트 데이터 중에서 원하는 조건과 일치하는 문자열을 찾기 위해 만들어 졌다.
			- 정규식의 구성
				: pattern클래스를 이용하여 정규식을 정의한다.
				: Matcher클래스를 이용하여 데이터를 비교한다.
				
		
		
		
		
		
		*/
		
		Pattern p = Pattern.compile("[a-z]*");
		Matcher m = p.matcher("");
		System.out.println(m.matches());
		
		
		/*
		^  문자열의 시작
		$  문자열의 끝
		.  임의의 한 문자 단, \ 는 제외
		*  앞문자가 없을 수도 무한정 있을 수도 있다.
		+  앞 문자가 한 번 이상 
		?  앞 문자가 없거나 하나
		[] 문자의 집합이나 범위를 표현한다. [^ ]not의 의미
		{} 횟수 또는 범위를 나타낸다. {2, 3}
		() 소괄호 안의 문자를 하나의 문자로 인지 (010)
		| 패턴 안에서 or의 의미를 가진다.(010|016)
		
		\s 공백문자
		\S 공백문자 제외한 모든 문자
		\w 알파벳 또는 숫자
		\d 숫자 [0-9] 사용할 때는 \\d로 써야 인식한다.
		
		*/
		
		//1.영어 소문자 2개 또는 3개로 이루어진 정규식
		Pattern pat = Pattern.compile("[a-z]{2,3}");
		Matcher ma = pat.matcher("asad");
		System.out.println(ma.matches());
		
		String regEx01 = "[a-z]{2,3}";
		System.out.println(Pattern.matches(regEx01, "ardf"));
		
		//2.영문자가 3회 나온다음에 숫자가 나올 수도 없을 수도 무제한 있을 수도 있다.
		Pattern pat2 = Pattern.compile("[a-zA-Z]{3}[0-9]*");
		Matcher ma2 = pat2.matcher("ada1");
		System.out.println(ma2.matches());
		
		//3.전화번호 숫자3개-숫자4개-숫자4개 
		Pattern pat3 = Pattern.compile("\\d{3}-\\d{4}-\\d{4}");
		Matcher ma3 = pat3.matcher("031-2312-1241");
		System.out.println(ma3.matches());
		
		//4.전화번호 010, 011, 016, 017, 018, 019 앞에 올 수 있고
		//중간 번호 중 시작번호가 0이 올수 없고 나머지 3개오면되고
		Pattern pat4 = Pattern.compile("^01(0|1|[6-9])-([^0]\\d{3})-\\d{4}");
		Matcher ma4 = pat4.matcher("018-0031-1283");
		System.out.println(ma4.matches());
		
		//5.주민번호
		/*
		 * 년 월 일
		 * 숫자 2개 0일 때 1-9
		 * 		 1일 때 0-2
		 * 
		 */
		
		//6.이메일주소
		//영문자로 시작해야 한다.
		//영문자 또는 숫자 특수문자(-_)
		//@이후에 영문자 또는 숫자가 3~7자
		//.이후에 영문자 또는 숫자가 2~3자
		//.kr이 올 수 도 있다.
		
		
		String mail = "^[a-zA-Z]|[0-9](-)(_)@\\w{3,7}.\\w{2,3}(.kr)*";
		System.out.println(Pattern.matches(mail, "shywj@gmail.com"));
		
		//7.
		
		String text = "야이 개나리 십장생아 조카신발 같은 경우를 봤나..";
		String result = filter(text);
		System.out.println(result);
		
	}

	private static String filter(String text) {

		Pattern p = Pattern.compile("개나리|십장생|조카신발|병일신", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(text);
		
		StringBuffer sb = new StringBuffer();
		
		
		while(m.find()){//찾았느냐 찾았으면~
			String group = m.group();
			
			String re = maskword(group);
			m.appendReplacement(sb, re);
			
		}
		m.appendTail(sb);
		
		return sb.toString();
	}
	
		private static String maskword(String group){
			char[] gg = group.toCharArray();
			
			StringBuffer sb = new StringBuffer();
			
			for(int i = 0; i < gg.length; i++){
				if(i==0){
					sb.append(gg[i]);
				}else{
					sb.append("*");
				}
			}
			
			return sb.toString();
		}
	
	

}
