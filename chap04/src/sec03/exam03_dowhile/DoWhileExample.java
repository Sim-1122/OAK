package sec03.exam03_dowhile;

// Scanner�� �����ϴ� ��Ű��
//import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		
		System.out.println("�޼����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		int i = 0;
		  
		do { System.out.println(i); i++; } while(i<=10); // �����ݷ� ���̴� �� ��������!!
		  
		System.out.println();
		System.out.println("���α׷� ����");
		
		// Scanner ������ Ű����κ��� ���ڿ��� �д� ������ ���δ�.
		// Scanner�� Ŭ���� Ÿ���̱� ������ Scanner�� �����ϴ� ��Ű���� �Է������ �Ѵ�.
		// ��Ʈ�� + ����Ʈ + O�� ���ÿ� �Է��Ͽ� import�� �߰��Ѵ�.
		
		/*Scanner scanner = new Scanner(System.in);
		
		// nextLine()�� ����Ű�� ������ �������� ���ڿ��� �ѹ��� �д� �޼ҵ��̴�.
		String inputString = scanner.nextLine();
		
		System.out.println(inputString);*/
		
		System.out.println("�޼����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		// ��ĳ�ʶ�� �ϴ� ��ü�� �����ϴ� �ڵ�
		/*Scanner scanner = new Scanner(System.in);
		String inputString;
		  
		do { 
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while( !inputString.equals("q") ); // �����ݷ� ���̴� �� ��������!!
		
		  
		System.out.println();
		System.out.println("���α׷� ����");*/
		
		 
	}

}
