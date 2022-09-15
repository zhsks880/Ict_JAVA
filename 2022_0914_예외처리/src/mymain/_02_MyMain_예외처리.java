package mymain;

import java.io.FileReader;

public class _02_MyMain_����ó�� {

	public static void main(String[] args) {
		
		try {						//���ڵ� �ۼ� ����	
			
			int a=10, b=1, res;
			//throw �� catch �� �Ѽ�Ʈ, throw new Exception �ؼ� ����ó�� ���� �޼����� ���� �����غ�, ������ jvm �� �˾Ƽ� ���ִ°���
			if(b==0) throw new ArithmeticException("0���� ���� �� �����ϴ�");
			res = a/b;
			
			String str = "abc";
			if(str==null) throw new NullPointerException("str is null:��ü�� �����ϴ�");
			int len = str.length();
			
			int index = 2;
			int [] nr = {1,2,3};
			if(index>=nr.length) throw new ArrayIndexOutOfBoundsException("�ε��������� ������ϴ�");
			nr[index] = 40;
			
			Thread.sleep(10);
			FileReader fr = new FileReader("a.txt");
			
		}catch(ArrayIndexOutOfBoundsException e) {		//���� ó�� ����(Exception ������ ���� nullpoint �� arithmetic �̰� �� ��ӵ��־ �޾���)	
			e.printStackTrace();						//����ó�������ϴ°� ǥ�����ִ°�			
		}catch(NullPointerException e) {
			e.printStackTrace();
		}catch(ArithmeticException e) {					//��Ƽ catch ���� �����ε����� �޼ҵ� ó���� ����� �����Ѱ� �����ִ°���
			e.printStackTrace();						
		}catch(Exception e) {							//�����ϰ� Exception �� �ϴ°� ����. �θ�Ŭ������ Exception�� ���� ���� ������ �ؿ� �ڽĵ� �ڵ� �� ������ ��0��
			System.out.println("--Exception:������ throw���� ������ ���ܿ� ���� ó��--");
			e.printStackTrace();
		}
		System.out.println("==��������==");
	}

}
