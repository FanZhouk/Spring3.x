package chapter3;

public class Car {
	private String brand; // Ʒ��
	private String color; // ��ɫ
	private int maxSpeed; // ʱ��

	public Car() {
	}

	public void introduce() {
		System.out.println("Car [brand=" + brand + ", color=" + color
				+ ", maxSpeend=" + maxSpeed + "]");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeend() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeend) {
		this.maxSpeed = maxSpeend;
	}

}
