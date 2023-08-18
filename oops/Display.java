package oops;

public class Display {
	String displayType;
	float inches;
	int price;
	public String getDisplayType() {
		return displayType;
	}
	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}
	public float getInches() {
		return inches;
	}
	public void setInches(float inches) {
		this.inches = inches;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Display(String displayType, float inches, int price) {
		super();
		this.displayType = displayType;
		this.inches = inches;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Display [displayType=" + displayType + ", inches=" + inches + ", price=" + price + "]";
	}
	
	

}
