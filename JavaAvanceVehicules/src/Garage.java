import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class Garage {
	private ArrayList<Vehicule> vs;
//	private HashMap<Integer, Car> gs;
	private static int id = 0 ;

//	public Garage(HashMap<Integer, Car> gs) {
//		this.gs = gs;
//		this.id = 1;
//	}
	public Garage() {
		this.vs = new ArrayList<>();
		++id;
	}	

//	public HashMap<Integer, Car> add(Car c){
//		Objects.requireNonNull(c, "Car must not be null!");
//		this.gs.put(id, c);
//		id++;
//		return gs;		
//	}

	public void add(Vehicule c) {
        c = Objects.requireNonNull(c);
        vs.add(c);
        
        Comparator com = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Car c1 = (Car) o1;
				Car c2 = (Car) o2;
				return c1.getBrand().compareTo(c2.getBrand());
				//return (int)c1.getValue() - (int)c2.getValue();
				//return c1.getBrand().compareTo(c2.getBrand()) + ((int)c1.getValue() - (int)c2.getValue())
			}       	
        };
        vs.sort(com);
    }
	
	
	public static int getId() {
		return id;
	}

//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		StringBuilder sb = new StringBuilder();
//		Collection<Car> vals = this.gs.values();
//		for (Object obj : vals) {
//			sb.append(obj.toString() + " ");
//		}
//		String s = sb.toString();
//		return s;
//	}
	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Vehicule c : vs) {
            sb.append(c.toString() + " ,\n");
        }
        return sb.substring(0, sb.length() - 1);
    }
	
//	public long sumV() {
//		long sum = 0;
//		Collection<Car> vals = this.gs.values();
//		for (Car c : vals) {
//			sum = sum + c.getValue();
//		}
//		return sum;	
//	}
	
	 public long sumV() {
		 long sum = 0;
		 for (Vehicule c : vs) {
			 sum += c.getValue();
		 }
		 return sum;
	 }
	 
	 public Vehicule firstCarByBrand(String brand) {
		 for (Vehicule v : vs) {
			 if (v.getBrand().equals(brand)) {
				 return v;
			 }	                
		 }
		 throw new NoSuchElementException();
	 }
	 
	 public void protectionism(String brand) {
		 for (Vehicule c: vs) {
			 if (c.getBrand() == brand) {
				 vs.remove(c);
			 }
		 }
	 }
	 
	 public boolean equals(Garage g) {
		return vs.equals(g.vs);
	}
	 
}
