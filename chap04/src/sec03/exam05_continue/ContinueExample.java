package sec03.exam05_continue;

public class ContinueExample {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			// 만약 i를 2로 나눈 나머지가 0이 아니라면
			if( i%2 !=0 ) {
				// 반복문의 처음으로 돌아간다.
				continue;
			}
			
			System.out.println(i);
		}

	}

}
