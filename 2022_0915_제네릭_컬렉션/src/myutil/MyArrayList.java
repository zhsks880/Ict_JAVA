package myutil;

public class MyArrayList<E> {
	
	E [] data = null;
	//★size : 배열 길이 확인
	public int size() {
		
		return (data==null) ? 0 : data.length;
	}
	//★add : 인덱스 추가
	public void add(E ob) {
		//기존배열의 갯수보다 1 더 많이 생성
		E [] im = (E[]) new Object[this.size()+1];
		
		//기존배열값->임시배열에 옮기기
		for(int i=0; i<size(); i++) {
			im[i] = data[i];
		}
		//임시배열 마지막에 object넣는다
		im[this.size()] = ob;
		//임시->data
		data = im;
	}
	//★get : 인덱스 번호에 해당하는 문자 출력
	//throws:예외처리양도(throw에 대한 처리를 catch가 아닌 get을 사용자측에게 양도)
	public E get(int index) throws Exception {
		if(index<0 || index>=this.size()) {
			String msg = String.format("get:인덱스유효범위 0~%d 사이: 전달된 index %d", this.size()-1, index);
			throw new Exception(msg);
		}
			return data[index];
	}
	//★remove : 특정배열삭제
	public void remove(int index) throws Exception {
		if(index<0 || index>=this.size()) {
			String msg = String.format("remove:인덱스유효범위 0~%d 사이: 전달된 index %d", this.size()-1, index);
			throw new Exception(msg);
		}
		
		if(this.size()==1) {
			data = null;
			return;
		}
		//1.이전 데이터보다 1개 적게 배열 생성
		E [] im = (E[]) new Object[this.size()-1];
		//2.원본데이터에서 삭제번째만 빼고 가져오기
		for (int i=0; i<im.length; i++) {
			if(i<index)
				im[i]=data[i];
			else
				im[i]=data[i+1];
		}
		//3.im->data
		data = im;
	}
	
	//★clear : 모든 요소 삭제
	public void clear() {
		data = null;
	}
	
}
