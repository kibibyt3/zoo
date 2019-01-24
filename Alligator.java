public class Alligator extends Animal{

	private boolean coldBlooded = true;
	private int numScales;

	public Alligator(String baseColor, double weight, int age, int numScales){
		super(4, baseColor, weight, age, true);
		this.numScales = numScales;
	}

	@Override
	public String move(){
		return "spiderman crawl";
	}

	@Override
	public String eat(){
		return "flesh of the innocent";
	}

	@Override
	public String doSomething(){
		return "be lazy in the water";
	}

}
