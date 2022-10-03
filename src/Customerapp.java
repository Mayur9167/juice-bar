
public class Customerapp {

	public static void main(String[] args) {
		Shop s1 = new Shop(" panjim");
		
		Shop s2 = new Shop(" mapusa");
		
		System.out.println("You Can Order the Following Drinks");
		
		MilkShake m1 =new MangoShake();
		m1.create();
		m1.serve();
		MilkShake m2 =new ChikooShake();
		m2.create();
		m2.serve();		

		

		
		
		
		
		

	}

}
