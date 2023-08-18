package oops;

public class Processor {
	String brand;
	String model;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Processor(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}
	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", model=" + model + "]";
	}
	

}
