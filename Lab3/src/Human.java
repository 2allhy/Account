public class Human implements Valuable {
	private String name;
	private int age;
	
	public Human(String name, int age){
		this.name=name;
		this.age=age;
	}
	public double EstimateValue(int month){
		return Double.POSITIVE_INFINITY;   //������ ��ġ
	}
	public double EstimateValue(){
		return Double.POSITIVE_INFINITY;   //������ ��ġ
	}
	public String toString(){
		return String.format("Human name: %s\nregistered name: %d", name,age);
	}
}


