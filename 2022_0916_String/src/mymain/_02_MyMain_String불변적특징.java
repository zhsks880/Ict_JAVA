package mymain;

public class _02_MyMain_String불변적특징 {

	public static void main(String[] args) {
		
		String msg =  new String("오늘 비오냐 바보?");		//이 데이터는 안없어지고 heap 영역에 그대로 있음
		String msg1 = msg.replaceAll("바보", "***");	//새로운 객체를 생성해버림
		System.out.printf("원본:%s\n", msg);
		System.out.printf("사본:%s\n", msg1);
		
		String str = "abcdef";
		str = str.toUpperCase();	//이 코드는 기존 str 소문자를 버리고 바뀐 대문자 str 을 대입해서 나오는것임, 기존 객체는 바뀐게 아닌 버려짐(Gabage Collector)
		System.out.println(str);
		
		
	}

}
