package vo;

/*
	VO(Value Object)
	1.���� ����, �����ϴ� ��ü
	2.getter/setter �� ������ �����ؾ���
	3.DTO or To ��� ���̵� ����ؼ� ��
		->DTO(Data Transfer Object):������ ���� ��ü
		->To(Transfer Object)
		->�ǹ̾��� �� 		DTO			vs 		VO
							R/W(Read/Write)			R(Read only) ������� �Ҹ���~
	


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
