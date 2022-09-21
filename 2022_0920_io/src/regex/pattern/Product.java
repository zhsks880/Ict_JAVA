package regex.pattern;

public class Product {
	//�����ڸ� ���鶧�� �⺻�����ڸ� ������ �־��Ѵ�.
	//1.private �� ���� ����(Ÿ�Կ� �µ���)
	//2.Ŭ�������� ���� ������ private �� ����->getter/setter �� ������ �ְ� ����
	//3.������ �����ؼ� ���� �� �ʿ� ���� �ѹ��� �Ҽ� �ֵ��� ����
	//4.�⺻�����ڴ� ����������� �� ����(Ŀ���͸���¡ ��..)
	
	private String day;
	private String store;
	private String grade;
	private String detail;
	private String price;
	
	//�⺻������
	public Product() {}
	
	//����� ������
	public Product(String day, String store, String grade, String detail, String price) {
		super();
		this.day = day;
		this.store = store;
		this.grade = grade;
		this.detail = detail;
		this.price = price;
	}
	
	//Getter/Setter ���� (�����⸦ ������)
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	//toString ���� (��Ʈ��+����Ʈ+S)
	@Override
	public String toString() {
		return "Product [day=" + day + ", store=" + store + ", grade=" + grade + ", detail=" + detail + ", price="
				+ price + "]";
	}
	
	

}