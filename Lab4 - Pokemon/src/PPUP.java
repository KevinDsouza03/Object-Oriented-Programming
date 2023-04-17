
public class PPUP implements Item{
	private int amount;
	/***
	 * these are constant items so they do not need to be updated via 
	 * user
	 */
	public PPUP() {
		amount = 15;
	}
	@Override
	public void use(Pokemon p) {
			if (amount == 0) { //update amount to 0 if we already used it
				System.out.println("Item already used.");
				return;
			}
			System.out.println("Use PP Up!");
			p.updatePP(-amount);
			amount = 0;
			System.out.println("PP was restored! " + p.getPP());
			
	}
	

}
