
public class Car {
	private final String brand;
	private final long value;
	
	public Car(String brand, long value) {

		this.brand = brand;
		if (value > 0) {
			this.value = value;
		}else this.value = -1;
	}

	public String getBrand() {
		return brand;
	}

	public long getValue() {
		return value;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Brand : " + this.brand + "Value : " + this.value;
	}
	
	
	
	

}
