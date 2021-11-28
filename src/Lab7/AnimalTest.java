package Lab7;

public class AnimalTest {
	//Driver class
	public static void main(String[] args) 
	{
		//Instantiate  ve1 object 
		Vet ve1 = new Vet ("Adam Czaplewski");
		//Instantiate dog object 
		Animal dog = new Dog("Poodle", 4, 'M');
		System.out.println(dog);
		dog.eat();
		dog.sleep();
		dog.makeSound();
		
		System.out.println();
		//Instantiate cat object
		Animal cat = new Cat("Tom", 2, 'F');
		System.out.println(cat);
		cat.eat();
		cat.sleep();
		cat.makeSound();

		System.out.println();
		//Calling vaccinate method on the object
		ve1.Vaccinate(cat);
		ve1.Vaccinate(dog);
	}

}
