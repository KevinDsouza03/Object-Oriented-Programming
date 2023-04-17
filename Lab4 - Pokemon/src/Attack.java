
public class Attack {

	/***
	 * the three variables that represent an attack in pokemon.
	 * types class will be implemented to represent its
	 * super-effective and less-effective.
	 */
	private String Attack;
	private int ppCost;
	private Type type;
	private int baseDamage;
	
	/***
	 * Constructor for our Attack class. This should be all to represent what we need
	 * @param name
	 * @param ppc
	 * @param t
	 * @param bD
	 */
	public Attack(String name, int ppc, Type t , int bD) {
		Attack = name;
		ppCost = ppc;
		type = t;
		baseDamage = bD;
	}
	/***
	 * Accessors
	 */
	/***
	 * returns Attk name
	 * @return
	 */
	public String getAttack() {return Attack; }
	/***
	 * returns pp cost of attack, updates in PP
	 * @return
	 */
	public int getPPCost() {return ppCost;}
	/***
	 * returns type of attack, used for superEffective
	 * @return
	 */
	public Type getType() {return type.getType();}
	/***
	 * gets basedmg, more for display purposes
	 * @return
	 */
	public int getDamage() {return baseDamage;}
	
	
}
