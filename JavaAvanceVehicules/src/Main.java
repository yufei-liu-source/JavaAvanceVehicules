import java.util.ArrayList;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		Car a = new Car("Audi",10000);
		Car b = new Car("BMW",9000);
		Car c = new Car("BMW",9000);
		Car d = a;
		
		//Exo 2.1
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(a==d);
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		System.out.println(a.equals(d));
		/***
		 * This is natural because "==" compare the reference of 2 instance 
		 * while with "equal" we could compare the brand and the value
		 */
		
//		Garage g = new Garage();
//		g.add(a);
//		g.add(b);
//		g.add(c);
//		g.add(d);
//		System.out.println(g);
//		System.out.println(g.sumV());
//		System.out.println(Garage.getId());
		
		//Exo 2.2
		ArrayList<Car> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		System.out.println(list.indexOf(a));
		System.out.println(list.indexOf(b));
		System.out.println(list.indexOf(c));
		System.out.println(b.equals(c));
		/***
		 * Yes, b and c are equal and c is not in the list
		 */
		
		//Exo 2.3
		HashSet<Car> set = new HashSet<Car>();
		set.add(b);
		System.out.println(set.contains(c));
		/***
		 * We just put b into the set not c, so the result of contains is false
		 */
	}
}
