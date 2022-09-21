package regex.pattern;

public class Product {
	//생성자를 만들때는 기본생성자를 생성해 둬야한다.
	//1.private 로 변수 생성(타입에 맞도록)
	//2.클래스내에 변수 받을꺼 private 로 설정->getter/setter 로 받을수 있게 설정
	//3.생성자 생성해서 각각 할 필요 없이 한번에 할수 있도록 설정
	//4.기본생성자는 권장사항으로 꼭 생성(커스터마이징 시..)
	
	private String day;
	private String store;
	private String grade;
	private String detail;
	private String price;
	
	//기본생성자
	public Product() {}
	
	//사용할 생성자
	public Product(String day, String store, String grade, String detail, String price) {
		super();
		this.day = day;
		this.store = store;
		this.grade = grade;
		this.detail = detail;
		this.price = price;
	}
	
	//Getter/Setter 생성 (문지기를 세우자)
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
	
	//toString 생성 (컨트롤+쉬프트+S)
	@Override
	public String toString() {
		return "Product [day=" + day + ", store=" + store + ", grade=" + grade + ", detail=" + detail + ", price="
				+ price + "]";
	}
	
	

}