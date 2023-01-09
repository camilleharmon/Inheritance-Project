import java.util.*;

public class Runner {

	static ArrayList <Animal> zoo = new ArrayList<Animal>();
	static Animal perry = new Platypus("Perry the Platypus", "Stinky Cheese"); 
	
	public static void main(String[] args) {
		
		Animal.makeLunch();
		buildZoo();
		printZoo();
	}
	
	public static void buildZoo() {
		
		zoo.add(new Penguin("Mr. Bubbles", "Fish n' Chips"));
		zoo.add(new Bat("I've Gone Batty", "Bugaronni & Cheese"));
		zoo.add(new Tiger("T.I.G.E.R", "Socks"));
	}
	
	public static void printZoo() {
		
		for(int i = 0; i < zoo.size(); i++) {
			
			zoo.get(i).eats();
			zoo.get(i).noise();
			Animal.makeLunch();
		}
		
		System.out.print(perry.getName() + " is a: ");
		((Animal)perry).bearsYoung();
	}
}
