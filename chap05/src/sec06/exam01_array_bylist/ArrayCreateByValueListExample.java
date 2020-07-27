package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		
		// 배열 생성
		int[] scores = { 83, 90, 87 };
		
		// 인덱스 번호는 0번부터 시작
		System.out.println("scores[0]: " + scores[0]);
		System.out.println("scores[1]: " + scores[1]);
		System.out.println("scores[2]: " + scores[2]);
		
		// 
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		
		System.out.println("총합: " + sum);
		
		// 정수를 실수로 바꾼다.
		double avg = (double) sum / 3;
		System.out.println("평균: " + avg);
	}

}
