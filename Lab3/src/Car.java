public class Car implements Valuable{
		private String name;
		private double price;
		private double value;
	
	public Car(String name, double price){
		this.name =name;
		this.price=price;
	}
	public double EstimateValue(int month){
		value=price*0.8*Math.pow(0.99,month);
		return value;
	}
	public double EstimateValue(){
		value=price*0.8*0.99;
		return value;
	}
	
	public String toString(){
		return String.format("Car name: %s\ninitial price: %.2f", name,price);
	}
}
