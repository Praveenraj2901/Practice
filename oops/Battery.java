package oops;

public class Battery {
	String batteryType;
	int price;
	int mAh;
	public String getBatteryType() {
		return batteryType;
	}
	public void setBatteryType(String batteryType) {
		this.batteryType = batteryType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getmAh() {
		return mAh;
	}
	public void setmAh(int mAh) {
		this.mAh = mAh;
	}
	public Battery(String batteryType, int price, int mAh) {
		super();
		this.batteryType = batteryType;
		this.price = price;
		this.mAh = mAh;
	}
	@Override
	public String toString() {
		return "Battery [batteryType=" + batteryType + ", price=" + price + ", mAh=" + mAh + "]";
	}
	
	
	

}
