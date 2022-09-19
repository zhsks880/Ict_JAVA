package exception.throw_;

public class ThrowExample {
	
	static int calcTotal(int num) throws Exception {
		
		/*
			#���ܸ� ������ �߻���Ű�� Ű���� throw
			-�޼��峪 ������ ���� ���߿� throw Ű���带 ������ �Ǹ� ��� throw�� ������ ���ܰ� �߻��մϴ�.
			-���ܰ� �߻��Ǹ� ����Ǵ� �ڵ�� ��� �ߴܵǰ�, ���ܸ� ó���� �� �ִ� catch ������ �ٷ� �̵�
			-�̸� ������ Ȱ���ϸ� void�� �ƴ� �޼��带 ������ �����ų�� ����� �� ����
			-����, ���� ��Ȳ�� �ƴ����� ���α׷� ���࿡ ����ġ ���� ��Ȳ���� �ڵ��� �帧�� �ٲ� �� �� ����.
		*/
		
		if(num <= 0 ) {
			//�� �������� ������ ���ܸ� �߻���Ŵ!
			throw new Exception();
		}
		
		int total = 0;
		for(int i=1; i<=num; i++) {
			total += i;
		}
		return total;
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(calcTotal(100));
			System.out.println(calcTotal(-120));
		} catch (Exception e) {
			System.out.println("�Ű����� ����� �� �ּ���!");
		}
	}
		
}
