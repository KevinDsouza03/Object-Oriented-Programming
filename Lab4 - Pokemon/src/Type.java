/***
 * 
 * @author dsouz
 * enum since we know all possible element vals and they shoulnt change per move/pokemon
 * by default, all is private
 */
enum Type {
		Bug("Bug"), Dragon("Dragon"), Electric("Electric"), 
		Fighting("Fighting"), Fire("Fire"),
		Flying("Flying"), Ghost("Ghost"), 
		Grass("Grass"), Ground("Ground"), Ice("Ice"), 
		Normal("Normal"), Poison("Posion"), 
		Psychic("Psychic"), Rock("Rock"), Water("Water");	
	
		String element;
		
		Type(String label) {
			this.element = label;
		}
		//public accessor for type
		public String getType() {return element;}
	}
