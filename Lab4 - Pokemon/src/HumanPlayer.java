import java.util.Random;

public class HumanPlayer extends Player{
	private String name;
	private boolean hasRan;
	/***
	 * hasRan is used for the run tracker so we can properly escape a fight
	 * @param p
	 * @param i
	 * @param n
	 */
	public HumanPlayer(Pokemon p, Item i,String n) {
		super(p,i);
		name = n;
		hasRan = false;
	}

	@Override
	public void run() {
		Random rNum = new Random();
		int number = rNum.nextInt(50);
		if (number % 2 == 0) {
			hasRan = true;
			System.out.println(name + " successfully ran away!");
		}
		else {
			System.out.println("Couldn't escape!");
		}
	}
	public void printer() {
		System.out.println(name + ":");
		super.printer();
	}
	
	public String getName() {return name;}
	
	public boolean getRan() {return hasRan;}
}
