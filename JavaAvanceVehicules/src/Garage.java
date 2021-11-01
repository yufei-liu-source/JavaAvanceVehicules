import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Garage {
	private HashMap<Integer, Car> gs;
	private static int id;

//	public Garage(HashMap<Integer, Car> gs) {
//		this.gs = gs;
//		this.id = 1;
//	}
	
	public Garage() {
		this.gs = new HashMap<Integer, Car>();
		Garage.id = 0;
	}
	
	public HashMap<Integer, Car> add(Car c){
		Objects.requireNonNull(c, "Car must not be null!");
		this.gs.put(id, c);
		id++;
		return gs;		
	}


	public static int getId() {
		return id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		Collection<Car> vals = this.gs.values();
		for (Object obj : vals) {
			sb.append(obj.toString() + " ");
		}
		String s = sb.toString();
		return s;
	}
	
	public long sumV() {
		long sum = 0;
		Collection<Car> vals = this.gs.values();
		for (Car c : vals) {
			sum = sum + c.getValue();
		}
		return sum;	
	}
	
	public Car firstCarByBrand(String s) {
		String s2 = s;
		if(this.gs.containsValue(s2)) {
			
		}
		return null;
		
	}
}
