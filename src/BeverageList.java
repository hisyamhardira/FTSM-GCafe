import java.util.ArrayList;

public class BeverageList {
	
	private ArrayList<Beverage> beverageList;
	
	public BeverageList() {
		beverageList = new ArrayList<Beverage>();
	}

	public ArrayList<Beverage> getBeverageList() {
		return beverageList;
	}

	public void addBeverage(Beverage b) {
		beverageList.add(b);
	}


	
    
}

