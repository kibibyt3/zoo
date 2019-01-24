import java.util.ArrayList;

public class AnimalTester{

	public static void main(String args[]){
		ArrayList<Animal> zooAnimals = new ArrayList<>();

		zooAnimals.add(new Primate("poiple", 130, 2, false, false));
		zooAnimals.add(new Primate("poiple", 130, 2, false, false));
		zooAnimals.add(new Eagle("also purple", 140, 5, 300));
		zooAnimals.add(new Elephant("very purple", 190000, 3));
		zooAnimals.add(new Alligator("white", 200, 90, 3000));

		for (Animal animal: zooAnimals){
			System.out.println(animal);
			System.out.println(animal.eat());
			System.out.println(animal.move());
			System.out.println(animal.doSomething());
			System.out.println(animal.sleep());
			if (animal instanceof Primate){
				System.out.println(((Primate)animal).canLasso());
			}
		}

		System.out.println("Animal 1 and 2 are the same: " + zooAnimals.get(0).equals(zooAnimals.get(1)));
	}
}

