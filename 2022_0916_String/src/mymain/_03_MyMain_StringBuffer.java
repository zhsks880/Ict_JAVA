package mymain;

public class _03_MyMain_StringBuffer {

	public static void main(String[] args) {
		
		//메모리 낭비 코드(연산과정에서 버려지는 부산물(중간객체들) 발생)
		int count = 0;
		String msg = ++count + " little," +  ++count + " little," + ++count + " little Indian";
		System.out.println(msg);
		System.out.println(msg.length());
		
		//해결방법1 : StringBuffer 이용해라(StringBuffer (동기화 됨=속도가 느림) vs StringBuilder(동기화 안됨=속도가 빠름)
		//StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());	//저장용량확인
		//메모리효율적인 측면에서 위와 같음
		count = 0;
		sb.append(++count);
		sb.append(" little,");
		sb.append(++count);
		sb.append(" little,");
		sb.append(++count);
		sb.append(" little Indian");
		
		System.out.println(sb);			//pringln이 sb.toString() 으로 오버라이딩 자동 처리되서 표시가 되긴 함
		
		String msg1 = sb.toString();	//StringBuffer 로 부터 toString 해와야지 String이 됨
		System.out.println(msg1);
		System.out.println(msg1.length());
		
		//해결방법2 : String Fomatter 이용(내부에서 StringBuffer를 이용)
		count = 0;
		String msg2 = String.format("%d little,%d little,%d little Indian",++count, ++count, ++count );
		System.out.println(msg2);
		
		
		
	}

}
