public class Elephant extends Animal{
	private boolean hasTusks;

	public Elephant(String baseColor, double weight, int age){
		super(4, baseColor, weight, age, true);
		this.hasTusks = hasTusks;
	}

	public String move(){
		return "walk slow but not too slow if it's all the same to u";
	}

	public String eat(){
		return "the literal entire world";
	}

	public String doSomething(){
		return "*dies but not on the outside*";
	}

	public String toString(){
		return "Elephant: [" +
			" hasTusks: " + hasTusks +
		" ]" +
		super.toString();
	}
}
