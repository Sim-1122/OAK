package sec01.exam01_variable;

public class VariableScopeExample {

	public static void main(String[] args) {
		// int 타입의 변수 선언을 한다.
		/*int var1;*/
		
		// if문 블록
		if(true) {
		/*	int var2;	*/
			
		/*	var1 = 10;	*/
		/*	var2 = 20;	*/
		}
		
		// var1은 10을 저장할 수 있다.
		/*var1 = 10;*/
		
		// var2는 20을 괄호 안에서 벗어났기 때문에 사용할 수 없다.
		//var2 = 20;
		
		// for문 블록
		for(int i=0; i<1; i++) {
		/*	int var3;	*/
			
		/*	var1 = 10;	*/
		/*	var3 = 30;	*/
		}
		
		// var1은 10을 저장할 수 있다.
		/*var1 = 10;*/
		
		// var3은 괄호를 벗어났기 때문에 30을 저장할 수 없다.
		//var3 = 30;
	}
}
