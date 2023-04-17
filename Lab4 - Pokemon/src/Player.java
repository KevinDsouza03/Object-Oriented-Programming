public abstract class Player{ 

	private Pokemon partyMember; //pokemon will be a type such as ElectricPokemon
	private Item item;
	public Player(Pokemon p, Item i) {
		partyMember = p;
		item = i;
	}
	
	/**
	 * @return the partyMember
	 */
	public Pokemon getPartyMember() {
		return partyMember;
	}
	/***
	 * Makes printing the values of each player easier. Mostly used for player class, but could be used for comp as well
	 */
	public void printer() {
		System.out.println("\t HP: " + partyMember.getHP() + "\t PP: " + partyMember.getPP());
		System.out.println("\t Moves: ");
		for (int i = 0; i < 4; i++) {
			System.out.println("\t"+ i + "." + partyMember.getAttkList(i).getAttack() + "\t Damage " + 
					partyMember.getAttkList(i).getDamage() + "\t PP: "+ partyMember.getAttkList(i).getPPCost()
					+ " "+ partyMember.getAttkList(i).getType());
		}
	}
	/**
	 * @return the item
	 */
	public Item getItem() {
		return item;
	}

	
	public abstract void run();
	
}
