package d_array;

public class Wokrout {
	public static void main(String[] args) {
		String[] names = new String[]{"박상빈","길민선","성원제","박세웅","심하은","성원제"};
		
		for(int name = 0; name < names.length; name++){
				System.out.println(names[name] + "\t");
		}
		String[] subject = new String[]{"국어","영어","수학","과학","역사","세계사"};
	
		for(int name = 0; name < names.length; name++){
			System.out.println(subject[name] + "\t");
		}
	}
}

