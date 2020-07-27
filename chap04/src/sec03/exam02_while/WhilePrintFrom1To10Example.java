package sec03.exam02_while;

public class WhilePrintFrom1To10Example {

	public static void main(String[] args) {
		
		int i = 1;
		
		while(i<=10) {
			System.out.println(i);
			// 무한루프를 방지하기 위해 증감식을 작성한다.
			i++;
		}
	}

}
