import java.util.List;

public class fightingPokemon extends Pokemon{
	private String name;
	public fightingPokemon(int hp,int pp, Type t, List<Attack> atkL,String N) {
		// TODO Auto-generated constructor stub
		super(hp,pp,t,atkL);
		name = N;
		
	}
	@Override
	/***
	 * similar to firePokemon attack.
	 */
	public void attack(Pokemon other, int attackIndex) {
		// TODO Auto-generated method stub
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
		System.out.println(name + "!!!");
	}
	
	public String getName() {return name;}


}
