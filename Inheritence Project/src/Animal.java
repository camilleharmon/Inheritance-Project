
public abstract class Animal {

	protected String name;
	protected String food;
	static String yummy = "";

	public static void makeLunch() {
	
		int num = (int)(Math.random() * 9) + 1;	
		if(num == 1) {
			
			yummy = "a good pizza";
		}else if(num == 2) {
			
			yummy = "a shot of vodka";
		}else if(num == 3) {
			
			yummy = "tacos";
		}else if(num == 4) {
			
			yummy = "bebe carrots";
		}else if(num == 5) {
			
			yummy = "yo mama's homemade cake";
		}else if(num == 6) {
			
			yummy = "chicken tendys";
		}else if(num == 7) {
			
			yummy = "the Blood of the Innocent";
		}else if(num == 8) {
			
			yummy = "Whoopie Pie";
		}else if(num == 9) {
			
			yummy = "Jellooooooooooooooooooooooooooooooooooo";
		}else if(num == 10) {
			
			yummy = "Squidasta";
		}
	}
	
//	public Animal(String n, String f) {
//		
//		n = name;
//		f = food;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	protected abstract void bearsYoung();
	
	protected abstract void noise();
	
	public void eats() {
		
		System.out.println(name + " eats " + food + " but he could also go for " + yummy + ".");
	}
	
	
}
