package api.io.folder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileQuiz {
	private static FileInputStream fis;
	
	public static void main(String[] args) {
		/*
		1. 스캐너를 통해서 파일명을 정확히 입력받습니다.
       
       2. file폴더에 해당 파일이 존재한다면 해당 파일을 upload폴더로 복사하세요.
       파일이 존재하지 않는다면 "파일명이 없습니다." 예외구문을 출력하세요.
       
       3. 복사 도중에 에러가 발생하면 "파일 처리 중 예외 발생!" 구문을 출력.
		*/
		
		Scanner sc = new Scanner(System.in);
		FileInputStream oldFile = null;
		FileOutputStream newFile = null;
		
		File file = new File("c:/Work/upload");
		if(!file.exists()) {
			file.mkdir();
		}else {
			System.out.println("이미 폴더가 존재합니다");
		}
		
		System.out.print("파일명을 입력: ");
		String name = sc.next();
		
		try {
			oldFile = new FileInputStream("c:/Work/file/" + name + ".png");
			
			newFile = new FileOutputStream("C:/Work/upload/" + name + ".jpg");
			
			byte[] arr = new byte[100];
			
//			while(true) {
//				int result = oldFile.read(arr);
//				if(result==-1) break;
//				newFile.write(arr,0,result);
			
			int result;
			while((result = oldFile.read(arr)) !=-1) {		//주석문과 같은데 간략하게 함
				newFile.write(arr,0,result);
			}
			System.out.println("파일 복사 성공!");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (IOException e2) {
			System.out.println("파일 처리 중 예외가 발생했습니다.");
		} finally {
			try {
				oldFile.close();
				newFile.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
