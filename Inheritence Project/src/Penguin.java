
public class Penguin extends Burd{

//	public Penguin(String n, String f) {
//		super(n, f);
//		
//	}
	
	protected Penguin(String n, String f) {
		
		name = n;
		food = f;
		
	}
	
	public void noise() {
		
		System.out.println(name + " shouts 'WHERE'S MY MONEY?!'");
	}
}
