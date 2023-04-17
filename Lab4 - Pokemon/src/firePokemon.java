import java.util.List;

public class firePokemon extends Pokemon{
	/***
	 * name describes the pokemon. such as Arcanine, or Charmander for fire
	 */
	private String name;
	public firePokemon(int hp,int pp, Type t, List<Attack> atkL,String N) {
		super(hp,pp,t,atkL);
		name = N;
	}

	@Override
	/***
	 * all to attack and display to user, when the fire pokemon attacks
	 */
	public void attack(Pokemon other, int attackIndex) {
		Attack temp = super.getAttkList(attackIndex);
		if (super.getPP() < temp.getPPCost()) {
			System.out.println("You need to use a cheaper move! Lost Turn");
		}
		else {
			System.out.println(name + ", use " + temp.getAttack() + "!");
			double multiplier = other.getType().isSuperEffective(temp.getType());
			double damage = temp.getDamage() * multiplier;
			if (multiplier < 1) {System.out.println("Not Very Effective.");}
			else if(multiplier > 1) {System.out.println("Super Effective!");}
			other.updateHP(damage); // always damaging enemy pokemon
			this.updatePP(temp.getPPCost());
		}
	}

	@Override
	public void speak() {
		//cry for pokemon
		System.out.println("Arcanine!!!");
	}

	public String getName() {return name;}
}
