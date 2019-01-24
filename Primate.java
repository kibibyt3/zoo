public class Primate extends Animal{
	private boolean tailCurls;
	
	public Primate(String baseColor, double weight, int age, boolean hasTail, boolean tailCurls){
		super(4, baseColor, weight, age, hasTail);
		this.tailCurls = tailCurls;
	}

	@Override
	public String move(){
		return hasTail
			? "ah swang"
			: "ah walk";
	}

	@Override
	public String eat(){
		return "banananana";
	}

	@Override
	public String doSomething(){
		return "*is confused*";
	}

	public String beLoud(){
		return "screee";
	}

	public boolean canLasso(){
		return hasTail && tailCurls;
	}

	public String toString(){
		return "Monkey: [" +
				"tailCurls: " + tailCurls +
			" ]" +
			super.toString();
	}
}
