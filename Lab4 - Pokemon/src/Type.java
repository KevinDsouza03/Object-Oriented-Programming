/***
 * 
 * @author dsouz
 * enum since we know all possible element vals and they shoulnt change per move/pokemon
 * by default, all is private
 */
enum Type {
		BUG("Bug"), DRAGON("Dragon"), ELECTRIC("Electric"), 
		FIGHTING("Fighting"), FIRE("Fire"),
		FLYING("Flying"), GHOST("Ghost"), 
		GRASS("Grass"), GROUND("Ground"), ICE("Ice"), 
		NORMAL("Normal"), POISON("Posion"), 
		PSYCHIC("Psychic"), ROCK("Rock"), WATER("Water");	
	
		String element;
		
		Type(String label) {
			this.element = label;
		}
		//public accessor for type
		public Type getType() {return this;}
		/***
		 * is super effective against MYSELF
		 * checks the given multipler for damage
		 * @param this
		 * @return multiplier/double
		 */
		public double isSuperEffective(Type defender) {
			switch (defender) { //case = me; move = them.
			case BUG: if(this == GRASS || this == POISON || this == PSYCHIC) return 2; 
				if (this == FIRE || this == FLYING || this == ROCK) return .5;
				return 1;
			case DRAGON: return 1;
			case ELECTRIC: if (this == FLYING || this == WATER) return 2;
				if (this == ELECTRIC || this == GRASS || this == PSYCHIC) return .5;
				if (this == GROUND) {return 0;}
				return 1;
			case FIGHTING: if (this == ICE || this == NORMAL || this == ROCK) return 2;
				if (this == FLYING || this == PSYCHIC) return .5;
				if (this == GHOST) return 0;
				return 1;
			case FIRE: if (this == BUG || this == GRASS || this == ICE) return 2;
				if (this == ROCK || this == WATER) return .5;
				return 1;
			case FLYING: if (this == BUG || this == FIGHTING || this == GRASS) return 2;
				if (this == ELECTRIC || this == ROCK) return .5;
				return 1;
			case GHOST: if (this == NORMAL || this == PSYCHIC) return 0;
				return 1;
			case GRASS: if (this == GROUND || this == ROCK || this == WATER) return 2;
				if (this == BUG || this == FIRE || this == FLYING || this == GRASS || this == POISON) return .5;
				return 1;
			case GROUND: if (this == ELECTRIC || this == FIRE || this == POISON || this == ROCK) return 2;
				if(this == GRASS) return .5;
				if (this == FLYING) return 0;
				return 1;
			case ICE: if (this == DRAGON || this == FLYING || this == GRASS || this == GROUND) return 2;
				if (this == ICE || this == WATER) return .5;
				return 1;
			case NORMAL: if (this== GHOST) return 0;
				return 1;
			case POISON: if(this == BUG || this == GRASS) return 2;
				if (this == GROUND || this == POISON || this == ROCK) return .5;
				return 1;
			case PSYCHIC: if (this == FIGHTING || this == POISON) return 2;
				if (this == PSYCHIC) return .5;
				return 1;
			case ROCK: if (this == BUG || this == FIRE || this == FLYING || this == ICE) return 2;
				if (this == FIGHTING || this == ROCK) return .5;
				return 1;
			case WATER: if (this == FIRE || this == GROUND || this == ROCK) return 2;
				if (this == GRASS || this == ICE) return .5;
				return 1;
				
		}
			return 1;
	}
}