package bOnTheW;

public class Main {
	
	public static void main(String [] args) {
		//An int variable to determine the number of bottles of beer
		int x = 99;
		//A string variable to out print the lyrics to the song
		String beers = " Bottles of beer on the wall";		
		
		//A while loop testing whether or not x is less then 0
		while(x > 0) {
			//and if loop testing whether or not x is equivalent to one
			if(x == 1) {
				//reassigning the beers variable to out print " Bottle of beer on the wall" instead of " Bottles of beer on the wall"
				beers = " Bottle of beer on the wall";
				//then out printing the lyrics as usual
				System.out.println(x + beers);
				System.out.println(x + " Bottle of Beer");
				System.out.println("It's empty!");
				//Decrementing x for the last time
				x--;
			}
			//An else statement ran when x is not equivalent to 1
			else {
				//The outprint of the lyrics to 99 bottles of beer on the wall
					System.out.println(x + beers);
					System.out.println(x + " Bottles of beer");
					System.out.println("Take one down, Pass it around");
				//Decrementation of x
					x--;
				//"nth Bottles of beer on the wall" using concatenation
					System.out.println(x + beers);
			}

		} 
	}
}
