
public class Main {
	public static void main(String[] args) {
		Car a = new Car("Audi",10000);
		Car b = new Car("BMW",9000);
		Car c = new Car("BMW",9000);
		Car d = a;
		System.out.println(a);
		
		Garage g = new Garage();
		g.add(a);
		g.add(b);
		g.add(c);
		g.add(d);
		System.out.println(g);
		System.out.println(g.sumV());
		System.out.println(Garage.getId());
//		System.out.println(a==b);
//		System.out.println(b==c);
//		System.out.println(a==d);
//		System.out.println(a.equals(b));
//		System.out.println(b.equals(c));
//		System.out.println(a.equals(d));
	}
}
