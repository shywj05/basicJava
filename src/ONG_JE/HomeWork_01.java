package ONG_JE;

public class HomeWork_01 {
	public static void main(String[] args) {
		// 3. 우리반에서 아는 친구이름 여섯명의 친구이름을 저장해주세요
		String[] names = new String[] { "박상빈", "길민선", "성원제", "박세웅", "심하은",
				"성시아" };

		// 4. 과목 7개 저장
		String[] subject = new String[] { "국어", "영어", "수학", "사회", "과학", "역사",
				"세계사" };
		// 1. 6명의 7과목의 정수 저장하는 score선언
		int[][] score = new int[6][7];

		// 2. score의 각 방의 값을 0~100의 임의의 값으로 초기화(랜덤한 값 넣어준다
		for (int name = 0; name < names.length; name++) {
			for (int subjec = 0; subjec < subject.length; subjec++) {
				score[name][subjec] = (int) (Math.random() * 101);
			}
		}
		// 5. 합계를 만들어
		String[] sum = new String[] { "인원합계" };
		int[] nameSum = new int[names.length];

		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < subject.length; j++)
				nameSum[i] += score[i][j];
		}
		// 6. 사람들의 평균
		String[] average = new String[] { "인원평균" };
		float[] nameAver = new float[names.length];

		for (int i = 0; i < names.length; i++) {
			nameAver[i] = (int) ((float) nameSum[i] / subject.length * 100 + 0.5f) / 100f;
		}

		// 7. 과목별 합계, 평균
		String[] subjectSum = new String[] { "과목합계" };
		int[] subSum = new int[subject.length];

		for (int i = 0; i < subject.length; i++) {
			for (int j = 0; j < names.length; j++) {
				subSum[i] += score[j][i];
			}
		}

		String[] suAver = new String[] { "과목평균" };
		float[] nomAver = new float[subject.length];

		for (int i = 0; i < subject.length; i++) {
			nomAver[i] = (int) ((float) subSum[i] / subject.length * 100 + 0.5f) / 100f;
		}

		// 8.석차

		String[] rank = new String[] { "등수" };

		int temp = 0;
		for (int j = 0; j < names.length - 1; j++) {
			for (int i = 0; i < names.length - j; i++) {
				if (nameAver[i] > nameAver[i + 1]) {
					temp = (int) nameAver[i];
					nameAver[i + 1] = nameAver[i];
					nameAver[i] = temp;
				}
			}
		}

		// ////////////////////////////////////////////////////////////////////////////////////

		for (int sub = 0; sub < subject.length; sub++) {// 과목나열
			System.out.print("\t" + subject[sub]);
		}
		System.out.print("\t" + sum[0]);// 인원합계
		System.out.print(" \t" + average[0]);// 인원평균
		System.out.print("\t" + rank[0]);// 등수

		System.out.println();
		for (int name = 0; name < names.length; name++) {// 이름나열
			System.out.print(names[name]);
			for (int subjec = 0; subjec < subject.length; subjec++) {// 점수나열
				System.out.print("\t" + score[name][subjec]);
			}
			System.out.print("\t" + nameSum[name]);// 인원합계
			System.out.print("\t" + nameAver[name]);// 인원평균
//			for (i = 0; 0 < 7; i++) {
//				System.out.println(nameAver[i]);
//			}
			System.out.println();
		}

		System.out.print(subjectSum[0]);
		for (int i = 0; i < subject.length; i++) {
			System.out.print("\t" + subSum[i]);// 과목합계
		}
		System.out.println();
		System.out.print(suAver[0]);
		for (int i = 0; i < subject.length; i++) {
			System.out.print("\t" + nomAver[i]);// 과목평균
		}

	}
}
