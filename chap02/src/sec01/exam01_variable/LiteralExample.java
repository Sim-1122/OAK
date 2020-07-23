package sec01.exam01_variable;

public class LiteralExample {

	public static void main(String[] args) {
		// int 변수를 출력한다.
		int var1 = 10;
		System.out.println(var1);
		
		// 8진수 앞에 0을 붙여 출력한다.
		int var2 = 010;
		System.out.println(var2);
		
		// 16진수 0x 을 통해 출력한다.
		int var3 = 0x10;
		System.out.println(var3);
		
		// double 변수를 출력한다.
		double var4 = 0.25;
		System.out.println(var4);
		
		// 가수와 진수로 표현해야되는 2 x 10^5을 출력한다.
		double var5 = 2E5;
		System.out.println(var5);
		
		// 문자 변수 char를 작은 따옴표를 통해 출력한다.
		char var6 = 'A';
		System.out.println(var6);
		
		// 한글 한 자를 출력한다.
		char var7 = '한';
		System.out.println(var7);
		
		// 들여쓰기를 하기 위해서 \t를 표현한다.
		System.out.println('\t' + "들여쓰기");
		
		// 열은 큰따옴표에 넣어 표현한다.
		System.out.println("대한" + '\n' + "들여쓰기");
		
		// 작은따옴표 한 자를 표현하기 위해 앞에 \를 붙여 표현한다.
		System.out.println("This" + '\'' + "s Java");
		
		// 큰따옴표를 한 자를 표현하기 위해 앞에 \를 붙여 표현한다. 
		System.out.println("이것은" + '\"' + "중요" + '\"' + "합니다");
		
		// '\' 하나의 문자를 표현하기 위해 앞에 \를 붙여 표현한다.
		System.out.println("가격이" + '\\' + "300입니다.");
		
		// 유니코드 4자리 16진수를 표현하기 위해 u를 앞에 붙여 0041이라는 4자리 16진수를 유니코드로 출력한다.
		char var8 = '\u0041';
		System.out.println(var8);
		
		// 문자열 리터럴
		System.out.println("대한" + "민국");
		
		// 문자열 결합 연산자
		System.out.println("java" + 8);
		
		// 문자열은 String 타입 변수에 저장한다.
		/*String var9 = "자바";*/
		
		// 논리 연산자
		boolean var10 = true;
		/*boolean var11 = false;*/
		
		System.out.println(var10);
	}
}
