package mymain;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class _09_Ex_while2 {

	public static void main(String[] args) throws Exception {
		//�ݺ�Ƚ���� �𸦶�
		FileReader	fr = new FileReader("a.txt");
		
		int count = 0;
		int alpha_upper_count = 0;//�빮�ڰ���
		int alpha_lower_count = 0;//�ҹ��ڰ���
		int number_count = 0; //���ڰ���
		int white_char_count = 0; //ȭ��Ʈ����(���� \r\n ��)
		int etc_count=0; //Ư������
		
		
		//for(int i=0; i<38; i++)
		while(true)	//���� loop
		{
			//���Ϸκ��� 1���ھ� �о���� �ڵ�
			int ch = fr.read();
			//������ ���̸� Ż���ض�(��= -1)
			if(ch==-1) break;
			//�빮�ڳ�?
			if(ch>=65 && ch<=90) 				// 'A' 'Z' �ص���
				alpha_upper_count++;
			//�ҹ��ڳ�?
			else if (ch>=65+32 && ch<=90+32)	// 'a' 'z' �ص���
				alpha_lower_count++;
			//���ڳ�?
			else if (ch>='0' && ch<='9')		// ' ' <ǥ�� �ھ���� ���� ����
				number_count++;
			//ȭ��Ʈ���ڳ�?
			else if (ch=='\r' || ch=='\n' || ch==32 || ch=='\t')
				white_char_count++;
			//��Ÿ
			else
				etc_count++;
			//txt������ ��δ� �о���� ��ɾ�
			System.out.printf("%c", ch);
			count++;
		}
		System.out.println();
		System.out.println("�ڡڡڡڡڡڡڡڡ�[���ڼ��� �����]�ڡڡڡڡڡڡڡڡ�");
		System.out.printf("�ѱ��ڼ�:%d(��)\n", count);
		System.out.printf("�빮��:%d(��)\n", alpha_upper_count);
		System.out.printf("�ҹ���:%d(��)\n", alpha_lower_count);
		System.out.printf("��  ��:%d(��)\n", number_count);
		System.out.printf("ȭ��Ʈ:%d(��)\n", white_char_count);
		System.out.printf("��  Ÿ:%d(��)\n", etc_count);
		
		fr.close();
				
	}

}
