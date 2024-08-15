package simpleProject;


class howmany{
	private int age;
	private String name;
	static int count;
	
	howmany(){
		count ++;
		
	}howmany(int age){
		this.age = age;
		count++;
		
	}howmany(int age, String name){
		this.age = age;
		this.name = name;
		count ++;
	}
}


public class CountObjectsCreated {
	public static void main(String[] args) {
		howmany h = new howmany();
		howmany h1 = new howmany(28);
		howmany h2 = new howmany(28,"marry");
		System.out.println(howmany.count);
	}

}
