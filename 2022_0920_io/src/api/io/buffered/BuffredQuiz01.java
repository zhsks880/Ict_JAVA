package api.io.buffered;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BuffredQuiz01 {

	public static void main(String[] args) {
		
		String str = "�ȳ��ϼ���. ���� ������ �������� �ϳ׿�~\n ���� �����ϼ���~ �ȳ�~!";
		
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd a hh:mm:ss");
		String today = sdf.format(date);
		System.out.println(today);
		
		/*
	       1. DateŬ������ SimpleDateFormatŬ������ Ȱ���Ͽ�
	        file ��ο� 20220920.txt�̸����� ������ ���ϴ�.
	       2. ������ �ƹ��ų� �ۼ��ϼŵ� �����մϴ�.
	       3. ������ ���������� ��ٸ� BufferedReader�� ����
	        ������ �о���̼���.
	      */
		
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fw = new FileWriter("c:/Work/file/20220921.txt");
			bw = new BufferedWriter(fw);
			System.out.print("�����Է�: ");
			String str1 = sc.nextLine();
			bw.write(str1);
			System.out.println("������� �Ϸ�");
			
		} catch (Exception e) {
		
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	///////////// �о����
			try {
				fr = new FileReader("c:/Work/file/20220921.txt");
				br = new BufferedReader(fr);
				
				String str3;
				while((str3 = br.readLine()) != null) {
					System.out.println("==����غ����==");
					System.out.println(str3);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					bw.close();
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			}
			
			
			
		}
		
		
		
		
			
		}

	}

