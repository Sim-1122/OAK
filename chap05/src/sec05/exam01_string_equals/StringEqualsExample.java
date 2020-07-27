package sec05.exam01_string_equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		// 똑같은 문자열 리터럴을 지정
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		// strVar1과 strVar2가 지정하는 객체가 동일한지를 알아본다.
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		// strVar3이 참조하고 있는 객체의 문자열과 strVar4가 같은지를 알아본다.
		if( strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}

}
