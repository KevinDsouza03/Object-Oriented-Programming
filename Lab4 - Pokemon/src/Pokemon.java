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
		for (int i = 0; i < 4; i++) {
			attkList.add(atkL.get(i));// = new Attack(atkL[i].getAttack(),atkL[i].getPPCost(),atkL[i].getType(),atkL[i].getDamage());
		}
	}
	
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
