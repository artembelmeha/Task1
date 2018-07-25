import javax.swing.text.AbstractDocument.LeafElement;

public class Cat {
	private String name;
	private int age;
	private double weight;
	private double length;
	private double power;
	private String color;
	
	
	public Cat(String name, int age, double weight,double length, String color) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.color = color;
		this.length = length;
		this.power = weight*length;
	}
	public Cat () {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = getLength()*getWeight();
		this.power = power;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
		
	public void voice() {
		System.out.println("МЯУ-МЯУ"); 
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", weight=" + weight + ", length=" + length + ", power=" + power
				+ ", color=" + color + "]";
	}
	public void catsFight(Cat cat) {
		
		if (this.getPower() >cat.getPower()) System.out.println(this.getName()+" VS "+
					cat.getName()+" winner is: " +this.getName());
			else if (this.getPower() <cat.getPower()) System.out.println(this.getName()+
					" VS "+cat.getName()+" winner is: " +cat.getName());	
			else System.out.println(this.getName()+" VS "+cat.getName()+
					" winner is: no winner (same power");	
		
	}
	
}
