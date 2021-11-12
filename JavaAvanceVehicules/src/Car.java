
public class Car implements Vehicule {
	private final String brand;
	private final long value;
	private final Discount discount;

	private final int vetuste;
	
	public Car(String brand, long value, Discount d) {
		if(value < 0) {
			throw new IllegalArgumentException();
		}		
		this.brand = brand;
		this.value = value;
		this.discount = d;
		vetuste = 0;
	}
	
	public Car(String brand, long value, Discount d, int vetuste) {
		if(value < 0) {
			throw new IllegalArgumentException();
		}		
		this.brand = brand;
		this.value = value;
		this.discount = d;
		this.vetuste = vetuste;
	}

	public String getBrand() {
		return brand;
	}

	public long getValue() {
		if( this.discount!= null ) {
			return discount.getValue();
		}else return value - 1000 * vetuste;	
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Brand : " + this.brand +" | " + "Value : " + this.value + "\n";
	}
	
	public boolean equals(Car c) {
		return c.getBrand() == this.getBrand() && c.getValue() == this.getValue();
	}
}
