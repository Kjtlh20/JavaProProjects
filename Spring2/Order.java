package ua.kiev.prog;

public class Order {
    private String name;
    private String address;
    private String item;
    private double price;

    public Order(String name, String address, String item, double price) {
        this.name = name;
        this.address = address;
        this.item = item;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" + name + ", " + address + ", " + item + ", " + price + "]";
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
