package OOPS;

public class Encapsulation1 {
	public static void main(String[] args) {
		fan f =  new fan();
		f.setCost(100);
		f.setBrand("Bajaj");
		System.out.println("brand : "+f.getBrand());
			System.out.println("cost : " +f.getCost());
			System.out.println("==============================================================");	
			Alien a = new Alien(10, "blue");
			System.out.println(a.getAge());
			System.out.println(a.getName());
			
	}}
	class fan{
		 int cost;
		 String brand;  //properties
		
		public void setCost(int cost) { //instance variable
			this.cost = cost;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public int getCost() {
			return cost;
		}
		public String getBrand() {
			return brand;
		}
		
	}

	
	/*
	 * by using constructor we can avoid setting like in line no 6,7
	 */
class Alien{
	private int age;
	private String name;
	
	public Alien(int age, String name) {
		this.age =age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
    public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
