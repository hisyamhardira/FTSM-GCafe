
public class Cafe {
	
	private String name;
	private String address;
	private int noOfBarista;
	private BeverageList beverageList;
	
	public Cafe (String name, String address, int noOfBarista) {
		this.name =name;
		this.address=address;
		this.noOfBarista =noOfBarista;
		beverageList = new BeverageList();
	}
    
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getNoOfBarista() {
		return noOfBarista;
	}

	public BeverageList getBeverageList() {
		return beverageList;
	}
	
	
}
