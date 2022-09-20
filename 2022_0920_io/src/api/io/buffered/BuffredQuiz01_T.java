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

public class BuffredQuiz01_T {

	public static void main(String[] args) {
		
		String str = "�ȳ��ϼ���. ���� ������ �������� �ϳ׿�~\n ���� �����ϼ���~ �ȳ�~!";
		
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String today = sdf.format(date);
		System.out.println(today);
		
		/*
	       1. DateŬ������ SimpleDateFormatŬ������ Ȱ���Ͽ�
	        file ��ο� 20220920.txt�̸����� ������ ���ϴ�.
	       2. ������ �ƹ��ų� �ۼ��ϼŵ� �����մϴ�.
	       3. ������ ���������� ��ٸ� BufferedReader�� ����
	        ������ �о���̼���.
	      */
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("c:/Work/file/" + today + ".txt");
			bw = new BufferedWriter(fw);
			
			bw.write(str);
			
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
		///////////// ���� �б� //////////////////
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("c:/Work/file/" + today + ".txt");
			br = new BufferedReader(fr);
			String read;
			while((read = br.readLine()) != null) {
				System.out.println(read);
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}