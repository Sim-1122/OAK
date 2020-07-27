package sec06.exam03_array_length;

public class ArrayLengthExample {

	public static void main(String[] args) {
		
		// int타입 배열 생성
		int[] scores = { 83, 90, 87 };
		
		int sum = 0;
		// length는 배열의 속성으로 위에서 3이 정해지면 고칠 수 없는 final field이다.
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("종합: " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균: " + avg);
		
	}

}
