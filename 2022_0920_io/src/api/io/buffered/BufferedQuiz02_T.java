package api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BufferedQuiz02_T {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String today = sdf.format(date);
		
		File file = new File("c:/Work/file/" + today + "file");
		if(!file.exists()) {
			file.mkdir();
			System.out.println("���������Ϸ�");
		}
		
		BufferedWriter bw = null;
		String str = null;
		
		System.out.println("���ϸ��� �Է��ϼ���: ");
		String name = sc.nextLine();
		
		try {
			bw = new BufferedWriter(new FileWriter("c:/Work/file/" + today+ "file/" + name + ".txt"));
			System.out.println("'�׸�' �̶�� �Է��ϸ� �����մϴ�.");
			
			while(true) {
				System.out.print("�Ͻ� ����: ");
				String text = sc.nextLine();
				
				if(text.equals("�׸�")) {
					System.out.println("�����մϴ�.");
					break;
				}
				text += "\r\n";
				bw.write(text);
				bw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		/////////////////////////

		
		
		
			
		}
		
		
		
		
	}

