
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat("Vaska",3,3.5,0.36, "Black");
		Cat cat2 = new Cat("Sirco",4,5,0.4, "Garay");
		Cat cat3 = new Cat("Marko",6,8,0.3, "White");
		cat1.voice();
		System.out.println(cat2.toString());
		System.out.println(cat1.toString());
		cat1.catsFight(cat2);
		cat1.catsFight(cat3);
	}

}
