import java.util.Random;

public class ComputerPlayer extends Player{
	private String name;
	private boolean hasRan;
	public ComputerPlayer(Pokemon p, Item i, String n) {
		super(p,i);
		name = n;
		hasRan = false;
	}
	@Override
	public void run() {
		
		System.out.println("Trainer " + name + " escaped!");
		hasRan = true;
	}
	
	public void printer() {
		System.out.println(name + ":");
		System.out.println("Health Remaining: " + super.getPartyMember().getHP());
	}
	/***
	 * random Action generator for compPlayer
	 * can choose run, useitem ,or attack
	 * @param other
	 */
	public void randAction(Pokemon other) {
		Random temp = new Random();
		int index = temp.nextInt(6);
		if (index == 4) {
			getItem().use(getPartyMember());
		}
		else if (index == 5) {
			run();	
		}
		else {
			this.getPartyMember().attack(other,index % 4);
		}
	}
	
	public String getName() {return name;}
	public boolean getRan() {return hasRan;}
	
}
