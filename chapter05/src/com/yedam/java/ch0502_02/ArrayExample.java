package com.yedam.java.ch0502_02;

public class ArrayExample {

	public static void main(String[] args) {

		int[][] mathScores = new int[2][3]; // int[값을 몇개 가지고 있는지][값의크기] //int[]의 배열 ex)칸막이는2개인데 3개로 나눠서쓰는 것

		// 첫번째 : 변수 사용
		for (int i = 0; i < mathScores.length; i++) {
			System.out.println("mathScores[" + i + "]");
			int[] mathScore = mathScores[i];

			for (int j = 0; j < mathScore.length; j++) {
				System.out.print("\t mathScore[" + j + "]");
				System.out.println(mathScore[j]);
			}
		}
		System.out.println("------------------------------------");
		// 두번째 : 변수 사용 X
		for (int i = 0; i < mathScores.length; i++) {
			System.out.println("mathScores[" + i + "]");

			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.print("\t mathScores[" + i + "][" + j + "]");
				System.out.println(mathScores[i][j]);
			}
		}

		int[][] scoreList = { { 86, 65 }, { 58, 95, 73 }, };
		for (int i = 0; i < scoreList.length; i++) {
			System.out.println(i + "번째 학생 성적===");
			for (int j = 0; j < scoreList[i].length; j++) {
				System.out.print(scoreList[i][j] + " ");
			}
			System.out.println();
		}

		int[][] englishScore = new int[2][]; // 필수값은 앞 숫자
		englishScore[0] = new int[3]; // 첫번째 칸은 3칸으로 나눔
		englishScore[1] = new int[2]; // 두번째 칸은 2칸으로 나눔

		for (int i = 0; i < englishScore.length; i++) {
			for (int j = 0; j < englishScore[i].length; j++) {
				System.out.println("englishScore[" + i + "][" + j + "]:" + englishScore[i][j]);

			}
		}

		//
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");

		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[1] == strArray[2]);
		System.out.println(strArray[1].equals(strArray[2])); // 내부에 있는 값을 비교

		System.out.println();

		// for문으로 배열 복사 - 처음(0)값이 같을때는 사용해도 ㄱㅊ
		int[] oldIntAry = { 1, 2, 3 };
		int[] newIntAry = new int[5];
		for (int i = 0; i < oldIntAry.length; i++) {
			newIntAry[i] = oldIntAry[i];
		}
		for (int i = 0; i < newIntAry.length; i++) {
			System.out.println(newIntAry[i]);
		}

		// System.arraycopy()
		String[] oldStrAry = { "java", "array", "copy" };
		String[] newStrAry = new String[5];

		System.arraycopy(oldStrAry, 0, newStrAry, 2, oldStrAry.length);

		for (int i = 0; i < newStrAry.length; i++) {
			System.out.println(newStrAry[i]);
		} 		// result : null null java array copy

		// 향상된 for문		인덱스가 필요없으면 쓰면 됨
		int[] scores = { 95, 71, 84, 93, 87 };
			//임시변수 : 가져올 배열			//모든걸 가져온다는 가정하에 가져옴
		int sum= 0;
		int index = -1;	//인덱스를 쓰고싶을때1
		for(int score : scores) {
			sum =+ score;
			System.out.println("인덱스 : "+ ++index);		//인덱스를 쓰고싶을때22 근데 굳이쓰고싶으면 향상된 for문을 쓸필요가 없다
		}
		System.out.println("점수 총합 :"+sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("점수 평균 :"+avg);

	}

}
