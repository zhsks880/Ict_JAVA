package myutil;

public class MyArrays {
	
	//접근제한자	+정적생성							+반환형(반환값이 없을떄..)				+메소드명(전달인자(수))
	//public(공개)	+static(프로그램시작시 미리만든다)	+void(자료형이긴한데 값이없음을 나타냄)	+display(int [] mr)
	
	//전달인자는 언제 생성되나? 메소드 호출시 생성->메소드종료시 소멸
	//지역(local)변수 <- stack에 생성
	
	//배열출력 기능의 메소드(method)작성
	
	//★★★display 메소드
	public static void display(int [] mr){
		System.out.print("[");
		for (int i=0; i<mr.length; i++)
		{
			System.out.printf("%3d", mr[i]);
		}
		System.out.println("  ]");
	} 	//mr은 요기 안에서만 사용 되는 로컬변수라고 부르며 이 다음에는 소멸됨(고로stack에 만들어짐)
	
	//★★★fill 메소드(배열 전체 채우기)
	public static void fill(int [] ar,int value){						
		              //int [] ar = mr, int value=0
		for(int i=0; i<ar.length; i++) {
			ar[i] = value;
		}
	}
	
	//★★★fill 메소드(원하는 칸만 채우기)
	public static void fill(int [] ar, int fromindex, int toindex, int value) {
		for(int i=fromindex; i<toindex; i++) {
			ar[i] = value;
		}	
	}
	
	//★★★오름차순 정렬 메소드(선택정렬 : selection sort)
	public static void array_sort_asc(int [] mr) {
		for(int i=0; i<mr.length-1; i++) {				//i고정 k를 돌림/ 반복횟수를 -1한 이유는 마지막 인덱스는 안해도 되서
			for(int k=i+1; k<mr.length; k++) {
				if(mr[i] > mr[k]) {						// mr의i 랑 mr의k 값을 비교해서 교환함/앞이크믄 바꿔라~
					int im = mr[i];
					mr[i] = mr[k];
					mr[k] = im;
				}
			}
		}
	}
	//★★★오름차순 정렬 메소드(부분)
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
	
	//★★★내림차순 정렬 메소드(선택정렬 : selection sort)
		public static void array_sort_desc(int [] mr) {
			for(int i=0; i<mr.length-1; i++) {				//i고정 k를 돌림/ 반복횟수를 -1한 이유는 마지막 인덱스는 안해도 되서
				for(int k=i+1; k<mr.length; k++) {
					if(mr[i] < mr[k]) {						// mr의i 랑 mr의k 값을 비교해서 교환함/뒤가 크믄 바꿔라~
						int im = mr[i];
						mr[i] = mr[k];
						mr[k] = im;
					}
				}
			}
		}
	//★★★내림차순 정렬 메소드(부분)
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
