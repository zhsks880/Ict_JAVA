package mymain;


//Scanner�� ��ġ������ �˷��ش� / Scann������ ġ�� ��Ʈ�ѽ����̽� ġ�� ����Ʈ ��ƿ ��
import java.util.Scanner;


public class _06_Ű�����Է� {

	public static void main(String[] args) {
		//�������� : �̸� ���� �ּ� Ű
		
		//��������
		String name;
		int age;
		String addr;
		double height;
		
		//�����ġ : System.out
		//�Է���ġ : System.in
		
		//Ű����κ��� �Է¹ޱ� ���� ��ü
		//Ŭ�������� Ȯ�� : �ش�Ŭ������ ĳ��(Caret)��ġ��Ű�� F4Ű ������
		Scanner scanner = new Scanner(System.in);
		
		//���ڿ��Է¹ޱ�
		//next()		: ���� �Ǵ� ���������� ��������
		//nextLine()	: ���������ؼ� ���ͱ��� ��������
		
		//�����Է¹ޱ�
		//netxtInt()
		//nextShort()
		//nextLong()
		
		//�Ǽ��Է¹ޱ�
		// nextDouble()
		// nextFloat()
		
		
		//1.�̸��Է¹ޱ�
		System.out.print("�̸��� �־��ּ���-> ");
		name = scanner.nextLine();
		
		//2.���� �Է¹ޱ�
		System.out.print("���̸� �־��ּ���(���ڸ��Է�)-> ");
		age = scanner.nextInt();
		
		//3. �ּ��Է¹ޱ�
		//�����Է� �� ������ ���͸� �����ͼ� ������.
		scanner.nextLine(); //<<nextInt ���� ���͸� �Ȱ������� ���Ͱ� ���Ƽ� �ְ� �ʿ���
		System.out.print("�ּҸ� �־��ּ���-> ");
		addr = scanner.nextLine();
		
		//4. Ű �Է¹ޱ�
		System.out.print("Ű�� �־��ּ���-> ");
		height = scanner.nextDouble();
		
		
		//2.����غ���
		System.out.println("========[���]========");
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("���� : %d��\n", age);
		System.out.printf("�ּ� : %s\n", addr);
		System.out.printf("Ű : %.2f\n", height); //.1 �Ҽ��� 1�ڸ�����..�׳�f�� �ϸ� 6�ڸ����� �þ���0000
		
		
		
	}

}
