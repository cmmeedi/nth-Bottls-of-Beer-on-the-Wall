package bOnTheW;

public class Main {
	
	public static void main(String [] args) {
		int x = 99;
		String beers = " Bottles of beer on the wall";		
		
		while(x > 0) {
			if(x == 1) {
				beers = " Bottle of beer on the wall";
				System.out.println(x + beers);
				System.out.println(x + " Bottle of Beer");
				System.out.println("It's empty!");
				x--;
			}
			else {
				if(x > 0) {
					System.out.println(x + beers);
					System.out.println(x + " Bottles of beer");
					System.out.println("Take one down, Pass it around");
					x--;
					System.out.println(x + beers);
				}
			}

		} 
	}
}
