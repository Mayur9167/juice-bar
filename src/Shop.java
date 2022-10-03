public class Shop {
	private String name = "juicebar";
	private String location;
	
	
	public Shop(String location) {
		this.location=location;
		System.out.println("You are Welcome to "+name +location);
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}
}