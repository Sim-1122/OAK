package sec03.exam01_for;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		
		// 구구단
		for(int m=2; m<=9; m++) {
			System.out.println("**** " + m + "단 ****");
			// 중첩 for문
			/*for(int n=1; n<=9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n) );
			}*/
		}
		

	}

}
