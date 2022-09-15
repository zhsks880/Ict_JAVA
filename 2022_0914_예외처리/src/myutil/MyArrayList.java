package myutil;

public class MyArrayList {
	
	Object [] data = null;
	//��size : �迭 ���� Ȯ��
	public int size() {
		
		return (data==null) ? 0 : data.length;
	}
	//��add : �ε��� �߰�
	public void add(Object ob) {
		//�����迭�� �������� 1 �� ���� ����
		Object [] im = new Object[this.size()+1];
		
		//�����迭��->�ӽù迭�� �ű��
		for(int i=0; i<size(); i++) {
			im[i] = data[i];
		}
		//�ӽù迭 �������� object�ִ´�
		im[this.size()] = ob;
		//�ӽ�->data
		data = im;
	}
	//��get : �ε��� ��ȣ�� �ش��ϴ� ���� ���
	//throws:����ó���絵(throw�� ���� ó���� catch�� �ƴ� get�� ����������� �絵)
	public Object get(int index) throws Exception {
		if(index<0 || index>=this.size()) {
			String msg = String.format("get:�ε�����ȿ���� 0~%d ����: ���޵� index %d", this.size()-1, index);
			throw new Exception(msg);
		}
			return data[index];
	}
	//��remove : Ư���迭����
	public void remove(int index) throws Exception {
		if(index<0 || index>=this.size()) {
			String msg = String.format("remove:�ε�����ȿ���� 0~%d ����: ���޵� index %d", this.size()-1, index);
			throw new Exception(msg);
		}
		
		if(this.size()==1) {
			data = null;
			return;
		}
		//1.���� �����ͺ��� 1�� ���� �迭 ����
		Object [] im = new Object[this.size()-1];
		//2.���������Ϳ��� ������°�� ���� ��������
		for (int i=0; i<im.length; i++) {
			if(i<index)
				im[i]=data[i];
			else
				im[i]=data[i+1];
		}
		//3.im->data
		data = im;
	}
	
	//��clear : ��� ��� ����
	public void clear() {
		data = null;
	}
	
}
