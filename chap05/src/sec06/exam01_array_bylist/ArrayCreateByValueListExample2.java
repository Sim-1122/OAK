package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		
		int[] scores;
		// new 연산자와 자료형을 표기해야 한다.
		scores = new int[]{ 83, 90, 87 };
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합: " + sum1);
		
		// scores에 대한 배열 객체를 집적 입력할 때는 new 연산자를 입력해야 한다.
		int sum2 = add( new int[] { 83, 90, 87 } );
		System.out.println("총합: " + sum2);
	}
	
	// add 메소드는 매개값으로 배열을 받아 배열의 항목을 다 더한 후  그 값을 return한다.
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
