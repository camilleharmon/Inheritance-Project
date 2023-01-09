
public class Platypus extends Mammal{
	
	protected Platypus(String n, String f) {
		
		name = n;
		food = f;
		
	}
	
	public void noise() {
		
		System.out.println(name + " makes an aggravated purr");
	}
}
