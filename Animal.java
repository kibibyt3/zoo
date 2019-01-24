public abstract class Animal{
	protected int limbs;
	private String baseColor;
	private double weight;
	private int age;
	protected boolean hasTail;

	public Animal(int limbs, String baseColor, double weight, int age, boolean hasTail){
		this.limbs = limbs;
		this.baseColor = baseColor;
		this.weight = weight;
		this.age = age;
		this.hasTail = hasTail;
	}

	public abstract String move();

	public abstract String eat();

	public abstract String doSomething();

	public String sleep(){
		return "ZZZZzzzz";
	}
}
