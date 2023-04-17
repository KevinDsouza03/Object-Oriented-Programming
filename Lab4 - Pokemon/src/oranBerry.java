
public class oranBerry implements Item{
	private boolean used;
	/***
	 * used is to keep track of if our berry was used in this battle
	 */
	private int heal;
	public oranBerry() {
		heal = 10;
		used = false;
	}

	@Override
	/***
	 * use item as defined and for specific item
	 */
	public void use(Pokemon p) {
		if (used == false) {
			used = true;
			System.out.println("Use Oran Berry!");
			p.updateHP(-heal);
			System.out.println("Healed "+ heal + " hp!  " + p.getHP());
		}
		else {
			System.out.println("All out of items!");
		} //ensure no double dipping, and punished by lost move
	}

	public boolean used() {return used;}
 }
