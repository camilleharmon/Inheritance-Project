
public class Tiger extends Mammal{
	
	protected Tiger(String n, String f) {
		
		name = n;
		food = f;
		
	}
	
	public void noise() {
		
		super.noise();
		System.out.println(name + " makes an aggravated purr");
	}
}