package exception.myexception;

public class DivideException extends Exception{
	
	private final int errCode;
	/*
		-������ ���ǵ� ���� Ŭ���� �ܿ� �ʿ信 ���� �����ڰ� ���ο� ���� Ŭ������ �����ؼ� ����� �� �ֽ��ϴ�.
		-��κ��� ��쿡�� Exception�� ��ӹ޾Ƽ� Ŭ������ �������Ѵ�.
	*/
	
	public DivideException(String message, int code) {
		super(message);
		errCode = code;
	}
	
	public int getErrCode() {
		return errCode;
	}
	
	
}
