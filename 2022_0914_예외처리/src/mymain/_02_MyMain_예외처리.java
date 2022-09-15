package mymain;

import java.io.FileReader;

public class _02_MyMain_예외처리 {

	public static void main(String[] args) {
		
		try {						//본코드 작성 영역	
			
			int a=10, b=1, res;
			//throw 랑 catch 는 한세트, throw new Exception 해서 예외처리 나올 메세지를 내가 직접해봄, 원래는 jvm 이 알아서 해주는거임
			if(b==0) throw new ArithmeticException("0으로 나눌 수 없습니다");
			res = a/b;
			
			String str = "abc";
			if(str==null) throw new NullPointerException("str is null:객체가 없습니다");
			int len = str.length();
			
			int index = 2;
			int [] nr = {1,2,3};
			if(index>=nr.length) throw new ArrayIndexOutOfBoundsException("인덱스범위를 벗어났습니다");
			nr[index] = 40;
			
			Thread.sleep(10);
			FileReader fr = new FileReader("a.txt");
			
		}catch(ArrayIndexOutOfBoundsException e) {		//예외 처리 영역(Exception 족보를 보면 nullpoint 건 arithmetic 이건 다 상속되있어서 받아짐)	
			e.printStackTrace();						//예외처리추적하는거 표시해주는거			
		}catch(NullPointerException e) {
			e.printStackTrace();
		}catch(ArithmeticException e) {					//멀티 catch 절을 오버로드방식의 메소드 처럼도 사용이 가능한걸 보여주는거임
			e.printStackTrace();						
		}catch(Exception e) {							//맘편하게 Exception 만 하는게 좋다. 부모클래스인 Exception이 가장 위에 있으면 밑에 자식들 코드 다 버려짐 ㅠ0ㅠ
			System.out.println("--Exception:위에서 throw외의 나머지 예외에 대한 처리--");
			e.printStackTrace();
		}
		System.out.println("==정상종료==");
	}

}
