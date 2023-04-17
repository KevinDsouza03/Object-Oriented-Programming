import java.util.ArrayList;
import java.util.List;
/***
 * 
 * @author dsouz
 *
 */
public abstract class Pokemon { //implement my methods, i give you some
	private int healthPoints;
	private int powerPoints;
	private Type type;
	private List<Attack> attkList;
	
	/***
	 * Constructor
	 * @param hp
	 * @param pp
	 * @param t
	 * @param atkL
	 */
	public Pokemon(int hp,int pp, Type t, List<Attack> atkL) {
		healthPoints = hp;
		powerPoints = pp;
		type = t;
		attkList = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			attkList.add(atkL.get(i));// = new Attack(atkL[i].getAttack(),atkL[i].getPPCost(),atkL[i].getType(),atkL[i].getDamage());
		}
	}
	/***
	 * get hp for updating
	 * @return
	 */
	public int getHP() {
		return healthPoints;
	}
	/***
	 * can pass damage as a + if attacking, else item such as healing, -
	 * @param damage
	 */
	public void updateHP(double damage) {
		healthPoints -= damage;
	}	
	/***
	 * must update for moves. no unlimited ammo
	 * @return
	 */
	public int getPP() {
		return powerPoints;
	}
	/***
	 * pp will always be int no fractions. same logic as other update
	 * @param pp
	 */
	public void updatePP(int pp) {
		powerPoints -= pp;
	}
	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}
	/**
	 * @return the attkList
	 */
	public Attack getAttkList(int index) {
		return attkList.get(index);
	}
	/**
	 * @param attkList the attkList to set
	 */
	/***
	 * abstract method attack
	 * @param other = represents other Pokemon to battle
	 * @param attackIndex = what move to use.
	 */
	public abstract void attack(Pokemon other, int attackIndex);
	public abstract void speak();
	/***
	 * speak = pikachu! the call which is just their name.
	 */
}
