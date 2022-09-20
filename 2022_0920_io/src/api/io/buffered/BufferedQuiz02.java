package api.io.buffered;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BufferedQuiz02 {

	public static void main(String[] args) {
		/*
	       1. DateŬ������ �̿��ؼ� file���� ���� ���� ��η�
	        ���� ��¥ 20211111file �̶�� �̸����� "����"
	        �� �����ϼ���.
	       2. ��ĳ�ʷ� ���ϸ��� �Է¹ް� ���ϸ�.txt�� ������ �� �̴ϴ�.
	       3. '�׸�' �̶�� �Է��� ������ ���͸� �����ؼ� �ǽð�����
	        ������ �ۼ��մϴ�. 
	        (������ �ϳ� �����ؼ� ������� �Է°��� ��� �������Ѽ� 
	         ������ �ֽø� �˴ϴ�.)
	       4. '�׸�'���� ������ �ۼ��Ǿ��ٸ�, �ƹ�������γ� 
	        ������ �о �ֿܼ� ����� ������.
	       */
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String today = sdf.format(date);
		
		File file = new File("c:/Work/file/" + today + "file1");
		if(!file.exists()) {
			file.mkdir();
			System.out.println("���������Ϸ�");
		}else {
			System.out.println("�ش� ���� �̹� ����");
		}
		
		Scanner sc = new Scanner(System.in);
		String fileName;
		System.out.print("���ϸ� �Է�: ");
		fileName = sc.next();
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("c:/Work/file/" + today+ "file1/" + fileName + ".txt");
			bw = new BufferedWriter(fw);
			System.out.println("'stop'�̶�� �ϸ� �����մϴ�.");
			
			while(true) {
				System.out.print("�����Է�: ");
				String str1 = sc.nextLine();
				String stop;
				if(str1.equals("stop")) {
					System.out.println("����˴ϴ�");
					break;
				}
				str1 += "\r\n";
				bw.write(str1);
				bw.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			};
		}
		
		
	}

}
