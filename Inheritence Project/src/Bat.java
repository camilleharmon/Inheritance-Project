
public class Bat extends Mammal{
	
	protected Bat(String n, String f) {
		
		name = n;
		food = f;
		
	}

	public void noise() {
		
		System.out.println(name + " lets out an unearthly skreech, but Batman does not respond :(");
	}

}
