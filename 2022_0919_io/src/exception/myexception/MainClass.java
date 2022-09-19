package exception.myexception;


public class MainClass {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.setOperand(20, 0);
		try {
			cal.divide();
		} catch (DivideException e) {
			e.printStackTrace();
			System.out.println("에러코드 :" + e.getErrCode());
		}
	}

}
