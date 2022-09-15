package vo;

/*
	VO(Value Object)
	1.값을 저장, 관리하는 객체
	2.getter/setter 는 무조건 생성해야함
	3.DTO or To 라고 같이도 명명해서 씀
		->DTO(Data Transfer Object):데이터 전달 객체
		->To(Transfer Object)
		->의미없는 비교 		DTO			vs 		VO
							R/W(Read/Write)			R(Read only) 쓸대없는 소리다~
	


*/
public class PersonVo {
	
	String name;
	int age;
	String tel;
	
	public PersonVo() {
		
	}
	
	public PersonVo(String name, int age, String tel) {
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
	}
	
	@Override
		public String toString() {
			return String.format("[ %s, %d, %s ]", name, age, tel);
		}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
	
}
