
public class Penguin extends Burd{
	
	protected Penguin(String n, String f) {
		
		name = n;
		food = f;
		
	}
	
	public void noise() {
		
		System.out.println(name + " shouts 'WHERE'S MY MONEY?!'");
	}
}
