package sec03.exam04_break;

public class BreakOutterExample {

	public static void main(String[] args) {
		// Label을 붙일 수 있다.
		/*Outter:*/ for(char upper='A'; upper<='Z'; upper++) {
			
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "_" + lower);
				if(lower=='g') {
					break /*Outter*/;
				}
			}
			
		}

	}

}
