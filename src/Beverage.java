
public class Beverage {

private String origin;
private String brand; 
private String name;
private boolean veganFriendly;
private double pricePerPack; 
private int quantityPerPack;
private NutrionalInfo nutritionInfo;

public Beverage(String o,String b, String n,boolean v,double p, int q, NutrionalInfo caramelLatteNI)
{
	this.origin = o;
	brand = b;
	name = n;
	veganFriendly = v;
	pricePerPack = p;
	quantityPerPack = q;
	nutritionInfo = caramelLatteNI;
}

public String getName() {
	// TODO Auto-generated method stub
	return name;
}

public String getBrand() {
	// TODO Auto-generated method stub
	return brand;
}

public String getOrigin() {
	return origin;
}

public boolean isVeganFriendly() {
	return veganFriendly;
}

public double getPricePerPack() {
	return pricePerPack;
}

public int getQuantityPerPack() {
	return quantityPerPack;
}

public NutrionalInfo getNutritionInfo() {
	return nutritionInfo;
}

public boolean getVeganStatus() {
	// TODO Auto-generated method stub
	return veganFriendly;
}
}
