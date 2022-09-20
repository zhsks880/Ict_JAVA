package api.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {

	public static void main(String[] args) {
		
		System.out.println("시작!");
		
		//dummy data
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=1000000; i++) {
			sb.append(i + "hello world!\n");
		}
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		long start = System.currentTimeMillis();	//1970.01.01 00:00 이후로 지금까지 흐른 시간 잡는거
		
		try {
			fos = new FileOutputStream("c:/Work/file/fbout.txt");
			bos = new BufferedOutputStream(fos);
			
			byte [] data = new String(sb).getBytes();
			
			for(byte b : data) {
				fos.write(b);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("소요 시간: " + (end - start)*0.001 + "초");		//실수값을 위해서 *0.001 함. 나누기1000하면 정수로만 나와서
	}

}
