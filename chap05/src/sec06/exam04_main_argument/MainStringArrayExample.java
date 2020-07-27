package sec06.exam04_main_argument;

public class MainStringArrayExample {

	public static void main(String[] args) {
		
		//System.out.println("배열의 길이: " + args.length);
		// 메인 메소드 String 배열을 어떻게 활용하는지를 알아본다.
		if (args.length !=2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayExample num1 num2");
			System.exit(0);
		}
		
		// Run Configuration > Arguments 설정
		/*String strNum1 = args[0];
		String strNum2 = args[1];
		
		// 문자열을 정수로 바꾼다.
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);*/
	}

}
