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
		public String getType() {return element;}
		//isSupereffective()
		public double isSuperEffective(Type defender) {
			switch (this) { //asking is my move SE or NE
			case BUG: if(defender == GRASS || defender == POISON || defender == PSYCHIC) return 1.5; 
				if (defender == FIRE || defender == FLYING || defender == ROCK) return .5;
				return 1;
			case DRAGON: return 1;
			case ELECTRIC: if (defender == FLYING || defender == WATER) return 1.5;
				if (defender == ELECTRIC || defender == GRASS || defender == PSYCHIC) return .5;
				if (defender == GROUND) {return 0;}
				return 1;
			case FIGHTING: if (defender == ICE || defender == NORMAL || defender == ROCK) return 1.5;
				if (defender == FLYING || defender == PSYCHIC) return .5;
				if (defender == GHOST) return 0;
				return 1;
			case FIRE: if (defender == BUG || defender == GRASS || defender == ICE) return 1.5;
				if (defender == ROCK || defender == WATER) return .5;
				return 1;
			case FLYING: if (defender == BUG || defender == FIGHTING || defender == GRASS) return 1.5;
				if (defender == ELECTRIC || defender == ROCK) return .5;
				return 1;
			case GHOST: if (defender == NORMAL || defender == PSYCHIC) return 0;
				return 1;
			case GRASS: if (defender == GROUND || defender == ROCK || defender == WATER) return 1.5;
				if (defender == BUG || defender == FIRE || defender == FLYING || defender == GRASS || defender == POISON) return .5;
				return 1;
			case GROUND: if (defender == ELECTRIC || defender == FIRE || defender == POISON || defender == ROCK) return 1.5;
				if(defender == GRASS) return .5;
				if (defender == FLYING) return 0;
				return 1;
			case ICE: if (defender == DRAGON || defender == FLYING || defender == GRASS || defender == GROUND) return 1.5;
				if (defender == ICE || defender == WATER) return .5;
				return 1;
			case NORMAL: if (defender== GHOST) return 0;
				return 1;
			case POISON: if(defender == BUG || defender == GRASS) return 1.5;
				if (defender == GROUND || defender == POISON || defender == ROCK) return .5;
				return 1;
			case PSYCHIC: if (defender == FIGHTING || defender == POISON) return 1.5;
				if (defender == PSYCHIC) return .5;
				return 1;
			case ROCK: if (defender == BUG || defender == FIRE || defender == FLYING || defender == ICE) return 1.5;
				if (defender == FIGHTING || defender == ROCK) return .5;
				return 1;
			case WATER: if (defender == FIRE || defender == GROUND || defender == ROCK) return 1.5;
				if (defender == GRASS || defender == ICE) return .5;
				return 1;
				
		}
	}
