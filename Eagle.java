public class Eagle extends Animal{
	private int wingSpan;

	public Eagle(String baseColor, double weight, int age, int wingSpan){
		super(2, baseColor, weight, age, true);
		this.wingSpan = wingSpan;
	}

	public String move(){
		return "i just fly and frankly i have a quadruple phd in orb study and what u have is disrespect i know what i'm talking about";
	}

	public String eat(){
		return "something i dunno";
	}

	public String doSomething(){
		return "*dances aggressively*";
	}

}
