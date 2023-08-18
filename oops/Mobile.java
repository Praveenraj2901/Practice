package oops;

public class Mobile {
	String brand;
	int price;
	Battery battery;
	Display display;
	Processor processor;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Battery getBattery() {
		return battery;
	}
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	public Display getDisplay() {
		return display;
	}
	public void setDisplay(Display display) {
		this.display = display;
	}
	public Processor getProcessor() {
		return processor;
	}
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
	public Mobile(String brand, int price, Battery battery, Display display, Processor processor) {
		super();
		this.brand = brand;
		this.price = price;
		this.battery = battery;
		this.display = display;
		this.processor = processor;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + ", battery=" + battery + ", display=" + display
				+ ", processor=" + processor + "]";
	}
	
	

}
