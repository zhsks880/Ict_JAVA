package myutil;

public class MyArrays {
	
	//����������	+��������							+��ȯ��(��ȯ���� ������..)				+�޼ҵ��(��������(��))
	//public(����)	+static(���α׷����۽� �̸������)	+void(�ڷ����̱��ѵ� ���̾����� ��Ÿ��)	+display(int [] mr)
	
	//�������ڴ� ���� �����ǳ�? �޼ҵ� ȣ��� ����->�޼ҵ������ �Ҹ�
	//����(local)���� <- stack�� ����
	
	//�迭��� ����� �޼ҵ�(method)�ۼ�
	
	//�ڡڡ�display �޼ҵ�
	public static void display(int [] mr){
		System.out.print("[");
		for (int i=0; i<mr.length; i++)
		{
			System.out.printf("%3d", mr[i]);
		}
		System.out.println("  ]");
	} 	//mr�� ��� �ȿ����� ��� �Ǵ� ���ú������ �θ��� �� �������� �Ҹ��(���stack�� �������)
	
	//�ڡڡ�fill �޼ҵ�(�迭 ��ü ä���)
	public static void fill(int [] ar,int value){						
		              //int [] ar = mr, int value=0
		for(int i=0; i<ar.length; i++) {
			ar[i] = value;
		}
	}
	
	//�ڡڡ�fill �޼ҵ�(���ϴ� ĭ�� ä���)
	public static void fill(int [] ar, int fromindex, int toindex, int value) {
		for(int i=fromindex; i<toindex; i++) {
			ar[i] = value;
		}	
	}
	
	//�ڡڡڿ������� ���� �޼ҵ�(�������� : selection sort)
	public static void array_sort_asc(int [] mr) {
		for(int i=0; i<mr.length-1; i++) {				//i���� k�� ����/ �ݺ�Ƚ���� -1�� ������ ������ �ε����� ���ص� �Ǽ�
			for(int k=i+1; k<mr.length; k++) {
				if(mr[i] > mr[k]) {						// mr��i �� mr��k ���� ���ؼ� ��ȯ��/����ũ�� �ٲ��~
					int im = mr[i];
					mr[i] = mr[k];
					mr[k] = im;
				}
			}
		}
	}
	//�ڡڡڿ������� ���� �޼ҵ�(�κ�)
		public static void array_sort_asc(int [] mr, int fromindex, int toindex) {
			for(int i=fromindex; i<toindex-1; i++) {				
				for(int k=i+1; k<toindex; k++) {
					if(mr[i] > mr[k]) {						
						int im = mr[i];
						mr[i] = mr[k];
						mr[k] = im;
					}
				}
			}
		}
	
	//�ڡڡڳ������� ���� �޼ҵ�(�������� : selection sort)
		public static void array_sort_desc(int [] mr) {
			for(int i=0; i<mr.length-1; i++) {				//i���� k�� ����/ �ݺ�Ƚ���� -1�� ������ ������ �ε����� ���ص� �Ǽ�
				for(int k=i+1; k<mr.length; k++) {
					if(mr[i] < mr[k]) {						// mr��i �� mr��k ���� ���ؼ� ��ȯ��/�ڰ� ũ�� �ٲ��~
						int im = mr[i];
						mr[i] = mr[k];
						mr[k] = im;
					}
				}
			}
		}
	//�ڡڡڳ������� ���� �޼ҵ�(�κ�)
			public static void array_sort_desc(int [] mr, int fromindex, int toindex) {
				for(int i=fromindex; i<toindex-1; i++) {				
					for(int k=i+1; k<toindex; k++) {
						if(mr[i] < mr[k]) {						
							int im = mr[i];
							mr[i] = mr[k];
							mr[k] = im;
						}
					}
				}
			}
	
}
