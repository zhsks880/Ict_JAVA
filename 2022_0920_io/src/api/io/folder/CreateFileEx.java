package api.io.folder;

import java.io.File;

public class CreateFileEx {

	public static void main(String[] args) {
		/*
		-자바에서 외부 경로로 폴더를 생성할 때는 File 클래스를 사용합니다.
		-생성자의 매개값으로 폴더를 생성할 경로 + 폴더명을 지정합니다.
		*/
		File file = new File("c:/Work/folder_test");
		
		if(!file.exists()) {		//!논리반전연산자로 없으면~만 체크함, 해당 파일 및 폴더가 존재하면 true, 존재하지 않으면 false
			file.mkdir();			//폴더 생성, 폴더를 여러개를 생성시엔 .mkdirs 로 해야함
			System.out.println("폴더 생성 완료!");
		}else {
			System.out.println("해당 폴더가 이미 존재합니다.");
		}
		
		
		
		
	}

}
