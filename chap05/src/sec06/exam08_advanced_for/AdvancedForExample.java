package sec06.exam08_advanced_for;

public class AdvancedForExample {

	public static void main(String[] args) {
		
		
		// 해당 배열의 항목을 순차적으로 접근해 for문을 이용하면 간단하게 표현할 수 있다.
		int[] scores = { 95, 71, 84, 93, 87 };
		
		int sum = 0;
		// scores의 항목만큼 반복한다.
		for(int score : scores) {
			sum += score;
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("점수 평균 = " + avg);

	}

}
