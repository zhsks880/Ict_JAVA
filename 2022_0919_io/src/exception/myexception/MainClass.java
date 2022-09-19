package exception.myexception;


public class MainClass {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.setOperand(20, 0);
		try {
			cal.divide();
		} catch (DivideException e) {
			e.printStackTrace();
			System.out.println("�����ڵ� :" + e.getErrCode());
		}
	}

}
