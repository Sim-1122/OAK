package sec02.exam02_char;

public class CharExample {

	public static void main(String[] args) {
		
		// char 변수에 문자 A를 저장한다.
		char c1 = 'A';
		
		// char 변수에 유니코드 65를 저장한다.
		char c2 = 65;
		
		// char 변수에 4자리 16진수 0041을 저장한다.
		char c3 = '\u0041';
		
		// char 변수에 한글을 저장한다.
		char c4 = '가';
		
		// char 변수에 10진수로 직접 저장한다.
		char c5 = 44032;
		
		// char 변수에 4자리 16진수 AC00을 저장한다.
		char c6 = '\uAC00';
		
		// char 변수를 유니코드로 알기 위해서는 int 타입의 변수로 저장한다.
		int uniCode = c1;
		
		// 출력한다.
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		System.out.println(uniCode);
		
	}
}
